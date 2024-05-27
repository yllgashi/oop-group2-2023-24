package lecture38_class_hierarchy;

import java.util.ArrayList;

public class RetailA extends RetailBusiness {

    private int category;

    public RetailA(int id, String name, ArrayList<String> products, int category) {
        super(id, name, products);
        this.setCategory(category);
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
