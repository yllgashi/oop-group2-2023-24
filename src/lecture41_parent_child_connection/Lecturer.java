package lecture41_parent_child_connection;

class Lecturer extends Person {
    private double salary;

    public Lecturer(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
//        return "ID: " + this.id +
//                ", FirstName: " + this.firstName +
//                ", LastName: " + this.lastName +
//                ", Salary: " + this.salary;
        return super.toString() +
                ", Salary: " + this.salary;
    }
}
