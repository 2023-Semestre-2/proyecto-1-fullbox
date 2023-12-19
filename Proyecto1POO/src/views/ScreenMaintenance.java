/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Classes.customer_class;
import Classes.id_class;
import Classes.main_class;
import Classes.maintenance_class;
import java.awt.BorderLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jonns
 */
public class ScreenMaintenance extends javax.swing.JPanel {

    boolean modify_button_maintenance;
    boolean delete_button_maintenance;
    boolean create_button_maintenance;
    boolean search_button_maintenance;
    
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    ArrayList<String> list_customers = new ArrayList<>();
    
    public ScreenMaintenance() {
        initComponents();
        add_list_customers();
        loading_list_customers();
        modify_button_maintenance = false;
        delete_button_maintenance = false;
        create_button_maintenance = false;
        search_button_maintenance = false;

    }

    public boolean getmodify_button_maintenance() {
        return modify_button_maintenance;
    }

    public boolean getdelete_button_maintenance() {
        return delete_button_maintenance;
    }

    public boolean getcreate_button_maintenance() {
        return create_button_maintenance;
    }

    public boolean getsearch_button_maintenance() {
        return search_button_maintenance;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MaintenanceView = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Service_Id = new javax.swing.JTextField();
        Bicycle_Brand = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Day_Recived = new javax.swing.JTextField();
        Month_Recived = new javax.swing.JComboBox<>();
        Month_Delivery = new javax.swing.JComboBox<>();
        Year_Delivery = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Bike_Description = new javax.swing.JTextArea();
        State = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Year_Recived = new javax.swing.JTextField();
        Day_Delivery = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Observations = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Customer_Id = new javax.swing.JComboBox<>();
        Accept_Maintenance = new javax.swing.JButton();
        Cancel_Maintenance = new javax.swing.JButton();
        Create_Maintenance = new javax.swing.JButton();
        Search_Maintenance = new javax.swing.JButton();
        Modify_Maintenance = new javax.swing.JButton();
        Delete_Maintenance = new javax.swing.JButton();

        MaintenanceView.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirView.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(32, 32));
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

