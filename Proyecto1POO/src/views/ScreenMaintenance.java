/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Classes.id_class;
import Classes.main_class;
import java.awt.BorderLayout;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

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
    ArrayList<String> list_customer_product = new ArrayList<>();
    
    public ScreenMaintenance() {
        initComponents();
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

    

    private void loading_customers(){
        
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
    id_class id = main_class.ids.get(0);
    id.setId_product(id.getId_product() + 1);
    }//GEN-LAST:event_Accept_MaintenanceActionPerformed

    private void Bicycle_BrandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_BrandKeyTyped
        if(Bicycle_Brand.getText().length() >= 15){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_BrandKeyTyped

    private void Bike_DescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bike_DescriptionKeyPressed
        if (evt.getKeyChar() == '\n') {
            evt.consume();
        }
    }//GEN-LAST:event_Bike_DescriptionKeyPressed

    private void ObservationsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservationsKeyPressed
        if (evt.getKeyChar() == '\n') {
            evt.consume();
        }    
    }//GEN-LAST:event_ObservationsKeyPressed

    private void Bike_DescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bike_DescriptionKeyTyped
        if (Bike_Description.getText().length() >= 300){
            evt.consume();
        }
    }//GEN-LAST:event_Bike_DescriptionKeyTyped

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
