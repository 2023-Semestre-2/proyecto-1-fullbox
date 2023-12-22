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
    
    /**
    * Method to get the detail id.
    * @author josem
    * @return the getted detail_id
    */
    public int getDetail_id() {
        return detail_id;
    }
    
    /**
    * Method to get the bill id.
    * @author josem
    * @return the getted bill_id
    */
    public int getBill_id() {
        return bill_id;
    }
    
    /**
    * Method to get the detail number of items.
    * @author josem
    * @return the getted detail_number of items
    */
    public int getNumber_details() {
        return number_details;
    }
    
    /**
    * Method to get the detail unit price.
    * @author josem
    * @return the getted unit_price
    */
    public int getUnit_price() {
        return unit_price;
    }
    
    /**
    * Method to get the detail total.
    * @author josem
    * @return the getted detail_total
    */
    public int getDetail_total() {
        return detail_total;
    }
    
    //Setters
    
    /**
    * Method to set the detail id
    * @author josem
    * @param detail_id: The data to set in the object id
    */
    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }
    
    /**
    * Method to set the bill id
    * @author josem
    * @param bill_id: The data to set in the object bill id
    */
    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }
    
    /**
    * Method to set the detail numbers of items
    * @author josem
    * @param number_details: The data to set in the object numbers of items
    */
    public void setNumber_details(int number_details) {
        this.number_details = number_details;
    }
    
    /**
    * Method to set the detail unit price
    * @author josem
    * @param unit_price: The data to set in the object unit price
    */
    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }
    
    /**
    * Method to set the detail total
    * @author josem
    * @param detail_total: The data to set in the object total
    */
    public void setDetail_total(int detail_total) {
        this.detail_total = detail_total;
    }
}
