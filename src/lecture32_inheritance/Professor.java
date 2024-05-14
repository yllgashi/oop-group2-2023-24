package lecture32_inheritance;

import java.time.LocalDate;

class Professor extends Person {
    //    private int id;
//    private String firstName;
//    private String lastName;
//    private String personalNumber;
    private double salary;
    private LocalDate contractDate;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }
}
