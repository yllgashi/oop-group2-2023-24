package lecture33_football_league;

import java.time.LocalDate;

class Manager extends Person {
    private LocalDate contractDate;
    private double salary;

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
