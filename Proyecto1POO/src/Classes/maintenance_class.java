/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author josem
 */
public class maintenance_class {
    private int service_id;
    private int customer_id;
    private String bicyle_brand;
    private String bicycle_description;
    private int maintenance_price;
    private String received_date;
    private String delivery_date;
    private String maintenance_observations;
    private String maintenance_state;

    
    //Getter Methods
    public int getService_id() {
        return service_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getBicyle_brand() {
        return bicyle_brand;
    }

    public String getBicycle_description() {
        return bicycle_description;
    }

    public int getMaintenance_price() {
        return maintenance_price;
    }

    public String getReceived_date() {
        return received_date;
    }

    public String getDelivery_date() {
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

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setBicyle_brand(String bicyle_brand) {
        this.bicyle_brand = bicyle_brand;
    }

    public void setBicycle_description(String bicycle_description) {
        this.bicycle_description = bicycle_description;
    }

    public void setMaintenance_price(int maintenance_price) {
        this.maintenance_price = maintenance_price;
    }

    public void setReceived_date(String received_date) {
        this.received_date = received_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public void setMaintenance_observations(String maintenance_observations) {
        this.maintenance_observations = maintenance_observations;
    }

    public void setMaintenance_state(String maintenance_state) {
        this.maintenance_state = maintenance_state;
    }
}
