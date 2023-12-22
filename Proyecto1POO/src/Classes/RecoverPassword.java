/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
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
        String recoveryCode = generateRecoveryCode();
        sendRecoveryEmail(username, recoveryCode);
        JOptionPane.showMessageDialog(null, "A recovery code has been sent to your email. Please check it.");
        String enteredCode = JOptionPane.showInputDialog(null, "Enter the recovery code:");

        if (enteredCode != null && enteredCode.equals(recoveryCode)) {
            JOptionPane.showMessageDialog(null, "Code is correct. Now you can change your password.");
            for (register_users U:main_class.users){
                if (U.getUsername().equals(username)) {
                String newPassword = JOptionPane.showInputDialog(null, "Enter the password:");
                U.setPassword(newPassword);
               }
            }  
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect code. Password recovery has failed.");
        }
    }
    
    private static String generateRecoveryCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }

    private static void sendRecoveryEmail(String username, String recoveryCode) {
        final String senderEmail = "FullBoxRecovery@gmail.com";
        final String senderPassword = "PasswordSupportFullBox2023";
        final String recipientEmail = "recipientemail@gmail.com";

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
