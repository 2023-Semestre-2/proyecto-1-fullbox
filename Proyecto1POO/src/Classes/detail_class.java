/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Detail Class: To manage the details already printed.
 * @author josem
 */
public class detail_class {
    private int detail_id;
    private int bill_id;
    private int number_details;
    private int unit_price;
    private int detail_total;
    
    //Getters
    public int getDetail_id() {
        return detail_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public int getNumber_details() {
        return number_details;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public int getDetail_total() {
        return detail_total;
    }
    
    //Setters
    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public void setNumber_details(int number_details) {
        this.number_details = number_details;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    public void setDetail_total(int detail_total) {
        this.detail_total = detail_total;
    }
    
    
}
