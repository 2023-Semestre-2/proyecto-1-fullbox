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
import java.awt.Color;
import java.awt.Component;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Initialize buttons and create a list for a combobox.
 * @author jonns
 */
public class ScreenMaintenance extends javax.swing.JPanel {

    boolean modify_button_maintenance;
    boolean delete_button_maintenance;
    boolean create_button_maintenance;
    boolean search_button_maintenance;
    
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    ArrayList<String> list_customers = new ArrayList<>();
    
    /**
    * Assigns initial values to the variables buttons adds to the previously created list
    * @author jonns
    */
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        MaintenanceView.setBackground(new java.awt.Color(255, 255, 255));
        MaintenanceView.setLayout(null);

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
        MaintenanceView.add(jButton1);
        jButton1.setBounds(990, 10, 32, 32);

        Service_Id.setEnabled(false);
        MaintenanceView.add(Service_Id);
        Service_Id.setBounds(320, 270, 130, 24);

        Bicycle_Brand.setEnabled(false);
        Bicycle_Brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Bicycle_BrandKeyTyped(evt);
            }
        });
        MaintenanceView.add(Bicycle_Brand);
        Bicycle_Brand.setBounds(320, 330, 130, 24);

        Price.setEnabled(false);
        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceKeyTyped(evt);
            }
        });
        MaintenanceView.add(Price);
        Price.setBounds(320, 360, 130, 24);

        Month_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Month_Recived.setEnabled(false);
        MaintenanceView.add(Month_Recived);
        Month_Recived.setBounds(640, 360, 65, 26);

        Month_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Month_Delivery.setEnabled(false);
        MaintenanceView.add(Month_Delivery);
        Month_Delivery.setBounds(640, 390, 63, 26);

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

        MaintenanceView.add(jScrollPane1);
        jScrollPane1.setBounds(460, 270, 410, 83);

        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Close", "Open" }));
        State.setEnabled(false);
        MaintenanceView.add(State);
        State.setBounds(790, 390, 70, 26);

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MAINTENANCE");
        MaintenanceView.add(jLabel1);
        jLabel1.setBounds(420, 130, 180, 42);

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Service Id:");
        MaintenanceView.add(jLabel2);
        jLabel2.setBounds(260, 270, 60, 24);

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("  Customer Id:");
        MaintenanceView.add(jLabel3);
        jLabel3.setBounds(240, 290, 100, 40);

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bicycle Brand:");
        MaintenanceView.add(jLabel4);
        jLabel4.setBounds(240, 330, 80, 24);

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bicycle Description:");
        MaintenanceView.add(jLabel5);
        jLabel5.setBounds(460, 250, 120, 24);

        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("  Price:");
        MaintenanceView.add(jLabel6);
        jLabel6.setBounds(280, 360, 50, 24);

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(" Date Received:");
        MaintenanceView.add(jLabel7);
        jLabel7.setBounds(470, 360, 90, 20);

        jLabel9.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Date Of Delivery:");
        MaintenanceView.add(jLabel9);
        jLabel9.setBounds(460, 390, 110, 20);

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Observations:");
        MaintenanceView.add(jLabel8);
        jLabel8.setBounds(190, 400, 79, 24);

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

        MaintenanceView.add(jScrollPane2);
        jScrollPane2.setBounds(190, 420, 450, 83);

        jLabel10.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("State:");
        MaintenanceView.add(jLabel10);
        jLabel10.setBounds(790, 370, 40, 24);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar-20.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaintenanceView.add(jLabel11);
        jLabel11.setBounds(710, 190, 30, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/añadir-15.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaintenanceView.add(jLabel12);
        jLabel12.setBounds(180, 190, 30, 40);

        Customer_Id.setEnabled(false);
        MaintenanceView.add(Customer_Id);
        Customer_Id.setBounds(320, 300, 130, 26);

        Accept_Maintenance.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Accept_Maintenance.setForeground(new java.awt.Color(0, 0, 0));
        Accept_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar-32.png"))); // NOI18N
        Accept_Maintenance.setText("Accept");
        Accept_Maintenance.setBorder(null);
        Accept_Maintenance.setContentAreaFilled(false);
        Accept_Maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accept_Maintenance.setEnabled(false);
        Accept_Maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Accept_MaintenanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Accept_MaintenanceMouseExited(evt);
            }
        });
        Accept_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accept_MaintenanceActionPerformed(evt);
            }
        });
        MaintenanceView.add(Accept_Maintenance);
        Accept_Maintenance.setBounds(660, 440, 100, 50);

        Cancel_Maintenance.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Cancel_Maintenance.setForeground(new java.awt.Color(0, 0, 0));
        Cancel_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar-32.png"))); // NOI18N
        Cancel_Maintenance.setText("Cancel");
        Cancel_Maintenance.setBorder(null);
        Cancel_Maintenance.setContentAreaFilled(false);
        Cancel_Maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel_Maintenance.setEnabled(false);
        Cancel_Maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cancel_MaintenanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cancel_MaintenanceMouseExited(evt);
            }
        });
        Cancel_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_MaintenanceActionPerformed(evt);
            }
        });
        MaintenanceView.add(Cancel_Maintenance);
        Cancel_Maintenance.setBounds(760, 440, 100, 50);

        Create_Maintenance.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Create_Maintenance.setForeground(new java.awt.Color(0, 0, 0));
        Create_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento-32.png"))); // NOI18N
        Create_Maintenance.setText("Create Maintenance");
        Create_Maintenance.setBorder(null);
        Create_Maintenance.setContentAreaFilled(false);
        Create_Maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Create_Maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Create_MaintenanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Create_MaintenanceMouseExited(evt);
            }
        });
        Create_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_MaintenanceActionPerformed(evt);
            }
        });
        MaintenanceView.add(Create_Maintenance);
        Create_Maintenance.setBounds(150, 180, 170, 50);

        Search_Maintenance.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Search_Maintenance.setForeground(new java.awt.Color(0, 0, 0));
        Search_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar-mantenimiento-32.png"))); // NOI18N
        Search_Maintenance.setText("Search Maintenance");
        Search_Maintenance.setBorder(null);
        Search_Maintenance.setContentAreaFilled(false);
        Search_Maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_Maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_MaintenanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_MaintenanceMouseExited(evt);
            }
        });
        Search_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_MaintenanceActionPerformed(evt);
            }
        });
        MaintenanceView.add(Search_Maintenance);
        Search_Maintenance.setBounds(330, 180, 170, 50);

        Modify_Maintenance.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Modify_Maintenance.setForeground(new java.awt.Color(0, 0, 0));
        Modify_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar-mantenimiento-32.png"))); // NOI18N
        Modify_Maintenance.setText("Modify Maintenance");
        Modify_Maintenance.setBorder(null);
        Modify_Maintenance.setContentAreaFilled(false);
        Modify_Maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modify_Maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Modify_MaintenanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Modify_MaintenanceMouseExited(evt);
            }
        });
        Modify_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modify_MaintenanceActionPerformed(evt);
            }
        });
        MaintenanceView.add(Modify_Maintenance);
        Modify_Maintenance.setBounds(510, 180, 170, 50);

        Delete_Maintenance.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        Delete_Maintenance.setForeground(new java.awt.Color(0, 0, 0));
        Delete_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento-32.png"))); // NOI18N
        Delete_Maintenance.setText("Delete Maintenance");
        Delete_Maintenance.setBorder(null);
        Delete_Maintenance.setContentAreaFilled(false);
        Delete_Maintenance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Maintenance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Delete_MaintenanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Delete_MaintenanceMouseExited(evt);
            }
        });
        Delete_Maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_MaintenanceActionPerformed(evt);
            }
        });
        MaintenanceView.add(Delete_Maintenance);
        Delete_Maintenance.setBounds(680, 180, 170, 50);

        Day_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day_Recived.setEnabled(false);
        MaintenanceView.add(Day_Recived);
        Day_Recived.setBounds(560, 360, 75, 26);

        Day_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day_Delivery.setEnabled(false);
        MaintenanceView.add(Day_Delivery);
        Day_Delivery.setBounds(560, 390, 76, 26);

        Year_Recived.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        Year_Recived.setEnabled(false);
        MaintenanceView.add(Year_Recived);
        Year_Recived.setBounds(710, 360, 73, 26);

        Year_Delivery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        Year_Delivery.setEnabled(false);
        MaintenanceView.add(Year_Delivery);
        Year_Delivery.setBounds(710, 390, 73, 26);

        Search_M.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        Search_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/búsqueda-32.png"))); // NOI18N
        Search_M.setBorder(null);
        Search_M.setContentAreaFilled(false);
        Search_M.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_M.setEnabled(false);
        Search_M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_MMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_MMouseExited(evt);
            }
        });
        Search_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_MActionPerformed(evt);
            }
        });
        MaintenanceView.add(Search_M);
        Search_M.setBounds(180, 300, 50, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Union3.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        MaintenanceView.add(jLabel13);
        jLabel13.setBounds(-140, -210, 2120, 530);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ellipse 2092.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        MaintenanceView.add(jLabel14);
        jLabel14.setBounds(710, 530, 380, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaintenanceView, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MaintenanceView, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
    * Create object to modify in maintenance.
    * @author jonns
    */
    private maintenance_class Modify_m;
    
    /**
    * This method verifies that the date data is in a correct format
    * @author jonns
    * @param day entry day data
    * @param month entry month data
    * @param year entry year data
    */
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
    /**
    * This method creates a new maintenance request
    * @author jonns
    */
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
        JOptionPane.showMessageDialog(this, "Service Added Successfully");
        return true;
    }
    /**
    * This method adds a new object to the maintenance list
    * @author jonns
    */
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
    /**
    * This method modifies a maintenance list object.
    * @author jonns
    * @param Modify The parameter you want to modify.
    */
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
                JOptionPane.showMessageDialog(this, "Service Modified Successfully");
            }
    }
    /**
    * This method removes an object from the maintenance list.
    * @author jonns
    */
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
    
    /**
    * This method adds an object to a customers list to use in a comboBox
    * @author jonns
    */
    private void add_list_customers(){
        for (int i = main_class.customers.size() - 1; i >= 0; i--) {
            customer_class customer = main_class.customers.get(i);
            list_customers.add(customer.getCustomer_id() + "-" + customer.getCustomer_name());
    }
    } 
    /**
    * This method loads an object to a customers list
    * @author jonns
    */
    private void loading_list_customers(){
        int aux = 0;
        for (String i:list_customers){
            model.insertElementAt(i, aux);
            model.setSelectedItem(i);
        }
        Customer_Id.setModel(model);
        Customer_Id.updateUI();
    }
    
    /**
    * Set id maintenance in textfield.
    * @author jonns
    * @param id_mode id search to database.
    */
    private void set_id(String id_mode){
        id_class id = main_class.ids.get(0);
        if(id_mode == "maintenance"){
           Service_Id.setText(String.valueOf(id.getId_maintenance()));
        }
    }
    /**
    * This method adds an id to the csv database.
    * @author jonns
    * @param id_mode id add to database
    */
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
                 line = i.getId_product() + "," + i.getId_item() + "," + i.getId_customer() + "," + (i.getId_maintenance() + 1) + "," + i.getId_bill() + "," + i.getId_detail();
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
     
    /**
    * Delete the current panel and return to the main.
    * @author jonns
    */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        borrarPanel(new ScreenProducts());
        ShowJPanel(new ScreenMain());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * Button animation.
    * @author jonns
    */
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirView2.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    /**
    * Button animation.
    * @author jonns
    */
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirView.png")));
    }//GEN-LAST:event_jButton1MouseExited

    /**
    * Accesses different methods depending on the button previously pressed.
    * @author jonns
    */
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

        } else if (Search_M.isEnabled()) {

        } else if (modify_button_maintenance == true) {
            Modify_maintenance(Modify_m);
            Add_maintenance();
            modify_button_maintenance = false;
        } else if (delete_button_maintenance == true) {
            boolean result = Delete_maintenance();
            if (result == false){
                return;
            }
        }
        
        if(pass_flag == true){
            Reset_Texts();
            Accept_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar-32.png")));
            Create_Maintenance.setEnabled(true);
            Modify_Maintenance.setEnabled(true);
            Search_Maintenance.setEnabled(true);
            Delete_Maintenance.setEnabled(true);
            jLabel11.setEnabled(true);
            jLabel12.setEnabled(true);
            
            Service_Id.setEnabled(false);
            Customer_Id.setEnabled(false);
            Customer_Id.setSelectedIndex(0);
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

    
    /**
    * Brand validation.
    * @author jonns
    */
    private void Bicycle_BrandKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_BrandKeyTyped
        if(Bicycle_Brand.getText().length() >= 15){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_BrandKeyTyped

    /**
    * Observations validation.
    * @author jonns
    */
    private void ObservationsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservationsKeyPressed
        if (evt.getKeyChar() == '\n' || evt.getKeyChar() == ',') {
            evt.consume();
        }    
    }//GEN-LAST:event_ObservationsKeyPressed

    /**
    * Observations validation.
    * @author jonns
    */
    private void ObservationsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservationsKeyTyped
        if (Observations.getText().length() >= 300){
            evt.consume();
        }
    }//GEN-LAST:event_ObservationsKeyTyped

    /**
    * Price validation.
    * @author jonns
    */
    private void PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyTyped
        if(Price.getText().length() >= 15){
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();   
    }//GEN-LAST:event_PriceKeyTyped

    /**
    * Button that establishes what condition the interface structures will be in.
    * @author jonns
    */
    private void Create_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_MaintenanceActionPerformed
        set_id("maintenance");
        Create_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        
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

    /**
    * Description validation.
    * @author jonns
    */
    private void Bicycle_DescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_DescriptionKeyTyped
        if (Bicycle_Description.getText().length() >= 300){
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_DescriptionKeyTyped

    /**
    * Description validation.
    * @author jonns
    */
    private void Bicycle_DescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bicycle_DescriptionKeyPressed
        if (evt.getKeyChar() == '\n' || evt.getKeyChar() == ',') {
            evt.consume();
        }
    }//GEN-LAST:event_Bicycle_DescriptionKeyPressed

    /**
    * Reset the textfields and other interface structures.
    * @author jonns
    */
    private void Cancel_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_MaintenanceActionPerformed
        Reset_Texts();
        Cancel_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar-32.png")));
        Create_Maintenance.setEnabled(true);
        Modify_Maintenance.setEnabled(true);
        Search_Maintenance.setEnabled(true);
        Delete_Maintenance.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
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

    /**
    * Button that establishes what condition the interface structures will be in.
    * @author jonns
    */
    private void Search_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_MaintenanceActionPerformed
        int opcion = JOptionPane.showOptionDialog(this,"Choose A Search Method",
            "Search",
            JOptionPane.YES_NO_OPTION,   
            JOptionPane.QUESTION_MESSAGE, 
            null,                        
            new Object[]{"ID SERVICE", "CUSTOMER NAME"}, 
            "Botón 1");                    
        
        Create_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        search_button_maintenance = true;
        if(opcion == 1){
            Customer_Id.setEnabled(true);
        }else{
            Service_Id.setEnabled(true);
            Customer_Id.setSelectedIndex(-1);

        }
        Search_M.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);                                  
    }//GEN-LAST:event_Search_MaintenanceActionPerformed

    /**
    * Button that establishes what condition the interface structures will be in.
    * @author jonns
    */
    private void Modify_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modify_MaintenanceActionPerformed
        int opcion = JOptionPane.showOptionDialog(this,"Choose A Search Method",
            "Search",
            JOptionPane.YES_NO_OPTION,   
            JOptionPane.QUESTION_MESSAGE, 
            null,                        
            new Object[]{"ID SERVICE", "CUSTOMER NAME"}, 
            "Botón 1");                    

        Create_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        modify_button_maintenance= true;

        if(opcion == 1){
            Customer_Id.setEnabled(true);
        }else{
            Service_Id.setEnabled(true);
            Customer_Id.setSelectedIndex(-1);

        }
        Search_M.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);
        //loading_list_products();
    }//GEN-LAST:event_Modify_MaintenanceActionPerformed

    /**
    * Button that establishes what condition the interface structures will be in.
    * @author jonns
    */
    private void Delete_MaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_MaintenanceActionPerformed
        int opcion = JOptionPane.showOptionDialog(this,"Choose A Search Method",
            "Search",
            JOptionPane.YES_NO_OPTION,   
            JOptionPane.QUESTION_MESSAGE, 
            null,                        
            new Object[]{"ID SERVICE", "CUSTOMER NAME"}, 
            "Botón 1");                   

        Create_Maintenance.setEnabled(false);
        Search_Maintenance.setEnabled(false);
        Delete_Maintenance.setEnabled(false);
        Modify_Maintenance.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        delete_button_maintenance= true;

        if(opcion == 1){
            Customer_Id.setEnabled(true);
        }else{
            Service_Id.setEnabled(true);
            Customer_Id.setSelectedIndex(-1);

        }
        Search_M.setEnabled(true);
        Cancel_Maintenance.setEnabled(true);
        //loading_list_products();
    }//GEN-LAST:event_Delete_MaintenanceActionPerformed

    /**
    * It searches the array of objects and if it finds it, it opens another method.
    * @author jonns
    */
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
        Boolean flag_count= false;
        int count = 0;
        for (int i = 0; i < main_class.maintenance.size(); i++) {
            maintenance_class service = main_class.maintenance.get(i);
            if(customer_name.equals(service.getCustomer_id())){
                count++;
            }
        }
        if (count > 1){
            flag_count = true;
            try{
            int userInput = Integer.parseInt(JOptionPane.showInputDialog(this, "Several Services Were Found. Please Enter The Service Id"));
            id_service = userInput;
            }
            catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(this,"Invalid");
                    return;
                    }
            }
            
        for (int i = 0; i < main_class.maintenance.size(); i++) {
            maintenance_class service = main_class.maintenance.get(i);
            
            if(flag_count){
               if(id_service == service.getService_id()){
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
               
            }else if(id_service == service.getService_id()|| customer_name.equals(service.getCustomer_id())){
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

    /**
    * Button Animation.
    * @author jonns
    */
    private void Create_MaintenanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_MaintenanceMouseEntered
        Create_Maintenance.setForeground(Color.GRAY);
        Create_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento-42.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/añadir-25.png")));
    }//GEN-LAST:event_Create_MaintenanceMouseEntered

    /**
    * Button Animation.
    * @author jonns
    */
    private void Create_MaintenanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_MaintenanceMouseExited
        Create_Maintenance.setForeground(Color.black);
        Create_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento-32.png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/añadir-15.png")));
    }//GEN-LAST:event_Create_MaintenanceMouseExited

    /**
    * Button Animation.
    * @author jonns
    */
    private void Search_MaintenanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MaintenanceMouseEntered
        Search_Maintenance.setForeground(Color.GRAY);
        Search_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar-mantenimiento-42.png")));
    }//GEN-LAST:event_Search_MaintenanceMouseEntered

    /**
    * Button Animation.
    * @author jonns
    */
    private void Search_MaintenanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MaintenanceMouseExited
        Search_Maintenance.setForeground(Color.black);
        Search_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar-mantenimiento-32.png")));
    }//GEN-LAST:event_Search_MaintenanceMouseExited

    /**
    * Button Animation.
    * @author jonns
    */
    private void Modify_MaintenanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modify_MaintenanceMouseEntered
        Modify_Maintenance.setForeground(Color.GRAY);
        Modify_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar-mantenimiento-42.png")));
    }//GEN-LAST:event_Modify_MaintenanceMouseEntered

    /**
    * Button Animation.
    * @author jonns
    */
    private void Modify_MaintenanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Modify_MaintenanceMouseExited
        Modify_Maintenance.setForeground(Color.black);
        Modify_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar-mantenimiento-32.png")));
    }//GEN-LAST:event_Modify_MaintenanceMouseExited

    /**
    * Button Animation.
    * @author jonns
    */
    private void Delete_MaintenanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_MaintenanceMouseEntered
        Delete_Maintenance.setForeground(Color.GRAY);
        Delete_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento-42.png")));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar-30.png")));
    }//GEN-LAST:event_Delete_MaintenanceMouseEntered

    /**
    * Button Animation.
    * @author jonns
    */
    private void Delete_MaintenanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_MaintenanceMouseExited
        Delete_Maintenance.setForeground(Color.black);
        Delete_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento-32.png")));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar-20.png")));
    }//GEN-LAST:event_Delete_MaintenanceMouseExited

    /**
    * Button Animation.
    * @author jonns
    */
    private void Search_MMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MMouseEntered
        Search_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/búsqueda-42.png")));

    }//GEN-LAST:event_Search_MMouseEntered

    private void Search_MMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_MMouseExited
        Search_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/búsqueda-32.png")));
    }//GEN-LAST:event_Search_MMouseExited

    /**
    * Button Animation.
    * @author jonns
    */
    private void Accept_MaintenanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accept_MaintenanceMouseEntered
        if (Accept_Maintenance.isEnabled()) {
        Accept_Maintenance.setForeground(Color.GRAY);
        Accept_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Aceptar-42GIF.gif")));
       }
    }//GEN-LAST:event_Accept_MaintenanceMouseEntered

    /**
    * Button Animation.
    * @author jonns
    */
    private void Accept_MaintenanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Accept_MaintenanceMouseExited
       if (Accept_Maintenance.isEnabled()) {
       Accept_Maintenance.setForeground(Color.black);
       Accept_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/aceptar-32.png")));
       }
    }//GEN-LAST:event_Accept_MaintenanceMouseExited

    /**
    * Button Animation.
    * @author jonns
    */
    private void Cancel_MaintenanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_MaintenanceMouseEntered
        if (Cancel_Maintenance.isEnabled()) {
        Cancel_Maintenance.setForeground(Color.GRAY);
        Cancel_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar-42GIF.gif")));
       }
    }//GEN-LAST:event_Cancel_MaintenanceMouseEntered

    /**
    * Button Animation.
    * @author jonns
    */
    private void Cancel_MaintenanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_MaintenanceMouseExited
       if (Cancel_Maintenance.isEnabled()) {
       Cancel_Maintenance.setForeground(Color.black);
       Cancel_Maintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar-32.png")));
       }
    }//GEN-LAST:event_Cancel_MaintenanceMouseExited

    /**
    * Reset all textfill in the screen.
    * @author jonns
    */
    private void Reset_Texts(){
        Component[] components = MaintenanceView.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText("");
            }
        }
    }
    
    /**
    * Delete this panel.
    * @author jonns
    */
    private static void borrarPanel(JPanel panel) {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }
    
    /**
    * Show this panel
    * @author jonns
    */
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
