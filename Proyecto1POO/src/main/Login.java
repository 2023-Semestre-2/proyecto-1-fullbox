package main;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.nio.file.*;
import java.util.Arrays;
import Classes.*;
import Classes.VerifyUsers;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import views.Register;
import views.ScreenLogin;


/**
 * Login Screen Class
 * @author saymon
 */
public class Login extends javax.swing.JFrame {
    public static JPanel LoginPanel;
    private static JPanel RegisterPanel;
    
    public Login() {
        initComponents();
        main_class.main_users(new String[]{});
        loading_users();
        setIconImage(new ImageIcon(getClass().getResource("../img/boxx.png")).getImage());
        LoginPanel = new ScreenLogin();
        RegisterPanel = new Register();
        
        ShowJPanel(LoginPanel);
        ShowJPanel(RegisterPanel);
        RegisterPanel.setVisible(false);
        LoginPanel.setVisible(true);
    }

    public static void showRegisterPanel() {
        RegisterPanel.setVisible(true);
    }
    public static void hideRegisterPanel() {
        RegisterPanel.setVisible(false);
    
    }
    public static void showLoginPanel() {
        LoginPanel.setVisible(true);
    }
    
    public static void hideLoginPanel() {
        LoginPanel.setVisible(false);
    }
    
    private boolean passwordVisible = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FullBox - Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ellipse 2092.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void loading_users(){
        String archive = Paths.get("src", "DataBase", "usuarios.csv").toString();
        FileReader fr = null;
        BufferedReader br = null;
        Boolean bandera = false;
        
        try{
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                register_users user = new register_users();
                String array [] = line.split("\\,");
                if (array.length == 3){
                    user.setUsername(array[0]);
                    user.setPassword(array[1]);
                    user.setRemember(Boolean.parseBoolean(array[2]));
                    main_class.users.add(user);
                    bandera =true;                     
                }              
            }
            if (bandera){
                System.out.println("Importado exitosamente");    
            }else{
                 JOptionPane.showMessageDialog(this,"Fatal Error: Importation");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally{
            try{
                if(fr != null){
                    fr.close();
            }
            }catch(Exception ex){
                    ex.printStackTrace();
            }      
        }
    }     
    
    public void ShowJPanel(JPanel p){

        p.setSize(450, 490);
        p.setLocation(440,110);
        
        jPanel1.add(p, new AbsoluteConstraints(440, 110, 450, 490));
        jPanel1.setComponentZOrder(p, 0);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
        /**
    * Eye button to show password or hide it on the login screen
    * @author saymon
    *  
    */ 
    
        /**
    * Registration panel
    * @author saymon
    *  
    */ 
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
