/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author josem
 */
public class client_class {
    private int client_id;
    private String client_name;
    private String client_lastname;
    private int client_phone;
    private String client_email;
    private String client_province;
    private String client_canton;
    private String client_district;
    private String client_birthdate;

    
    //Getter Methods
    public int getClient_id() {
        return client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getClient_lastname() {
        return client_lastname;
    }

    public int getClient_phone() {
        return client_phone;
    }

    public String getClient_email() {
        return client_email;
    }

    public String getClient_province() {
        return client_province;
    }

    public String getClient_canton() {
        return client_canton;
    }

    public String getClient_district() {
        return client_district;
    }

    public String getClient_birthdate() {
        return client_birthdate;
    }

    
    //Setter Methods
    
    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public void setClient_lastname(String client_lastname) {
        this.client_lastname = client_lastname;
    }

    public void setClient_phone(int client_phone) {
        this.client_phone = client_phone;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public void setClient_province(String client_province) {
        this.client_province = client_province;
    }

    public void setClient_canton(String client_canton) {
        this.client_canton = client_canton;
    }

    public void setClient_district(String client_district) {
        this.client_district = client_district;
    }

    public void setClient_birthdate(String client_birthdate) {
        this.client_birthdate = client_birthdate;
    }
}
