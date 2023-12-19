/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Maintenance Class: Create new Maintenances
 * @author josem
 */
public class maintenance_class {
    private int service_id;
    private String customer_id;
    private String bicycle_brand;
    private String bicycle_description;
    private int maintenance_price;
    private Date received_date;
    private Date delivery_date;
    private String maintenance_observations;
    private String maintenance_state;

    
    //Getter Methods
    public int getService_id() {
        return service_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getBicycle_brand() {
        return bicycle_brand;
    }

    public String getBicycle_description() {
        return bicycle_description;
    }

    public int getMaintenance_price() {
        return maintenance_price;
    }

    public Date getReceived_date() {
        return received_date;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public String getMaintenance_observations() {
        return maintenance_observations;
    }

    public String getMaintenance_state() {
        return maintenance_state;
    }

    
    //Setter Methods
    
    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setBicycle_brand(String bicycle_brand) {
        this.bicycle_brand = bicycle_brand;
    }

    public void setBicycle_description(String bicycle_description) {
        this.bicycle_description = bicycle_description;
    }

    public void setMaintenance_price(int maintenance_price) {
        this.maintenance_price = maintenance_price;
    }

    public void setReceived_date(Date received_date) {
        this.received_date = received_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public void setMaintenance_observations(String maintenance_observations) {
        this.maintenance_observations = maintenance_observations;
    }

    public void setMaintenance_state(String maintenance_state) {
        this.maintenance_state = maintenance_state;
    }
}
