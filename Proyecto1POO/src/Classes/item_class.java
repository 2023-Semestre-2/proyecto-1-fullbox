
package Classes;

public class item_class {
    private int id_item;
    private int category_item;
    private String name_item;
    private String type_item;
    private Double size_item;
    private String brand_item;
    private int price_item;
    private int amount_item;

    
    //Setter Methods
    
    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public void setCategory_item(int category_item) {
        this.category_item = category_item;
    }

    public void setName_item(String name_item) {
        this.name_item = name_item;
    }

    public void setType_item(String type_item) {
        this.type_item = type_item;
    }

    public void setSize_item(Double size_item) {
        this.size_item = size_item;
    }

    public void setBrand_item(String brand_item) {
        this.brand_item = brand_item;
    }

    public void setPrice_item(int price_item) {
        this.price_item = price_item;
    }

    public void setAmount_item(int amount_item) {
        this.amount_item = amount_item;
    }

    
    //Getter Methods

    public int getCode_article() {
        return id_item;
    }

    public int getCategory_article() {
        return category_item;
    }

    public String getName_article() {
        return name_item;
    }

    public String getType_article() {
        return type_item;
    }

    public Double getSize_article() {
        return size_item;
    }

    public String getBrand_article() {
        return brand_item;
    }

    public int getPrice_article() {
        return price_item;
    }

    public int getAmount_article() {
        return amount_item;
    }
}

