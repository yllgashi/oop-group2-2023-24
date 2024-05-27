package lecture38_class_hierarchy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Business business = new Business(1, "BusinessA");
        // "business" has access only in Business attributes and methods
        business.getId();
        business.getName();

        RetailBusiness retailBusiness = new RetailBusiness(2, "BusinessB", new ArrayList<>());
        // "retailBusiness" has access in Business AND RetailBusiness attributes and methods
        retailBusiness.getId();
        retailBusiness.getName();
        retailBusiness.getProducts();

        RetailA retailA = new RetailA(3, "BusinessC", new ArrayList<>(), 10);
        // "retailA" has access in Business, RetailBusiness AND RetailA attributes and methods
        retailA.getId();
        retailA.getName();
        retailA.getProducts();
        retailA.getCategory();
    }
}
