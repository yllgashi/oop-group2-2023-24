package lecture69_generics;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);

        Student student1 = new Student();
        student1.setId(2);

        getLatestPerson(employee1, student1);
    }

    public static <T extends Person> T getLatestPerson(T a, T b) {
        // we can get ".getId()" method because we know for sure T extends Person
        if (a.getId() > b.getId()) return a;
        else return b;
    }
}
