/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Category Class: To manage categories.
 * @author josem
 */
public class category_class {
    public int category_id;
    public String category_name;

    
    //Getter Methods
    
    /**
    * Method to get the category id.
    * @author josem
    * @return the getted category_id
    */
    public int getCategory_id() {
        return category_id;
    }
    
    /**
    * Method to get the category name.
    * @author josem
    * @return the getted category_name
    */
    public String getCategory_name() {
        return category_name;
    }

    //Setter Methods
    
    /**
    * Method to set the category id
    * @author josem
    * @param category_id: The data to set in the object id
    */
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
    /**
    * Method to set the category name
    * @author josem
    * @param category_name: The data to set in the object name
    */
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    } 
}
