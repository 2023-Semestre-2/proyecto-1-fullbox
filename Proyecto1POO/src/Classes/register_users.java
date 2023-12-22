/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Class to register the user set and get
 * @author saimo
 */
public class register_users {
    private String username;
    private String password;
    private String RecoveryEmail;
    private boolean remember;
    
    //Getters
    
    /**
    * Method to get the user name.
    * @author josem
    * @return the getted username
    */
    public String getUsername() {
        return username;
    }
    
    /**
    * Method to get the user password.
    * @author josem
    * @return the getted passsword
    */
    public String getPassword() {
        return password;
    }

    public String getRecoveryEmail() {
        return RecoveryEmail;
    }

    public void setRecoveryEmail(String RecoveryEmail) {
        this.RecoveryEmail = RecoveryEmail;
    }
    
    /**
    * Method to get the user remember me option.
    * @author josem
    * @return the getted remember
    */
    public boolean getRemember() {
        return remember;
    }
    
    //Setters
    
    /**
    * Method to set the user name
    * @author josem
    * @param username: The data to set in the user name
    */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
    * Method to set the user password
    * @author josem
    * @param password: The data to set in the user password
    */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
    * Method to set the user remember me option
    * @author josem
    * @param remember: The data to set in the user set remember
    */
    public void setRemember(boolean remember) {
        this.remember = remember;
    }
    
    
  
}
