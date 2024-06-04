package lecture47_object_is;

class Employee extends Person {
    private double salary;

    public Employee(String fullName, double salary) {
        super(fullName);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Salary: " + this.getSalary());
    }
}
