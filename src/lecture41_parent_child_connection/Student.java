package lecture41_parent_child_connection;

class Student extends Person {
    private double averageGrade;

    public Student(int id, String firstName, String lastName, double averageGrade) {
        super(id, firstName, lastName);
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
//        return "ID: " + this.id +
//                ", FirstName: " + this.firstName +
//                ", LastName: " + this.lastName +
//                ", AverageGrade: " + this.averageGrade;
        return super.toString() +
                ", AverageGrade: " + this.averageGrade;
    }
}
