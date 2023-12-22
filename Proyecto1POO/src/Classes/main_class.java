
package Classes;
import java.util.*;

/**
* Main Class: To manage Lists.
* @author josem
*/
public class main_class {
    public static ArrayList<item_class> items;
    public static ArrayList<category_class> products;
    public static ArrayList<customer_class> customers;
    public static ArrayList<maintenance_class> maintenance;
    public static ArrayList<id_class> ids;
    public static ArrayList<register_users> users;
    
    /**
    * Method to create the items arraylist.
    * @author josem
    * @param args an array to start the arraylist.
    */
    public static void main_item(String[] args){
        items = new ArrayList<>();
    }
    
    /**
    * Method to create the id's arraylist.
    * @author josem
    * @param args an array to start the arraylist.
    */
    public static void main_id(String[] args){
        ids = new ArrayList<>();
    }
    
    /**
    * Method to create the products arraylist.
    * @author josem
    * @param args an array to start the arraylist.
    */
    public static void main_product(String[] args){
        products = new ArrayList<>();
    }
    
    /**
    * Method to create the customers arraylist.
    * @author josem
    * @param args an array to start the arraylist.
    */
    public static void main_customer(String[] args){
        customers = new ArrayList<>();
    }
    
    /**
    * Method to create the maintenance arraylist.
    * @author josem
    * @param args an array to start the arraylist.
    */
    public static void main_maintenance(String[] args){
        maintenance = new ArrayList<>();
    }
    
    /**
    * Method to create the users arraylist.
    * @author josem
    * @param args an array to start the arraylist.
    */
    public static void main_users(String[] args) {
        users = new ArrayList<>();
    }
}
