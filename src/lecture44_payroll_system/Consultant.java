package lecture44_payroll_system;

public class Consultant extends HourlyEmployee {
    private String courses;


    public Consultant(int id, String firstName, String lastName, int hours, double hourPrice, String courses) {
        super(id, firstName, lastName, hours, hourPrice);
        this.setCourses(courses);
    }


    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Courses: " + this.getCourses();
    }
}
