/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Customer Class: Create new customers
 * @author josem
 */
public class customer_class {
    private int customer_id;
    private String customer_name;
    private String customer_lastname;
    private int customer_phone;
    private String customer_email;
    private String customer_province;
    private String customer_canton;
    private String customer_district;
    private Date customer_birthdate;
    
    //Getter Methods
    
    /**
    * Method to get the customer id.
    * @author josem
    * @return the getted customer_id
    */
    public int getCustomer_id() {
        return customer_id;
    }
    
    /**
    * Method to get the customer name.
    * @author josem
    * @return the getted customer_name
    */
    public String getCustomer_name() {
        return customer_name;
    }
    
    /**
    * Method to get the customer lastname.
    * @author josem
    * @return the getted customer_lastname
    */
    public String getCustomer_lastname() {
        return customer_lastname;
    }
    
    /**
    * Method to get the customer phone.
    * @author josem
    * @return the getted customer_phone
    */
    public int getCustomer_phone() {
        return customer_phone;
    }
    
    /**
    * Method to get the customer email.
    * @author josem
    * @return the getted customer_email
    */
    public String getCustomer_email() {
        return customer_email;
    }
    
    /**
    * Method to get the customer province.
    * @author josem
    * @return the getted customer_province
    */
    public String getCustomer_province() {
        return customer_province;
    }
    
    /**
    * Method to get the customer canton.
    * @author josem
    * @return the getted customer_canton
    */
    public String getCustomer_canton() {
        return customer_canton;
    }
    
    /**
    * Method to get the customer district.
    * @author josem
    * @return the getted customer_district
    */
    public String getCustomer_district() {
        return customer_district;
    }
    
    /**
    * Method to get the customer birthdate.
    * @author josem
    * @return the getted customer_birthdate
    */
    public Date getCustomer_birthdate() {
        return customer_birthdate;
    }

    
    //Setter Methods
    
    /**
    * Method to set the customer id
    * @author josem
    * @param customer_id: The data to set in the object id
    */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    
    /**
    * Method to set the customer name
    * @author josem
    * @param customer_name: The data to set in the object name
    */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    
    /**
    * Method to set the customer lastname
    * @author josem
    * @param customer_lastname: The data to set in the object lastname
    */
    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }
    
    /**
    * Method to set the customer phone
    * @author josem
    * @param customer_phone: The data to set in the object phone
    */
    public void setCustomer_phone(int customer_phone) {
        this.customer_phone = customer_phone;
    }
    
    /**
    * Method to set the customer email
    * @author josem
    * @param customer_email: The data to set in the object email
    */
    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }
    
    /**
    * Method to set the customer province
    * @author josem
    * @param customer_province: The data to set in the object province
    */
    public void setCustomer_province(String customer_province) {
        this.customer_province = customer_province;
    }
    
    /**
    * Method to set the customer canton
    * @author josem
    * @param customer_canton: The data to set in the object canton
    */
    public void setCustomer_canton(String customer_canton) {
        this.customer_canton = customer_canton;
    }
    
    /**
    * Method to set the customer district
    * @author josem
    * @param customer_district: The data to set in the object district
    */
    public void setCustomer_district(String customer_district) {
        this.customer_district = customer_district;
    }
    
    /**
    * Method to set the customer birthdate
    * @author josem
    * @param customer_birthdate: The data to set in the object birthdate
    */
    public void setCustomer_birthdate(Date customer_birthdate) {
        this.customer_birthdate = customer_birthdate;
    }
}
