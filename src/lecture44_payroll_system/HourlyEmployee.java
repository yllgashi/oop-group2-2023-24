package lecture44_payroll_system;

class HourlyEmployee extends Employee {
    private int hours;
    private double hourPrice;

    public HourlyEmployee(int id, String firstName, String lastName, int hours, double hourPrice) {
        super(id, firstName, lastName);
        this.setHours(hours);
        this.setHourPrice(hourPrice);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    @Override
    public double pay() {
        return this.getHourPrice() * this.getHours();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Hours: " + this.getHours() +
                ", Hour price: " + this.getHourPrice();
    }
}
