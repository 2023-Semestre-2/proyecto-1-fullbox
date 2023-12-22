/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Bill Class: To manage bills.
 * @author josem
 */
public class bill_class {
    private int bill_id;
    private int customer_id;
    private Date bill_date;
    private String bill_state = "Válido";
    private int bill_subtotal;
    private int bill_tax;
    private int bill_total;

    
    //Setter Methods
    
    /**
    * Method to set the bill id
    * @author josem
    * @param bill_id: The data to set in the object id
    */
    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }
    
    /**
    * Method to set the customer id
    * @author josem
    * @param customer_id: The data to set in the object id
    */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    
    /**
    * Method to set the bill date
    * @author josem
    * @param bill_date: The data to set in the object date
    */
    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }
    
    /**
    * Method to set the bill state
    * @author josem
    * @param bill_state: The data to set in the object state
    */
    public void setBill_state(String bill_state) {
        this.bill_state = bill_state;
    }
    
    /**
    * Method to set the bill subtotal
    * @author josem
    * @param bill_subtotal: The data to set in the object subtotal
    */
    public void setBill_subtotal(int bill_subtotal) {
        this.bill_subtotal = bill_subtotal;
    }
    
    /**
    * Method to set the bill tax
    * @author josem
    * @param bill_tax: The data to set in the object tax
    */
    public void setBill_tax(int bill_tax) {
        this.bill_tax = bill_tax;
    }
    
    /**
    * Method to set the bill total
    * @author josem
    * @param bill_total: The data to set in the object total
    */
    public void setBill_total(int bill_total) {
        this.bill_total = bill_total;
    }
    
    
    //Getter Methods
    
    /**
    * Method to get the bill id.
    * @author josem
    * @return the getted bill_id
    */
    public int getBill_id() {
        return bill_id;
    }
    
    /**
    * Method to get the customer id.
    * @author josem
    * @return the getted customer_id
    */
    public int getCustomer_id() {
        return customer_id;
    }
    
    /**
    * Method to get the bill date.
    * @author josem
    * @return the getted bill_date
    */
    public Date getBill_date() {
        return bill_date;
    }
    
    /**
    * Method to get the bill state.
    * @author josem
    * @return the getted bill_state
    */
    public String getBill_state() {
        return bill_state;
    }
    
    /**
    * Method to get the bill subtotal.
    * @author josem
    * @return the getted bill_subtotal
    */
    public int getBill_subtotal() {
        return bill_subtotal;
    }
    
    /**
    * Method to get the bill tax.
    * @author josem
    * @return the getted bill_tax
    */
    public int getBill_tax() {
        return bill_tax;
    }
    
    /**
    * Method to get the bill total.
    * @author josem
    * @return the getted bill_total
    */
    public int getBill_total() {
        return bill_total;
    }
}

