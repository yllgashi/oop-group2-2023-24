package lecture39_object;


/*
    If we don't set any parent to this class
    (if we don't write "class Person extends ...")
    then by default this class extends class "Object"


    You don't need to write "... extends Object"
    because it is added in background
 */
class Person extends Object {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

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


    @Override
    public String toString() {
        String objectDescription = "ID: " + this.getId()
                + ", FirstName: " + this.getFirstName()
                + ", LastName: " + this.getLastName();
        return objectDescription;
    }

    @Override
    public boolean equals(Object obj) {
        Person objectAsPerson = (Person) obj;
        String firstNameOfObjectOne = this.getFirstName();
        String firstNameOfObjectTwo = objectAsPerson.getFirstName();
//        boolean haveSameFirstName = firstNameOfObjectOne == firstNameOfObjectTwo;
        boolean haveSameFirstName = firstNameOfObjectOne.equals(firstNameOfObjectTwo);
        return haveSameFirstName;
    }
}
