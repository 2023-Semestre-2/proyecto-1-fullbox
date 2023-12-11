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
    private int client_id;
    private int bill_date;
    private String bill_state = "Válido";
    private int bill_subtotal;
    private int bill_tax;
    private int bill_total;

    
    //Setter Methods
    
    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setBill_date(int bill_date) {
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

    public int getClient_id() {
        return client_id;
    }

    public int getBill_date() {
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

