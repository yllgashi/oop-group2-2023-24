package lecture38_class_hierarchy;

import java.util.ArrayList;

class RetailBusiness extends Business {
    private ArrayList<String> products;

    public RetailBusiness(int id, String name, ArrayList<String> products) {
        super(id, name);
        this.setProducts(products);
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }
}
