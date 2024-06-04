package lecture45_polymorphism_1;

class Bank {
    private int id;
    private String name;
    private int createYear;


    public Bank(int id, String name, int createYear) {
        this.setId(id);
        this.setName(name);
        this.setCreateYear(createYear);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public double getRateOfInterest() {
        return 0.00;
    }
}
