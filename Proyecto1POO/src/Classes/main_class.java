
package Classes;
import java.util.*;

public class main_class {
    public static ArrayList<item_class> items;
    
    public static void main_item(String[] args){
        items = new ArrayList<>();
    }
    
    public ArrayList<customer_class> customers_list = new ArrayList<>();
    
    public void initializeCustomersList(){
        customer_class object = new customer_class();
        object.setCustomer_id(1);
        object.setCustomer_name("Mario");
        object.setCustomer_lastname("Nigger");
        customers_list.add(object);
    }
}
