/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.util.Properties;
import java.util.Random;

/**
 * This class is responsible for carrying out the user's password recovery process.
 * @author saimo
 */
public class RecoverPassword {
    
    public static void recoverPassword() {
        String username = JOptionPane.showInputDialog(null, "Enter your username to recover the password:");
        if (username == null) {
        JOptionPane.showMessageDialog(null, "Password recovery canceled.");
        return;
        }
        String recoveryCode = generateRecoveryCode();
        String csvFilePath = Paths.get("src", "DataBase", "usuarios.csv").toString();
        JOptionPane.showMessageDialog(null, "Wait a moment we are verifying your username.");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if(data[0].equals(username)) {
                    JOptionPane.showMessageDialog(null, "Valid username, sending recovery email, wait a moment.");
                    String emailUser = data[3];
                    sendRecoveryEmail(username, recoveryCode, emailUser);
                    JOptionPane.showMessageDialog(null, "A recovery code has been sent to your email. Please check it.");
                    String enteredCode = JOptionPane.showInputDialog(null, "Enter the recovery code:");
                    if (enteredCode != null && enteredCode.equals(recoveryCode)) {
                        JOptionPane.showMessageDialog(null, "Code is correct. Now you can change your password.");
                        for (register_users U:main_class.users){
                            if (U.getUsername().equals(username)) {
                            String newPassword = JOptionPane.showInputDialog(null, "Enter the password:");
                            U.setPassword(newPassword);
                            U.setRemember(false);
                            Add_user();
                            JOptionPane.showMessageDialog(null, "Password changed successfully.");
                            return;
                           }
                        }
                    } 
                    JOptionPane.showMessageDialog(null, "Incorrect code. Password recovery failed, please try again.");
                    return;
                } 
            }
            JOptionPane.showMessageDialog(null, "Username not found, please try again.");

        } catch (IOException e) {
           JOptionPane.showMessageDialog(null, "Username not found, please try again.");
        }    
        
    }
    
    private static void Add_user() {
        String archive = Paths.get("src", "DataBase", "usuarios.csv").toString();
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try{ 
            fw = new FileWriter(archive);
            pw = new PrintWriter(fw);
            for(register_users i: main_class.users){
                String line = i.getUsername() + "," + i.getPassword() + "," + i.getRemember() + "," + i.getRecoveryEmail();
                pw.println(line);
            }
            
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        finally{
            try{
                if(fw != null){
                    fw.close();
            }
            }catch(Exception ex){
                    ex.printStackTrace();
            }      
        }
    }
    
    private static String generateRecoveryCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }

    private static void sendRecoveryEmail(String username, String recoveryCode, String EmailUser) {
        final String senderEmail = "FullBoxRecovery@gmail.com";
        final String senderPassword = "peao gckj fatx subh";
        final String recipientEmail = EmailUser;

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("Password Recovery Code");

            String content = "Hello " + username + ",\n\n"
                    + "Your password recovery code is: " + recoveryCode + "\n\n"
                    + "This code will expire in 10 minutes.";
            message.setText(content);

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Recovery email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error sending the recovery email.");
        }
    }
}
