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
import javax.swing.JPanel;
import views.Register;

public class Login extends javax.swing.JFrame {
    
    
    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../img/boxx.png")).getImage());
        
    }
    
    private boolean passwordVisible = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PasswordText = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FullBox - Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(84, 110, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Avatar_Container.png"))); // NOI18N
        jLabel9.setText("jLabel5");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 450, -1));

        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 80, 87));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, -1));

        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        jPanel2.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(73, 80, 87));
        jCheckBox1.setText("Remember me");
        jCheckBox1.setBorder(null);
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 140, -1));

        jButton1.setBackground(new java.awt.Color(85, 110, 230));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log In");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 390, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo-cerrado.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 30, 20));

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 80, 87));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, -1));

        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });
        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextKeyPressed(evt);
            }
        });
        jPanel2.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lock.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 20, -1));

        jButton2.setForeground(new java.awt.Color(116, 120, 141));
        jButton2.setText("Forgot your password?");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 190, 20));

        jLabel3.setForeground(new java.awt.Color(73, 80, 87));
        jLabel3.setText("Don’t have an account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jButton3.setForeground(new java.awt.Color(85, 110, 230));
        jButton3.setText("Signup now");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel4.setBackground(new java.awt.Color(58, 61, 65));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Card_Content.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, -1));

        jLabel11.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcome Back !!");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sign in to continue");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, -1));

        jTextField3.setText("jTextField3");
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 450, 490));

        jPanel1.setBackground(new java.awt.Color(244, 243, 243));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 80, 87));
        jLabel10.setText("© 2023 Crafted and designed by FullBox.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 610, 210, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union3.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1280, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ellipse 2092.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void loading_archive_products(){
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_PRODUCTS.csv").toString();
        FileReader fr = null;
        BufferedReader br = null;
        Boolean bandera = false;
        
        try{
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                product_class product = new product_class();
                String array [] = line.split("\\,");
                if (array.length == 2){
                    product.setId_category(Integer.parseInt(array[0]));
                    product.setName_product(array[1]);
                    main_class.products.add(product);
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
    private void loading_archive_ids(){
        String archive = Paths.get("src", "DataBase", "ID's.csv").toString();
        FileReader fr = null;
        BufferedReader br = null;
        Boolean bandera = false;
        
        try{
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                id_class id = new id_class();
                String array [] = line.split("\\,");
                if (array.length == 4){
                    id.setId_product(Integer.parseInt(array[0]));
                    id.setId_item(Integer.parseInt(array[1]));
                    id.setId_customer(Integer.parseInt(array[2]));
                    id.setId_maintenance(Integer.parseInt(array[3]));
                    main_class.ids.add(id);
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
        
    private void loading_archive_items(){    
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_ITEMS.csv").toString();
        System.out.println("Ruta del archivo: " + archive);
        FileReader fr = null;
        BufferedReader br = null;
        Boolean bandera = false;
        
        try{
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                item_class item = new item_class();
                String array [] = line.split("\\,");
                if (array.length == 8){
                    item.setId_item(Integer.parseInt(array[0]));
                    item.setCategory_item(array[1]);
                    item.setName_item(array[2]);
                    item.setType_item(array[3]);
                    item.setSize_item(Double.parseDouble(array[4]));
                    item.setBrand_item(array[5]);
                    item.setPrice_item(Integer.parseInt(array[6]));
                    item.setAmount_item(Integer.parseInt(array[7]));
                    main_class.items.add(item);
                    bandera = true;                     
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
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char[] passwordChar = PasswordText.getPassword();
        String passwordString = new String(passwordChar);
        String UsernameString = UsernameText.getText();
        Arrays.fill(passwordChar, ' ');
        if (UsernameString.isEmpty()) {
           JOptionPane.showMessageDialog(null,"Username/Password not found");
           UsernameText.requestFocus();
        } else {
            Boolean isCheck = jCheckBox1.isSelected();
            VerifyUsers verificador = new VerifyUsers(UsernameString, passwordString, isCheck);
            
            if(verificador.pass == true){
                this.setVisible(false);
                main_class.main_product(new String[]{});
                main_class.main_item(new String[]{});
                main_class.main_id(new String[]{});
                
                loading_archive_items();
                loading_archive_products();
                loading_archive_ids();
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void ShowJPanelRegister(JPanel p){
        p.setSize(450, 490);
        p.setLocation(440,110);
    }
    
    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Boton Mostrar contraseña
        togglePasswordVisibility();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void togglePasswordVisibility() {
        if (!passwordVisible) {
            // Mostrar contraseña
            jTextField3.setText(new String(PasswordText.getPassword()));
            PasswordText.setEchoChar((char) 0); // Mostrar texto original
            passwordVisible = true;
        } else {
            // Ocultar contraseña
            PasswordText.setEchoChar('*'); // Ocultar texto nuevamente
            passwordVisible = false;
        }
        if (!passwordVisible) {
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo-cerrado.png")));
        } else {
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo-visible.png")));
        }
    }
    
    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void PasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
        
    }//GEN-LAST:event_PasswordTextKeyPressed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setForeground(new Color(85,110,230));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setForeground(new Color(116,120,141));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setForeground(new Color(116,120,141));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setForeground(new Color(85,110,230));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ShowJPanelRegister(new Register());
    }//GEN-LAST:event_jButton3ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
