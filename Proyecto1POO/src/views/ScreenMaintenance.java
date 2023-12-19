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
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        Month_Recived = new javax.swing.JComboBox<>();
        Month_Delivery = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Bicycle_Description = new javax.swing.JTextArea();
        State = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        Day_Recived = new javax.swing.JComboBox<>();
        Day_Delivery = new javax.swing.JComboBox<>();
        Year_Recived = new javax.swing.JComboBox<>();
        Year_Delivery = new javax.swing.JComboBox<>();
        Search_M = new javax.swing.JButton();

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

        Service_Id.setEnabled(false);

        Bicycle_Brand.setEnabled(false);
        Bicycle_Brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bicycle_BrandKeyTyped(evt);
            }
        });

        Price.setEnabled(false);
        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceKeyTyped(evt);
            }
        });

        Month_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Month_Recived.setEnabled(false);

        Month_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Month_Delivery.setEnabled(false);

        Bicycle_Description.setColumns(20);
        Bicycle_Description.setLineWrap(true);
        Bicycle_Description.setRows(5);
        Bicycle_Description.setWrapStyleWord(true);
        Bicycle_Description.setEnabled(false);
        Bicycle_Description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Bicycle_DescriptionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bicycle_DescriptionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Bicycle_Description);

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Close", "Open" }));
        State.setEnabled(false);

        jLabel1.setText("Maintenance");

        jLabel2.setText("Service Id:");

        jLabel3.setText("Customer Id:");

        jLabel4.setText("Bicycle Brand:");

        jLabel5.setText("Bicycle Description:");

        jLabel6.setText("Price:");

        jLabel7.setText("Date Received:");

        jLabel9.setText("Date Of Delivery:");

        jLabel8.setText("Observations:");

        Observations.setColumns(20);
        Observations.setLineWrap(true);
        Observations.setRows(5);
        Observations.setWrapStyleWord(true);
        Observations.setEnabled(false);
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

        Customer_Id.setEnabled(false);

        Accept_Maintenance.setText("Accept");
        Accept_Maintenance.setEnabled(false);
        Accept_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accept_MaintenanceActionPerformed(evt);
            }
        });

        Cancel_Maintenance.setText("Cancel");
        Cancel_Maintenance.setEnabled(false);
        Cancel_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_MaintenanceActionPerformed(evt);
            }
        });

        Create_Maintenance.setText("Create Maintenance");
        Create_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_MaintenanceActionPerformed(evt);
            }
        });

        Search_Maintenance.setText("Search Maintenance");
        Search_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_MaintenanceActionPerformed(evt);
            }
        });

        Modify_Maintenance.setText("Modify Maintenance");
        Modify_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modify_MaintenanceActionPerformed(evt);
            }
        });

        Delete_Maintenance.setText("Delete Maintenance");
        Delete_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_MaintenanceActionPerformed(evt);
            }
        });

        Day_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day_Recived.setEnabled(false);

        Day_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day_Delivery.setEnabled(false);

        Year_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        Year_Recived.setEnabled(false);

        Year_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        Year_Delivery.setEnabled(false);

        Search_M.setText("S");
        Search_M.setEnabled(false);
        Search_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_MActionPerformed(evt);
            }
        });

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
                        .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(Create_Maintenance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Search_Maintenance))
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Day_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Month_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Accept_Maintenance)
                                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(71, 71, 71)
                                                .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addComponent(Cancel_Maintenance)))
                                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Modify_Maintenance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Delete_Maintenance))
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Year_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Day_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Month_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Year_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                        .addComponent(Bicycle_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Customer_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MaintenanceViewLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Service_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(Search_M, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(37, 37, 37)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(MaintenanceViewLayout.createSequentialGroup()
                                    .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 200, Short.MAX_VALUE)))
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
                    .addComponent(Service_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_M))
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
                    .addComponent(Month_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Day_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year_Recived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MaintenanceViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Month_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Day_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Year_Delivery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private boolean verify_date(int day, int month, int year){
        boolean pass_flag = false;
        switch(month){
            case 1:if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }

            case 2:if(year%100 == 0){ //Secular year
                if(year%400 == 0){ //Bisiest year
                    if(day<1 || day>29){
                        JOptionPane.showMessageDialog(null, "You need to put a valid date");
                        pass_flag = false;
                        break;
                    }else{
                        pass_flag = true;
                        break;
                    }
                }else{
                    if(day<1 || day>28){
                        JOptionPane.showMessageDialog(null, "You need to put a valid date");
                        pass_flag = false;
                        break;
                    }else{
                        pass_flag = true;
                        break;
                    } 
                }
            }else{
                if(year%4 == 0){
                    if(day<1 || day>29){
                        JOptionPane.showMessageDialog(null, "You need to put a valid date");
                        pass_flag = false;
                        break;
                    }else{
                        pass_flag = true;
                        break;
                    }
                }else{
                    if(day<1 || day>28){
                        JOptionPane.showMessageDialog(null, "You need to put a valid date");
                        pass_flag = false;
                        break;
                    }else{
                        pass_flag = true;
                        break;
                    }
                }
            }

            case 3: if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 4: if(day<1 || day>30){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 5: if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 6: if(day<1 || day>30){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 7: if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 8: if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 9: if(day<1 || day>30){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 10: if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 11: if(day<1 || day>30){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
            
            case 12: if(day<1 || day>31){
                JOptionPane.showMessageDialog(null, "You need to put a valid date");
                pass_flag = false;
                break;
            }else{
                pass_flag = true;
                break;
            }
        }
        if(year<1900 || year>2023){
            JOptionPane.showMessageDialog(null, "You need to put a valid date");
            pass_flag = false;
        }
        return pass_flag;
    }
    
    private boolean Create_maintenance(){
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
        boolean pass_flag_r = verify_date(day_r, month_r, year_r);
            if(pass_flag_r == false){
                return false;
            }
        create_received_date = new Date(year_r-1900, month_r-1, day_r);
        
        int year_d  = Integer.parseInt(String.valueOf(Year_Delivery.getSelectedItem()));
        int month_d  = Integer.parseInt(String.valueOf(Month_Delivery.getSelectedItem()));
        int day_d  = Integer.parseInt(String.valueOf(Day_Delivery.getSelectedItem()));
        boolean pass_flag_d = verify_date(day_d, month_d, year_d);
            if(pass_flag_d == false){
                return false;
            }
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
        return true;
    }
    
    private void Add_maintenance(){
        String archive = Paths.get("src", "DataBase", "Archivo_CSV_MAINTENANCE.csv").toString();
        FileWriter fw = null;
        PrintWriter pw = null;
        
        try{ 
            fw = new FileWriter(archive);
            pw = new PrintWriter(fw);
            for(maintenance_class i: main_class.maintenance){
                String line = i.getService_id()+ "," + i.getCustomer_id() + "," + i.getBicycle_brand() + "," + i.getBicycle_description() + "," + i.getMaintenance_price() + "," + i.getReceived_date() + "," + i.getDelivery_date() + "," + i.getMaintenance_observations() + "," + i.getMaintenance_state();
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
    
    private void Modify_maintenance(maintenance_class Modify){
        int modify_service_id;
        String modify_customer_id;
        String modify_bicyle_brand;
        String modify_bicycle_description;
        int modify_maintenance_price;
        Date modify_received_date;
        Date modify_delivery_date;
        String modify_maintenance_observations;
        String modify_maintenance_state;
        Boolean register = false;
            
          
        modify_service_id = Integer.parseInt(Service_Id.getText());
        modify_customer_id = String.valueOf(Customer_Id.getSelectedItem());
        modify_bicyle_brand = Bicycle_Brand.getText();
        modify_bicycle_description = Bicycle_Description.getText();
        modify_maintenance_price = Integer.parseInt(Price.getText());
        
        int year_r = Integer.parseInt(String.valueOf(Year_Recived.getSelectedItem()));
        int month_r = Integer.parseInt(String.valueOf(Month_Recived.getSelectedItem()));
        int day_r = Integer.parseInt(String.valueOf(Day_Recived.getSelectedItem()));
        modify_received_date = new Date(year_r-1900, month_r-1, day_r);
        
        int year_d  = Integer.parseInt(String.valueOf(Year_Delivery.getSelectedItem()));
        int month_d  = Integer.parseInt(String.valueOf(Month_Delivery.getSelectedItem()));
        int day_d  = Integer.parseInt(String.valueOf(Day_Delivery.getSelectedItem()));
        modify_delivery_date = new Date(year_d-1900, month_d-1, day_d);
        
        modify_maintenance_observations = Observations.getText();
        modify_maintenance_state = String.valueOf(State.getSelectedItem());
       

         for (maintenance_class A : main_class.maintenance) {
            if (A.getService_id()== modify_service_id && A.getCustomer_id().equals(modify_customer_id)) {
                // El objeto con el mismo id y nombre ya existe
                register = false;
                break;
            }
           }
            if(register){
                JOptionPane.showMessageDialog(this,"This Name Already Exists ");  
                return;
            }else{
                Modify.setService_id(modify_service_id);
                Modify.setCustomer_id(modify_customer_id);
                Modify.setBicycle_brand(modify_bicyle_brand);
                Modify.setBicycle_description(modify_bicycle_description);
                Modify.setMaintenance_price(modify_maintenance_price);
                Modify.setReceived_date(modify_received_date);
                Modify.setDelivery_date(modify_delivery_date);
                Modify.setMaintenance_observations(modify_maintenance_observations);
                Modify.setMaintenance_state(modify_maintenance_state);
                JOptionPane.showMessageDialog(this, "Item Modified Successfully");
            }
    }
    
    private boolean Delete_maintenance(){
        for(int i = 0; i < main_class.maintenance.size(); i++){
            int Id = Integer.parseInt(Service_Id.getText());
            if(main_class.maintenance.get(i).getService_id() == Id){
                int result = JOptionPane.showConfirmDialog(this, "Delete", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                    main_class.maintenance.remove(i);
                    JOptionPane.showMessageDialog(this,"Removed");
                    Add_maintenance();
                    return true;
                }else{
                    JOptionPane.showMessageDialog(this,"Cancelled");
                    return false;
                }
            }
        }
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
        
        String textFromTextField_description = Bicycle_Description.getText();
        if (textFromTextField_description.isEmpty()){
            JOptionPane.showMessageDialog(null, "Bicycle Description Without Text");
            return;
        }

        if (textFromTextField_description.trim().equals(textFromTextField_description)) {
        }else {
            JOptionPane.showMessageDialog(null, "Bicycle Description With Spaces At The Ends");
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
        boolean pass_flag = true;
        if (create_button_maintenance == true) {
            pass_flag = Create_maintenance();
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
        
        if(pass_flag == true){
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

            Day_Recived.setSelectedItem("01");
            Month_Recived.setSelectedItem("01");
            Year_Recived.setSelectedItem("1900");
            Day_Delivery.setSelectedItem("01");
            Month_Delivery.setSelectedItem("01");
            Year_Delivery.setSelectedItem("1900");


            Bicycle_Description.setText("");
            Observations.setText("");
            State.setSelectedItem("Close");

            Search_M.setEnabled(false);

            modify_button_maintenance = false;
            delete_button_maintenance = false;
            create_button_maintenance = false;
            search_button_maintenance = false;
        }
    }//GEN-LAST:event_Accept_MaintenanceActionPerformed

    private void Bicycle_BrandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_BrandKeyTyped
        if(Bicycle_Brand.getText().length() >= 15){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_BrandKeyTyped

    private void ObservationsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservationsKeyPressed
        if (evt.getKeyChar() == '\n') {
            evt.consume();
        }    
    }//GEN-LAST:event_ObservationsKeyPressed

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
        Create_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        
        Customer_Id.setEnabled(true);
        Bicycle_Brand.setEnabled(true);
        Bicycle_Description.setEnabled(true);
        Price.setEnabled(true);
        Day_Recived.setEnabled(true);
        Month_Recived.setEnabled(true);
        Year_Recived.setEnabled(true);
        Day_Delivery.setEnabled(true);
        Month_Delivery.setEnabled(true);
        Year_Delivery.setEnabled(true);
        Observations.setEnabled(true);
        State.setEnabled(true);
        Accept_Maintenance.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);
        create_button_maintenance = true;
        
    }//GEN-LAST:event_Create_MaintenanceActionPerformed

    private void Bicycle_DescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_DescriptionKeyTyped
        if (Bicycle_Description.getText().length() >= 300){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_DescriptionKeyTyped

    private void Bicycle_DescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_DescriptionKeyPressed
        if (evt.getKeyChar() == '\n') {
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_DescriptionKeyPressed

    private void Cancel_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_MaintenanceActionPerformed
        Reset_Texts();
        Create_Maintenance.setEnabled(true);
        Modify_Maintenance.setEnabled(true);
        Search_Maintenance.setEnabled(true);
        Delete_Maintenance.setEnabled(true);

        Service_Id.setEnabled(false);
        Customer_Id.setEnabled(false);
        Bicycle_Brand.setEnabled(false);
        Bicycle_Description.setEnabled(false);
        Price.setEnabled(false);
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
        
        Day_Recived.setSelectedItem("01");
        Month_Recived.setSelectedItem("01");
        Year_Recived.setSelectedItem("1900");
        Day_Delivery.setSelectedItem("01");
        Month_Delivery.setSelectedItem("01");
        Year_Delivery.setSelectedItem("1900");
        
       
        Bicycle_Description.setText("");
        Observations.setText("");
        State.setSelectedItem("Close");
        
        Search_M.setEnabled(false);
       
        modify_button_maintenance = false;
        delete_button_maintenance = false;
        create_button_maintenance = false;
        search_button_maintenance = false;
    }//GEN-LAST:event_Cancel_MaintenanceActionPerformed

    private void Search_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_MaintenanceActionPerformed
        int opcion = JOptionPane.showOptionDialog(this,"Choose A Search Method",
            "Search",
            JOptionPane.YES_NO_OPTION,   // Tipo de opción (sí/no)
            JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
            null,                        // Icono personalizado (en este caso, ninguno)
            new Object[]{"ID SERVICE", "CUSTOMER NAME"}, // Texto de los botones
            "Botón 1");                    // Botón predeterminado
        
        Create_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        search_button_maintenance = true;
        if(opcion == 1){
            Customer_Id.setEnabled(true);
        }else{
            Service_Id.setEnabled(true);

        }
        Search_M.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);                                  
    }//GEN-LAST:event_Search_MaintenanceActionPerformed

    private void Search_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_MActionPerformed
        String textFromTextField_service = Service_Id.getText();
        String textFromTextField_customer = String.valueOf(Customer_Id.getSelectedItem());
        int id_service = 0;
        String customer_name = "f";
        Modify_m = null;
        if (textFromTextField_service.isEmpty() && textFromTextField_customer.isEmpty()){
            JOptionPane.showMessageDialog(null, "Service ID Without Text");
            return;
        }
        if  (!textFromTextField_service.isEmpty()){
            id_service = Integer.parseInt(textFromTextField_service);
        }
        if  (!textFromTextField_customer.isEmpty()){
            customer_name = String.valueOf(textFromTextField_customer);
        }
        Boolean flag_found = false;
        for (int i = 0; i < main_class.products.size(); i++) {
            maintenance_class service = main_class.maintenance.get(i);

            if(id_service == service.getService_id()|| customer_name.equals(service.getCustomer_id())){
                JOptionPane.showMessageDialog(this, "Found");
                flag_found = true;
                Service_Id.setText(String.valueOf(service.getService_id()));
                Customer_Id.setSelectedItem(String.valueOf(service.getCustomer_id()));
                Bicycle_Brand.setText(service.getBicycle_brand());
                Bicycle_Description.setText(service.getBicycle_description());
                Price.setText(String.valueOf(service.getMaintenance_price()));
              
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                String formattedDate_r = dateFormat.format(service.getReceived_date());
                String formattedDate_d = dateFormat.format(service.getDelivery_date());

                String day_r = formattedDate_r.substring(0, 2);
                String month_r = formattedDate_r.substring(3, 5);
                String year_r = formattedDate_r.substring(6);
                
                String day_d = formattedDate_d.substring(0, 2);
                String month_d = formattedDate_d.substring(3, 5);
                String year_d = formattedDate_d.substring(6);
                
                day_r = String.format("%02d", Integer.parseInt(day_r));
                month_r = String.format("%02d", Integer.parseInt(month_r));
                day_d = String.format("%02d", Integer.parseInt(day_d));
                month_d = String.format("%02d", Integer.parseInt(month_d));
                
                Day_Recived.setSelectedItem(day_r);
                Month_Recived.setSelectedItem(month_r);
                Year_Recived.setSelectedItem(year_r);
                Day_Delivery.setSelectedItem(day_d);
                Month_Delivery.setSelectedItem(month_d);
                Year_Delivery.setSelectedItem(year_d);
                
                Observations.setText(service.getMaintenance_observations());
                State.setSelectedItem(String.valueOf(service.getMaintenance_state()));
                
                
                if (modify_button_maintenance == true){
                    Modify_m = service;
                    Service_Id.setEnabled(false);
                    Search_M.setEnabled(false);
                    Customer_Id.setEnabled(true);
                    Bicycle_Brand.setEnabled(true);
                    Bicycle_Description.setEnabled(true);
                    Price.setEnabled(true);
                    Day_Recived.setEnabled(true);
                    Month_Recived.setEnabled(true);
                    Year_Recived.setEnabled(true);
                    Day_Delivery.setEnabled(true);
                    Month_Delivery.setEnabled(true);
                    Year_Delivery.setEnabled(true);
                    Observations.setEnabled(true);
                    State.setEnabled(true);
                    Accept_Maintenance.setEnabled(true);
                    Cancel_Maintenance.setEnabled(true);
                }
                if (search_button_maintenance == true || delete_button_maintenance == true ){
                    Service_Id.setEnabled(false);
                }
                
                Service_Id.setEnabled(false);
                Customer_Id.setEnabled(false);
                Accept_Maintenance.setEnabled(true);
                Cancel_Maintenance.setEnabled(true);
                Search_M.setEnabled(false);
                break;
            }
        }
        if(flag_found == false){
            JOptionPane.showMessageDialog(null, "Not Found");
        }
    }//GEN-LAST:event_Search_MActionPerformed

    private void Modify_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modify_MaintenanceActionPerformed
        int opcion = JOptionPane.showOptionDialog(this,"Choose A Search Method",
            "Search",
            JOptionPane.YES_NO_OPTION,   // Tipo de opción (sí/no)
            JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
            null,                        // Icono personalizado (en este caso, ninguno)
            new Object[]{"ID SERVICE", "CUSTOMER NAME"}, // Texto de los botones
            "Botón 1");                    // Botón predeterminado

        Create_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        modify_button_maintenance= true;

        if(opcion == 1){
            Customer_Id.setEnabled(true);
        }else{
            Service_Id.setEnabled(true);

        }
        Search_M.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);
        //loading_list_products();
    }//GEN-LAST:event_Modify_MaintenanceActionPerformed

    private void Delete_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_MaintenanceActionPerformed
        int opcion = JOptionPane.showOptionDialog(this,"Choose A Search Method",
            "Search",
            JOptionPane.YES_NO_OPTION,   // Tipo de opción (sí/no)
            JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
            null,                        // Icono personalizado (en este caso, ninguno)
            new Object[]{"ID SERVICE", "CUSTOMER NAME"}, // Texto de los botones
            "Botón 1");                    // Botón predeterminado

        Create_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        delete_button_maintenance= true;

        if(opcion == 1){
            Customer_Id.setEnabled(true);
        }else{
            Service_Id.setEnabled(true);

        }
        Search_M.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);
        //loading_list_products();
    }//GEN-LAST:event_Delete_MaintenanceActionPerformed
     
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
    private javax.swing.JTextArea Bicycle_Description;
    private javax.swing.JButton Cancel_Maintenance;
    private javax.swing.JButton Create_Maintenance;
    private javax.swing.JComboBox<String> Customer_Id;
    private javax.swing.JComboBox<String> Day_Delivery;
    private javax.swing.JComboBox<String> Day_Recived;
    private javax.swing.JButton Delete_Maintenance;
    private javax.swing.JPanel MaintenanceView;
    private javax.swing.JButton Modify_Maintenance;
    private javax.swing.JComboBox<String> Month_Delivery;
    private javax.swing.JComboBox<String> Month_Recived;
    private javax.swing.JTextArea Observations;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Search_M;
    private javax.swing.JButton Search_Maintenance;
    private javax.swing.JTextField Service_Id;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JComboBox<String> Year_Delivery;
    private javax.swing.JComboBox<String> Year_Recived;
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
