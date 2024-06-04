package lecture44_payroll_system;

class Programmer extends SalariedEmployee {
    private String programmingLanguages;

    public Programmer(int id, String firstName, String lastName, double salary, String programmingLanguages) {
        super(id, firstName, lastName, salary);
        this.setProgrammingLanguages(programmingLanguages);
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Programming languages: " + this.getProgrammingLanguages();
    }
}
