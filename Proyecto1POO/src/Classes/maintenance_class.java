/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Maintenance Class: To manage Maintenances.
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
    
    /**
    * Method to get the service id.
    * @author josem
    * @return the getted service_id
    */
    public int getService_id() {
        return service_id;
    }
    
    /**
    * Method to get the customer id.
    * @author josem
    * @return the getted customer_id
    */
    public String getCustomer_id() {
        return customer_id;
    }
    
    /**
    * Method to get the bicycle brand.
    * @author josem
    * @return the getted bicycle_brand
    */
    public String getBicycle_brand() {
        return bicycle_brand;
    }
    
    /**
    * Method to get the bicycle description.
    * @author josem
    * @return the getted bicycle_description
    */
    public String getBicycle_description() {
        return bicycle_description;
    }
    
    /**
    * Method to get the service price.
    * @author josem
    * @return the getted maintenance_price
    */
    public int getMaintenance_price() {
        return maintenance_price;
    }
    
    /**
    * Method to get the received date.
    * @author josem
    * @return the getted received_date
    */
    public Date getReceived_date() {
        return received_date;
    }
    
    /**
    * Method to get the delivery date.
    * @author josem
    * @return the getted delivery_date
    */
    public Date getDelivery_date() {
        return delivery_date;
    }
    
    /**
    * Method to get the maintenance observations.
    * @author josem
    * @return the getted maintenance_observations
    */
    public String getMaintenance_observations() {
        return maintenance_observations;
    }
    
    /**
    * Method to get the maintenance state.
    * @author josem
    * @return the getted maintenance_state
    */
    public String getMaintenance_state() {
        return maintenance_state;
    }

    
    //Setter Methods
    
    /**
    * Method to set the service id
    * @author josem
    * @param service_id: The data to set in the object id
    */
    public void setService_id(int service_id) {
        this.service_id = service_id;
    }
    
    /**
    * Method to set the customer id
    * @author josem
    * @param customer_id: The data to set in the object id
    */
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    
    /**
    * Method to set the bicycle brand
    * @author josem
    * @param bicycle_brand: The data to set in the object bicycle brand
    */
    public void setBicycle_brand(String bicycle_brand) {
        this.bicycle_brand = bicycle_brand;
    }
    
    /**
    * Method to set the bicycle description
    * @author josem
    * @param bicycle_description: The data to set in the object bicycle description
    */
    public void setBicycle_description(String bicycle_description) {
        this.bicycle_description = bicycle_description;
    }
    
    /**
    * Method to set the maintenance price
    * @author josem
    * @param maintenance_price: The data to set in the object price
    */
    public void setMaintenance_price(int maintenance_price) {
        this.maintenance_price = maintenance_price;
    }
    
    /**
    * Method to set the received date
    * @author josem
    * @param received_date: The data to set in the object received date
    */
    public void setReceived_date(Date received_date) {
        this.received_date = received_date;
    }
    
    /**
    * Method to set the delivery date
    * @author josem
    * @param delivery_date: The data to set in the object delivery date
    */
    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }
    
    /**
    * Method to set the maintenance observations
    * @author josem
    * @param maintenance_observations: The data to set in the object observations
    */
    public void setMaintenance_observations(String maintenance_observations) {
        this.maintenance_observations = maintenance_observations;
    }
    
    /**
    * Method to set the maintenance state
    * @author josem
    * @param maintenance_state: The data to set in the object state
    */
    public void setMaintenance_state(String maintenance_state) {
        this.maintenance_state = maintenance_state;
    }
}
