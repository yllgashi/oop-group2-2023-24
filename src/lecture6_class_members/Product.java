package lecture6_class_members;


/*
    Class it is a blueprint for objects

    Class can have:
        Variables (data members)
        Methods (functional members)

    Objects of a class will have:
        Attributes (from variables)
        Behaviours (from methods)
 */

// class
class Product {

    // attributes (hidden from outside, accessible only through properties)
    private int id;
    private String name;


    // constructor
    public Product() {

    }


    // properties
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


    // other methods
    public void changeProductIdAndName(int id, String name) {
        // ...
    }
}
