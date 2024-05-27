package lecture37_method_overriding;

class Person {

    // attributes
    private int id;
    private String firstName;
    private String lastName;


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    // method to be overriding
    public void printInformation() {
        System.out.println("ID: " + this.getId());
        System.out.println("FirstName: " + this.getFirstName());
        System.out.println("LastName: " + this.getLastName());
    }

    // stop method from overriding (with keyword final)
    public final void doNotChange() {
        System.out.println("This method cannot be override from child classes");
    }

}