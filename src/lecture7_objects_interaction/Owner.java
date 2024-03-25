package lecture7_objects_interaction;

class Owner {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void orderDog(String dogName, String message) {
        System.out.println("I am " + dogName);
    }

    public void orderDog(Dog dog, String message) {
        dog.speak();
    }
}




