/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import Classes.customer_class;
import Classes.item_class;
import Classes.maintenance_class;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jonns
 */
public class ScreenBilling extends javax.swing.JPanel {

    /**
     * Creates new form ScreenMaintenance
     */
    public ScreenBilling() {
        initComponents();
        ReadCustomers();
        ReadItems();
        //ReadMaintenance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillingView = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        BillingWindowTitle = new javax.swing.JLabel();
        BillingWindowSubtitle = new javax.swing.JLabel();
        BillingAddButton = new javax.swing.JButton();
        BillingSearchButton = new javax.swing.JButton();
        BillingRevokeButton = new javax.swing.JButton();
        BillingInputPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BillIdText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BillSubtotalText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustomerIdCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ReceivementDayText = new javax.swing.JTextField();
        ReceivementMonthCombo = new javax.swing.JComboBox<>();
        ReceivementYearText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BillStateCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        BillTaxText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BillTotalText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        BillingCancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillingDirectoryTable = new javax.swing.JTable();

        BillingView.setBackground(new java.awt.Color(255, 255, 255));

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

        BillingWindowTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BillingWindowTitle.setText("Billing");

        BillingWindowSubtitle.setText("Select the action to perform");

        BillingAddButton.setText("Add Bill");
        BillingAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingAddButtonActionPerformed(evt);
            }
        });

        BillingSearchButton.setText("Search Bill");
        BillingSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingSearchButtonActionPerformed(evt);
            }
        });

        BillingRevokeButton.setText("Revoke Bill");
        BillingRevokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingRevokeButtonActionPerformed(evt);
            }
        });

        BillingInputPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Bill Id:");

        BillIdText.setEnabled(false);

        jLabel2.setText("Bill Subtotal:");

        BillSubtotalText.setEnabled(false);

        jLabel3.setText("Customer:");

        CustomerIdCombo.setEnabled(false);
        CustomerIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdComboActionPerformed(evt);
            }
        });

        jLabel4.setText("Receivement Date:");

        ReceivementDayText.setText("01");
        ReceivementDayText.setEnabled(false);

        ReceivementMonthCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        ReceivementMonthCombo.setEnabled(false);
        ReceivementMonthCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceivementMonthComboActionPerformed(evt);
            }
        });

        ReceivementYearText.setText("1900");
        ReceivementYearText.setEnabled(false);

        jLabel5.setText("Bill State:");

        BillStateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valid", "Revoked" }));
        BillStateCombo.setEnabled(false);

        jLabel6.setText("Bill Tax:");

        BillTaxText.setEnabled(false);
        BillTaxText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillTaxTextActionPerformed(evt);
            }
        });

        jLabel7.setText("Bill Total:");

        BillTotalText.setEnabled(false);
        BillTotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillTotalTextActionPerformed(evt);
            }
        });

        jButton2.setText("Accept");

        BillingCancelButton.setText("Cancel");
        BillingCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillingCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BillingInputPanelLayout = new javax.swing.GroupLayout(BillingInputPanel);
        BillingInputPanel.setLayout(BillingInputPanelLayout);
        BillingInputPanelLayout.setHorizontalGroup(
            BillingInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingInputPanelLayout.createSequentialGroup()
                .addGroup(BillingInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(BillingCancelButton))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(BillingInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BillTaxText)
                            .addComponent(BillIdText)
                            .addComponent(CustomerIdCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BillingInputPanelLayout.createSequentialGroup()
                                .addComponent(ReceivementDayText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ReceivementMonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(ReceivementYearText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BillStateCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BillSubtotalText)
                            .addComponent(BillTotalText)))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel5))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel6))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7))
                    .addGroup(BillingInputPanelLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel3)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        BillingInputPanelLayout.setVerticalGroup(
            BillingInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingInputPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CustomerIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillingInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReceivementDayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceivementMonthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceivementYearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillStateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillSubtotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillTaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillTotalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(BillingInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(BillingCancelButton))
                .addGap(0, 97, Short.MAX_VALUE))
        );

        BillingDirectoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(BillingDirectoryTable);

        javax.swing.GroupLayout BillingViewLayout = new javax.swing.GroupLayout(BillingView);
        BillingView.setLayout(BillingViewLayout);
        BillingViewLayout.setHorizontalGroup(
            BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingViewLayout.createSequentialGroup()
                .addGroup(BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingViewLayout.createSequentialGroup()
                        .addGroup(BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BillingViewLayout.createSequentialGroup()
                                .addGap(412, 412, 412)
                                .addComponent(BillingWindowSubtitle))
                            .addGroup(BillingViewLayout.createSequentialGroup()
                                .addGap(458, 458, 458)
                                .addComponent(BillingWindowTitle)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillingViewLayout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(BillingAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillingSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillingRevokeButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillingViewLayout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(BillingInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addContainerGap())
        );
        BillingViewLayout.setVerticalGroup(
            BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillingViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BillingViewLayout.createSequentialGroup()
                        .addComponent(BillingWindowTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillingWindowSubtitle)))
                .addGap(18, 18, 18)
                .addGroup(BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BillingSearchButton)
                    .addComponent(BillingAddButton)
                    .addComponent(BillingRevokeButton))
                .addGap(18, 18, 18)
                .addGroup(BillingViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingViewLayout.createSequentialGroup()
                        .addComponent(BillingInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(BillingViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillingView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BillingView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void CustomerIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIdComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIdComboActionPerformed

    private void BillTaxTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillTaxTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTaxTextActionPerformed

    private void BillTotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillTotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTotalTextActionPerformed

    private void BillingAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingAddButtonActionPerformed
        String[] options = {"Item", "Maintenance"};
        int selection = JOptionPane.showOptionDialog(null, "Choose a Billing Option:", "BILLING", 0, 3, null, options, options[0]);
        switch(selection){
            case 0:
                
        }

        //Switch Flags
        BillAddFlag = true;
        BillSearchFlag = false;
        BillRevokeFlag = false;
        
        //Enable Buttons
        CustomerIdCombo.setEnabled(true);
        ReceivementDayText.setEnabled(true);
        ReceivementMonthCombo.setEnabled(true);
        ReceivementYearText.setEnabled(true);
        BillSubtotalText.setEnabled(true);
        BillTaxText.setEnabled(true);
        BillTotalText.setEnabled(true);
        BillStateCombo.setSelectedIndex(0);
        
        BillingAddButton.setEnabled(false);
        BillingSearchButton.setEnabled(false);
        BillingRevokeButton.setEnabled(false);
        
        
    }//GEN-LAST:event_BillingAddButtonActionPerformed

    private void ReceivementMonthComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceivementMonthComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceivementMonthComboActionPerformed

    private void BillingSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingSearchButtonActionPerformed
        //Switch Flags
        BillAddFlag = false;
        BillSearchFlag = true;
        BillRevokeFlag = false;
        
        String[] options = {"Bill Id", "Date", "Customer Name"};
        int selection = JOptionPane.showOptionDialog(null, "Choose a Searching Option:", "SEARCH", 0, 3, null, options, options[0]);
        switch(selection){
            case 0:
                BillIdText.setEnabled(true);
                
                BillingAddButton.setEnabled(false);
                BillingSearchButton.setEnabled(false);
                BillingRevokeButton.setEnabled(false);
                break;
            case 1:
                ReceivementDayText.setEnabled(true);
                ReceivementMonthCombo.setEnabled(true);
                ReceivementYearText.setEnabled(true);
                
                BillingAddButton.setEnabled(false);
                BillingSearchButton.setEnabled(false);
                BillingRevokeButton.setEnabled(false);
                break;
            case 2:
                CustomerIdCombo.setEnabled(true);
                
                BillingAddButton.setEnabled(false);
                BillingSearchButton.setEnabled(false);
                BillingRevokeButton.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_BillingSearchButtonActionPerformed

    private void BillingRevokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingRevokeButtonActionPerformed
        //Switch Flags
        BillAddFlag = false;
        BillSearchFlag = false;
        BillRevokeFlag = true;
        BillStateCombo.setSelectedIndex(1);
        
        BillIdText.setEnabled(true);
        
        BillingAddButton.setEnabled(false);
        BillingSearchButton.setEnabled(false);
        BillingRevokeButton.setEnabled(false);
    }//GEN-LAST:event_BillingRevokeButtonActionPerformed

    private void BillingCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillingCancelButtonActionPerformed
        // TODO add your handling code here:
        BillIdText.setText("");
        ReceivementDayText.setText("01");
        ReceivementYearText.setText("1900");
        BillSubtotalText.setText("");
        BillTaxText.setText("");
        BillTotalText.setText("");
        
        //Disable Buttons
        BillIdText.setEnabled(false);
        CustomerIdCombo.setEnabled(false);
        ReceivementDayText.setEnabled(false);
        ReceivementMonthCombo.setEnabled(false);
        ReceivementYearText.setEnabled(false);
        BillSubtotalText.setEnabled(false);
        BillTaxText.setEnabled(false);
        BillTotalText.setEnabled(false);
        BillStateCombo.setSelectedIndex(0);
        
        BillingAddButton.setEnabled(true);
        BillingSearchButton.setEnabled(true);
        BillingRevokeButton.setEnabled(true);
        
        //Set Flags
        BillAddFlag = false;
        BillSearchFlag = false;
        BillRevokeFlag = false;
    }//GEN-LAST:event_BillingCancelButtonActionPerformed
                                     
                                                  
    private static void borrarPanel(JPanel panel) {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }
    private void ShowJPanel(JPanel p){

        p.setSize(1030,750);
        p.setLocation(0,0);
        BillingView.removeAll();
        BillingView.add(p, BorderLayout.CENTER);
        BillingView.revalidate();
        BillingView.repaint();
    }
    
    private void ReadCustomers(){
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_Customers.csv").toString();
        try {
            reader = new BufferedReader(new FileReader(archive));
            while((line = reader.readLine()) != null){
                customer_class temporary_object = new customer_class();
                parts = line.split(",");
                int aux_day = 0;
                int aux_month = 0;
                int aux_year = 0;
                Date birthdate = null;
                for(int i = 0; i < parts.length; i++){
                    switch(i){
                        case 0:
                            temporary_object.setCustomer_id(Integer.parseInt(parts[i]));
                            break;
                        case 1:
                            temporary_object.setCustomer_name(parts[i]);
                            break;
                        case 2:
                            temporary_object.setCustomer_lastname(parts[i]);
                            break;
                        case 3:
                            temporary_object.setCustomer_phone(Integer.parseInt(parts[i]));
                            break;
                        case 4:
                            temporary_object.setCustomer_email(parts[i]);
                            break;
                        case 5:
                            temporary_object.setCustomer_province(parts[i]);
                            break;
                        case 6:
                            temporary_object.setCustomer_canton(parts[i]);
                            break;
                        case 7:
                            temporary_object.setCustomer_district(parts[i]);
                            break;
                        case 8:
                            aux_day = Integer.parseInt(parts[i]);
                            break;
                        case 9:
                            aux_month = Integer.parseInt(parts[i]);
                            break;
                        case 10:
                            aux_year = Integer.parseInt(parts[i]);
                            temporary_object.setCustomer_birthdate(new Date(aux_year-1900, aux_month-1, aux_day));
                            break;
                    }
                }
                customers_list.add(temporary_object);
            }
            reader.close();
            line = null;
            parts = null;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void ReadItems(){
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_ITEMS.csv").toString();
        try {
            reader = new BufferedReader(new FileReader(archive));
            while((line = reader.readLine()) != null){
                item_class temporary_object = new item_class();
                parts = line.split(",");
                for(int i = 0; i < parts.length; i++){
                    switch(i){
                        case 0:
                            temporary_object.setId_item(Integer.parseInt(parts[i]));
                            break;
                        case 1:
                            temporary_object.setCategory_item(parts[i]);
                            break;
                        case 2:
                            temporary_object.setName_item(parts[i]);
                            break;
                        case 3:
                            temporary_object.setType_item(parts[i]);
                            break;
                        case 4:
                            temporary_object.setSize_item(Double.parseDouble(parts[i]));
                            break;
                        case 5:
                            temporary_object.setBrand_item(parts[i]);
                            break;
                        case 6:
                            temporary_object.setPrice_item(Integer.parseInt(parts[i]));
                            break;
                        case 7:
                            temporary_object.setAmount_item(Integer.parseInt(parts[i]));
                            break;
                    }
                }
                items_list.add(temporary_object);
            }
            reader.close();
            line = null;
            parts = null;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void ReadMaintenance(){
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_MAINTENANCE.csv").toString();
        try {
            reader = new BufferedReader(new FileReader(archive));
            while((line = reader.readLine()) != null){
                maintenance_class temporary_object = new maintenance_class();
                parts = line.split(",");
                for(int i = 0; i < parts.length; i++){
                    switch(i){
                        case 0:
                            temporary_object.setService_id(Integer.parseInt(parts[i]));
                            break;
                        case 1:
                            temporary_object.setCustomer_id(parts[i]);
                            break;
                        case 2:
                            temporary_object.setBicycle_brand(parts[i]);
                            break;
                        case 3:
                            temporary_object.setBicycle_description(parts[i]);
                            break;
                        case 4:
                            temporary_object.setMaintenance_price(Integer.parseInt(parts[i]));
                            break;
                        case 5:
                            //temporary_object.setBrand_item(parts[i]);
                            break;
                        case 6:
                            //temporary_object.setPrice_item(Integer.parseInt(parts[i]));
                            break;
                        case 7:
                            //temporary_object.setAmount_item(Integer.parseInt(parts[i]));
                            break;
                    }
                }
                maintenance_list.add(temporary_object);
            }
            reader.close();
            line = null;
            parts = null;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Create Flags
    Boolean BillAddFlag = false;
    Boolean BillSearchFlag = false;
    Boolean BillRevokeFlag = false;
    
    //Read CSV
    private BufferedReader reader;
    private String line;
    private String parts[] = null;
    
    //Create Lists
    ArrayList<customer_class> customers_list = new ArrayList<>();
    ArrayList<item_class> items_list = new ArrayList<>();
    ArrayList<maintenance_class> maintenance_list = new ArrayList<>();
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillIdText;
    private javax.swing.JComboBox<String> BillStateCombo;
    private javax.swing.JTextField BillSubtotalText;
    private javax.swing.JTextField BillTaxText;
    private javax.swing.JTextField BillTotalText;
    private javax.swing.JButton BillingAddButton;
    private javax.swing.JButton BillingCancelButton;
    private javax.swing.JTable BillingDirectoryTable;
    private javax.swing.JPanel BillingInputPanel;
    private javax.swing.JButton BillingRevokeButton;
    private javax.swing.JButton BillingSearchButton;
    private javax.swing.JPanel BillingView;
    private javax.swing.JLabel BillingWindowSubtitle;
    private javax.swing.JLabel BillingWindowTitle;
    private javax.swing.JComboBox<String> CustomerIdCombo;
    private javax.swing.JTextField ReceivementDayText;
    private javax.swing.JComboBox<String> ReceivementMonthCombo;
    private javax.swing.JTextField ReceivementYearText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
