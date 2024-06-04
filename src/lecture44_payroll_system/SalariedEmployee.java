package lecture44_payroll_system;

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Salary: " + this.getSalary();
    }
}
