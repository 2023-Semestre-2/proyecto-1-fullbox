/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author josem
 */
public class bill_class {
    private int bill_id;
    private int customer_id;
    private String bill_date;
    private String bill_state = "Válido";
    private int bill_subtotal;
    private int bill_tax;
    private int bill_total;

    
    //Setter Methods
    
    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public void setBill_state(String bill_state) {
        this.bill_state = bill_state;
    }

    public void setBill_subtotal(int bill_subtotal) {
        this.bill_subtotal = bill_subtotal;
    }

    public void setBill_tax(int bill_tax) {
        this.bill_tax = bill_tax;
    }

    public void setBill_total(int bill_total) {
        this.bill_total = bill_total;
    }
    
    
    //Getter Methods
    
    public int getBill_id() {
        return bill_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getBill_date() {
        return bill_date;
    }

    public String getBill_state() {
        return bill_state;
    }

    public int getBill_subtotal() {
        return bill_subtotal;
    }

    public int getBill_tax() {
        return bill_tax;
    }

    public int getBill_total() {
        return bill_total;
    }
}

