package lecture38_class_hierarchy;

import java.util.ArrayList;

public class ServiceBusiness extends Business {
    private ArrayList<String> services;

    public ServiceBusiness(int id, String name, ArrayList<String> services) {
        super(id, name);
        this.setServices(services);
    }


    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }
}
