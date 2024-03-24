package lecture5_class_properties;

class Phone {
    // attributes
    private int id;
    private String type;
    private String model;
    private String operatingSystem;
    private String imageUrl;


    // properties
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        if (!type.equalsIgnoreCase("Xiaomi")) {
            this.type = type;
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    // other methods
    public String powerOn() {
        System.out.println("########");
        System.out.println(this.operatingSystem);
        System.out.println("###########");
        System.out.println("Launching....");
        System.out.println("Hello world!");
        return "asd";
    }
}