        Bicycle_Brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bicycle_BrandKeyTyped(evt);
            }
        });

        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceKeyTyped(evt);
            }
        });

        Month_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Month_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Bike_Description.setColumns(20);
        Bike_Description.setLineWrap(true);
        Bike_Description.setRows(5);
        Bike_Description.setWrapStyleWord(true);
        Bike_Description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Bike_DescriptionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bike_DescriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Bike_Description);

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Close", "Open" }));

        jLabel1.setText("Maintenance");

        jLabel2.setText("Service Id:");

        jLabel3.setText("Customer Id:");

        jLabel4.setText("Bicycle Brand:");

        jLabel5.setText("Bike Description:");

        jLabel6.setText("Price:");

        jLabel7.setText("Date Received:");

        jLabel9.setText("Date Of Delivery:");

        jLabel8.setText("Observations:");

        Observations.setColumns(20);
        Observations.setLineWrap(true);
        Observations.setRows(5);
        Observations.setWrapStyleWord(true);
        Observations.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ObservationsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ObservationsKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(Observations);

        jLabel10.setText("State:");

        Customer_Id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Customer_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_IdActionPerformed(evt);
            }
        });

        Accept_Maintenance.setText("Accept");
        Accept_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accept_MaintenanceActionPerformed(evt);
            }
        });

        Cancel_Maintenance.setText("Cancel");

        Create_Maintenance.setText("Create Maintenance");

        Search_Maintenance.setText("Search Maintenance");

        Modify_Maintenance.setText("Modify Maintenance");

        Delete_Maintenance.setText("Delete Maintenance");

        javax.swing.GroupLayout MaintenanceViewLayout = new javax.swing.GroupLayout(MaintenanceView);
        MaintenanceView.setLayout(MaintenanceViewLayout);
        MaintenanceViewLayout.setHorizontalGroup(
            MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MaintenanceViewLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(399, 399, 399)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Day_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Month_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Year_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(Create_Maintenance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Search_Maintenance))
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Day_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Month_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Bicycle_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Customer_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MaintenanceViewLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Service_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MaintenanceViewLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(70, 70, 70)
                                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Accept_Maintenance)
                                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(71, 71, 71)
                                                .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addComponent(Cancel_Maintenance)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Modify_Maintenance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Delete_Maintenance))
                                    .addComponent(Year_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MaintenanceViewLayout.setVerticalGroup(
            MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Create_Maintenance)
                    .addComponent(Search_Maintenance)
                    .addComponent(Modify_Maintenance)
                    .addComponent(Delete_Maintenance))
                .addGap(31, 31, 31)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Service_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Customer_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bicycle_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addGap(25, 25, 25)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Day_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Month_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Month_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Day_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accept_Maintenance)
                    .addComponent(Cancel_Maintenance))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaintenanceView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaintenanceView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private maintenance_class Modify_m;

    
    private void Create_maintenance(){
        int create_service_id;
        String create_customer_id;
        String create_bicyle_brand;
        String create_bicycle_description;
        int create_maintenance_price;
        Date create_received_date;
        Date create_delivery_date;
        String create_maintenance_observations;
        String create_maintenance_state;
            
            
        create_service_id = Integer.parseInt(Service_Id.getText());
        create_customer_id = String.valueOf(Customer_Id.getSelectedItem());
        create_bicyle_brand = Bicycle_Brand.getText();
        create_bicycle_description = Bicycle_Description.getText();
        create_maintenance_price = Integer.parseInt(Price.getText());
        
        int year_r = Integer.parseInt(String.valueOf(Year_Recived.getSelectedItem()));
        int month_r = Integer.parseInt(String.valueOf(Month_Recived.getSelectedItem()));
        int day_r = Integer.parseInt(String.valueOf(Day_Recived.getSelectedItem()));
        create_received_date = new Date(year_r-1900, month_r-1, day_r);
        
        int year_d  = Integer.parseInt(String.valueOf(Year_Delivery.getSelectedItem()));
        int month_d  = Integer.parseInt(String.valueOf(Year_Delivery.getSelectedItem()));
        int day_d  = Integer.parseInt(String.valueOf(Year_Delivery.getSelectedItem()));
        create_delivery_date = new Date(year_d-1900, month_d-1, day_d);
        
        create_maintenance_observations = Observations.getText();
        create_maintenance_state = String.valueOf(State.getSelectedItem());
        
        
        maintenance_class service = new maintenance_class();
        service.setService_id(create_service_id);
        service.setCustomer_id(create_customer_id);
        service.setBicycle_brand(create_bicyle_brand);
        service.setBicycle_description(create_bicycle_description);
        service.setMaintenance_price(create_maintenance_price);
        service.setReceived_date(create_received_date);
        service.setDelivery_date(create_delivery_date);
        service.setMaintenance_observations(create_maintenance_observations);
        service.setMaintenance_state(create_maintenance_state);
        main_class.maintenance.add(service);
        add_id("maintenance");
        Add_maintenance();
        id_class id = main_class.ids.get(0);
        id.setId_maintenance(id.getId_maintenance() + 1);
        JOptionPane.showMessageDialog(this, "Item Added Successfully");
    }
    
    private void Add_maintenance(){
        
    }
    
    private void Modify_maintenance(maintenance_class Modify){
        
    }
    
    private boolean Delete_maintenance(){
        return false;
    }
    
    private void add_list_customers(){
        for (int i = main_class.customers.size() - 1; i >= 0; i--) {
            customer_class customer = main_class.customers.get(i);
            list_customers.add(customer.getCustomer_id() + "-" + customer.getCustomer_name());
    }
    } 
    
    private void loading_list_customers(){
        int aux = 0;
        for (String i:list_customers){
            model.insertElementAt(i, aux);
            model.setSelectedItem(i);
        }
        Customer_Id.setModel(model);
        Customer_Id.updateUI();
    }

    
    private void set_id(String id_mode){
        id_class id = main_class.ids.get(0);
        if(id_mode == "maintenance"){
           Service_Id.setText(String.valueOf(id.getId_maintenance()));
        }
    }
   
    private void add_id(String id_mode){
        String archive = Paths.get("src", "DataBase", "ID's.csv").toString();
        FileWriter fw = null;
        PrintWriter pw = null;
        try{ 
            fw = new FileWriter(archive);
            pw = new PrintWriter(fw);
            for (id_class i : main_class.ids) {
            String line = null;

            if (id_mode.equals("maintenance")) {
                 line = i.getId_product() + "," + i.getId_item() + "," + i.getId_customer() + "," + (i.getId_maintenance() + 1);
            }
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
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        borrarPanel(new ScreenProducts());
        ShowJPanel(new ScreenMain());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirView2.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirView.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void Accept_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accept_MaintenanceActionPerformed
        String textFromTextField_customer = (String) Customer_Id.getSelectedItem();
        if (textFromTextField_customer.isEmpty()){
            JOptionPane.showMessageDialog(null, "Customer Id Without Text");
            return;
        }
        ///////////////////////////////////////////////
        String textFromTextField_bicycle_brand = Bicycle_Brand.getText();
        if (textFromTextField_bicycle_brand.isEmpty()){
            JOptionPane.showMessageDialog(null, "Bicycle Brand Without Text");
            return;
        }
        if (textFromTextField_bicycle_brand.trim().equals(textFromTextField_bicycle_brand)) {
        }else {
            JOptionPane.showMessageDialog(null, "Bicycle Brand With Spaces At The Ends");
            return;
        }
        
        String textFromTextField_price = Price.getText();
        if (textFromTextField_price.isEmpty()){
            JOptionPane.showMessageDialog(null, "Price Without Text");
            return;
        }

        ///////////////////////////////////////////////
        String textFromTextField_observations = Observations.getText();
        if (textFromTextField_observations.isEmpty()){
            JOptionPane.showMessageDialog(null, "Observations Without Text");
            return;
        }

        if (textFromTextField_observations.trim().equals(textFromTextField_observations)) {
        }else {
            JOptionPane.showMessageDialog(null, "Observations With Spaces At The Ends");
            return;
        }

        if (create_button_maintenance == true) {
            Create_maintenance();
            System.out.println("Botón 1 está habilitado. Realizar acciones para boton3.");

        } else if (Search_M.isEnabled()) {
            System.out.println("Botón 2 está habilitado. Realizar acciones para boton2.");

        } else if (modify_button_maintenance == true) {
            Modify_maintenance(Modify_m);
            Add_maintenance();
            modify_button_maintenance = false;
            System.out.println("Botón 3 está habilitado. Realizar acciones para boton3.");
        } else if (delete_button_maintenance == true) {
            System.out.println("Botón 4 está habilitado. Realizar acciones para boton3.");
            boolean result = Delete_maintenance();
            if (result == false){
                return;
            }
        }
        
        add_id("maintenance");
        id_class id = main_class.ids.get(0);
        id.setId_product(id.getId_product() + 1);
    
        Reset_Texts();
        Create_Maintenance.setEnabled(true);
        Modify_Maintenance.setEnabled(true);
        Search_Maintenance.setEnabled(true);
        Delete_Maintenance.setEnabled(true);

        Service_Id.setEnabled(false);
        Customer_Id.setEnabled(false);
        Bicycle_Brand.setEnabled(false);
        Bicycle_Description.setEnabled(false);
        Price.setVisible(false);
        Day_Recived.setEnabled(false);
        Month_Recived.setEnabled(false);
        Year_Recived.setEnabled(false);
        Day_Delivery.setEnabled(false);
        Month_Delivery.setEnabled(false);
        Year_Delivery.setEnabled(false);
        Observations.setEnabled(false);
        State.setEnabled(false);
        Accept_Maintenance.setEnabled(false);
        Cancel_Maintenance.setEnabled(false);
       
        modify_button_maintenance = false;
        delete_button_maintenance = false;
        create_button_maintenance = false;
        search_button_maintenance = false;
    }//GEN-LAST:event_Accept_MaintenanceActionPerformed

    private void Bicycle_BrandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_BrandKeyTyped
        if(Bicycle_Brand.getText().length() >= 15){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_BrandKeyTyped

    private void Bicycle_DescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_DescriptionKeyPressed
        if (evt.getKeyChar() == '\n') {
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_DescriptionKeyPressed

    private void ObservationsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservationsKeyPressed
        if (evt.getKeyChar() == '\n') {
            evt.consume();
        }    
    }//GEN-LAST:event_ObservationsKeyPressed

    private void Bicycle_DescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_DescriptionKeyTyped
        if (Bicycle_Description.getText().length() >= 300){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_DescriptionKeyTyped

    private void ObservationsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservationsKeyTyped
        if (Observations.getText().length() >= 300){
            evt.consume();
        }
    }//GEN-LAST:event_ObservationsKeyTyped

    private void PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyTyped
        if(Price.getText().length() >= 15){
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();   
    }//GEN-LAST:event_PriceKeyTyped

    private void Create_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_MaintenanceActionPerformed
        set_id("maintenance");
    }//GEN-LAST:event_Create_MaintenanceActionPerformed

    private void Customer_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Customer_IdActionPerformed
     
    private void Reset_Texts(){
        Component[] components = MaintenanceView.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            }
        }
    }
    private static void borrarPanel(JPanel panel) {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }
    private void ShowJPanel(JPanel p){

        p.setSize(1030,750);
        p.setLocation(0,0);
        MaintenanceView.removeAll();
        MaintenanceView.add(p, BorderLayout.CENTER);
        MaintenanceView.revalidate();
        MaintenanceView.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept_Maintenance;
    private javax.swing.JTextField Bicycle_Brand;
    private javax.swing.JTextArea Bike_Description;
    private javax.swing.JButton Cancel_Maintenance;
    private javax.swing.JButton Create_Maintenance;
    private javax.swing.JComboBox<String> Customer_Id;
    private javax.swing.JTextField Day_Delivery;
    private javax.swing.JTextField Day_Recived;
    private javax.swing.JButton Delete_Maintenance;
    private javax.swing.JPanel MaintenanceView;
    private javax.swing.JButton Modify_Maintenance;
    private javax.swing.JComboBox<String> Month_Delivery;
    private javax.swing.JComboBox<String> Month_Recived;
    private javax.swing.JTextArea Observations;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Search_Maintenance;
    private javax.swing.JTextField Service_Id;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JTextField Year_Delivery;
    private javax.swing.JTextField Year_Recived;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
