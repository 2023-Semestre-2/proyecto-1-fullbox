/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Classes.VerifyUsers;
import Classes.category_class;
import Classes.customer_class;
import Classes.id_class;
import Classes.item_class;
import Classes.main_class;
import Classes.maintenance_class;
import Classes.register_users;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import main.Login;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 * This is the login panel to enter the main program with the correct credentials
 * @author saimo
 */
public class ScreenLogin extends javax.swing.JPanel {
    private boolean passwordVisible = false;
    /**
     * Creates new form ScreenPanel
     */
    public ScreenLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        ButtonLogIn = new javax.swing.JButton();
        ButtonShowPassword = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PasswordText = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ButtonRegister = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(84, 110, 230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Avatar2-fondoBlanco-100.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 100, 110));

        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 80, 87));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));
        jPanel2.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 390, 40));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(73, 80, 87));
        jCheckBox1.setText("Remember me");
        jCheckBox1.setBorder(null);
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, -1));

        jLabel10.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 80, 87));
        jLabel10.setText("© 2023 Crafted and designed by FullBox.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 210, -1));

        ButtonLogIn.setBackground(new java.awt.Color(85, 110, 230));
        ButtonLogIn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLogIn.setText("Log In");
        ButtonLogIn.setBorder(null);
        ButtonLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLogInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLogInMouseExited(evt);
            }
        });
        ButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogInActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 390, 40));

        ButtonShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo-cerrado.png"))); // NOI18N
        ButtonShowPassword.setBorder(null);
        ButtonShowPassword.setContentAreaFilled(false);
        ButtonShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 30, 20));

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 80, 87));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 20, 20));

        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextKeyPressed(evt);
            }
        });
        jPanel2.add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 390, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lock.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 20, -1));

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
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 190, 20));

        jLabel3.setForeground(new java.awt.Color(73, 80, 87));
        jLabel3.setText("Don’t have an account?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        ButtonRegister.setForeground(new java.awt.Color(85, 110, 230));
        ButtonRegister.setText("Signup now");
        ButtonRegister.setBorder(null);
        ButtonRegister.setBorderPainted(false);
        ButtonRegister.setContentAreaFilled(false);
        ButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonRegisterMouseExited(evt);
            }
        });
        ButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel4.setBackground(new java.awt.Color(58, 61, 65));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Card_Content.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, -1));

        jLabel11.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcome Back !!");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sign in to continue");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        jTextField3.setText("jTextField3");
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 390, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * This method is created to give the logic to the show password or hide password button
     */
    private void togglePasswordVisibility() {
        if (!passwordVisible) {
            jTextField3.setText(new String(PasswordText.getPassword()));
            PasswordText.setEchoChar((char) 0);
            passwordVisible = true;
        } else {
            PasswordText.setEchoChar('*');
            passwordVisible = false;
        }
        if (!passwordVisible) {
            ButtonShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo-cerrado.png")));
        } else {
            ButtonShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ojo-visible.png")));
        }
    }

    /**
    * Load product files from csv database
    * @author saymon
    */
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
                category_class product = new category_class();
                String array [] = line.split("\\,");
                if (array.length == 2){
                    product.setCategory_id(Integer.parseInt(array[0]));
                    product.setCategory_name(array[1]);
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
    /**
    * Load users from csv database
    * @author saymon
    */
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
                //System.out.println("Imported successfully");    
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
    /**
    * Load ids from csv database
    * @author saymon
    */
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
                if (array.length == 6){
                    id.setId_product(Integer.parseInt(array[0]));
                    id.setId_item(Integer.parseInt(array[1]));
                    id.setId_customer(Integer.parseInt(array[2]));
                    id.setId_maintenance(Integer.parseInt(array[3]));
                    id.setId_bill(Integer.parseInt(array[4]));
                    id.setId_detail(Integer.parseInt(array[5]));
                    main_class.ids.add(id);
                    bandera =true;                     
                }              
            }
            if (bandera){
                //System.out.println("Imported successfully");    
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
    /**
    * Load items from csv database
    * @author saymon
    */
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
                //System.out.println("Imported successfully");    
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
    /**
    * Load customers from csv database
    * @author saymon
    */
    private void loading_archive_customers(){    
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_Customers.csv").toString();
        FileReader fr = null;
        BufferedReader br = null;
        Boolean bandera = false;
        
        try{
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                customer_class customer = new customer_class();
                String array [] = line.split("\\,");
                if (array.length == 11){
                    
                    customer.setCustomer_id(Integer.parseInt(array[0]));
                    customer.setCustomer_name(array[1]);
                    customer.setCustomer_lastname(array[2]);
                    customer.setCustomer_phone(Integer.parseInt(array[3]));
                    customer.setCustomer_email(array[4]);
                    customer.setCustomer_province(array[5]);
                    customer.setCustomer_canton(array[6]);
                    customer.setCustomer_district(array[7]);
                    int year  = Integer.parseInt(array[10]);
                    int month  = Integer.parseInt(array[9]);
                    int day  = Integer.parseInt(array[9]);
                    customer.setCustomer_birthdate(new Date(year-1900, month-1, day));
                    main_class.customers.add(customer);
                    bandera = true;                     
                }              
            }
            if (bandera){
                //System.out.println("Imported successfully");    
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
    /**
    * Load maintenance from csv database
    * @author saymon
    */
    private void loading_archive_maintenance(){
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_MAINTENANCE.csv").toString();
        FileReader fr = null;
        BufferedReader br = null;
        Boolean bandera = false;
        
        try{
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String line;
            
            while((line = br.readLine()) != null){
                maintenance_class service = new maintenance_class();
                String array [] = line.split("\\,");
                if (array.length == 9){
  
                    service.setService_id(Integer.parseInt(array[0]));
                    service.setCustomer_id(array[1]);
                    service.setBicycle_brand(array[2]);
                    service.setBicycle_description(array[3]);
                    service.setMaintenance_price(Integer.parseInt(array[4]));
                    String dateString5 = (String) array[5];
                    String dateString6 = (String) array[6];
                    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                    try {
                        Date receivedDate = dateFormat.parse(dateString5);
                        Date deliveryDate = dateFormat.parse(dateString6);
                        service.setReceived_date(receivedDate);
                        service.setDelivery_date(deliveryDate);
                    } catch (ParseException e) {
                        e.printStackTrace(); 
                    }
                    service.setMaintenance_observations(array[7]);
                    service.setMaintenance_state(array[8]);
                    main_class.maintenance.add(service);
                    bandera = true;                     
                }              
            }
            if (bandera){
                //System.out.println("Imported successfully");    
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
    //Button Animation
    private void ButtonLogInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogInMouseEntered
        
        ButtonLogIn.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_ButtonLogInMouseEntered
    //Button Animation
    private void ButtonLogInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogInMouseExited

        ButtonLogIn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ButtonLogInMouseExited
    /**
     * Logic of the login button that is responsible for verifying the username and password to allow entry to the main program
     * @param evt 
     */
    private void ButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogInActionPerformed
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
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
                currentFrame.dispose();
                main_class.main_product(new String[]{});
                main_class.main_item(new String[]{});
                main_class.main_id(new String[]{});
                main_class.main_customer(new String[]{});
                main_class.main_maintenance(new String[]{});
                
                loading_archive_items();
                loading_archive_products();
                loading_archive_ids();
                loading_archive_customers();
                loading_archive_maintenance();
            }
        }
    }//GEN-LAST:event_ButtonLogInActionPerformed

    private void ButtonShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowPasswordActionPerformed
        // Show password button
        togglePasswordVisibility();
    }//GEN-LAST:event_ButtonShowPasswordActionPerformed

    private void PasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyPressed
        // Click on the login button when you hit enter
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            ButtonLogIn.doClick();
        }
    }//GEN-LAST:event_PasswordTextKeyPressed
    
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // Button Animation
        jButton2.setForeground(new Color(85,110,230));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // Button Animation
        jButton2.setForeground(new Color(116,120,141));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Recover password
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterMouseEntered
        // Button Animation
        ButtonRegister.setForeground(new Color(116,120,141));
    }//GEN-LAST:event_ButtonRegisterMouseEntered

    private void ButtonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterMouseExited
        // Button Animation
        ButtonRegister.setForeground(new Color(85,110,230));
    }//GEN-LAST:event_ButtonRegisterMouseExited
    /**
     * This button hides the login panel and shows the register panel
     * @param evt 
     */
    private void ButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterActionPerformed
        Login.showRegisterPanel();
        Login.hideLoginPanel();

    }//GEN-LAST:event_ButtonRegisterActionPerformed
    //easter egg
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    String youtubeVideoURL = "https://www.youtube.com/watch?v=S47loCIF4b0";

    try {
            Desktop.getDesktop().browse(new URI(youtubeVideoURL));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel5MouseClicked
    /**
     * This method is responsible for showing a panel in a specific panel. 
     * In the program it is responsible for showing the register panel on the login screen.
     * @param p Panel to show
     * @param main Panel where it will be displayed
     */
    public void ShowJPanel(JPanel p, JPanel main){
        p.setSize(450, 490);
        p.setLocation(440,110);
        main.add(p, new AbsoluteConstraints(440, 110, 450, 490));
        main.setComponentZOrder(p, 0);
        main.revalidate();
        main.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogIn;
    private javax.swing.JButton ButtonRegister;
    private javax.swing.JButton ButtonShowPassword;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
