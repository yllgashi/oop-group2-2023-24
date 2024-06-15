package lecture62_static;

import java.util.ArrayList;


// static members of class are class-level
class Person {
    // static members
    private static int incrementingId = 0;
    public static ArrayList<Person> people = new ArrayList<>();

    // non-static members
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.setId();
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        incrementingId += 1;
        this.id = incrementingId;
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
}
