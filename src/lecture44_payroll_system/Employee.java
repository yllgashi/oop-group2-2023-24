package lecture44_payroll_system;

class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
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

    public double pay() {
        return 0.00;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() +
                ", FirstName: " + this.getFirstName() +
                ", LastName: " + this.getLastName();
    }
}
