package lecture37_method_overriding;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(1);
        p1.setFirstName("Filan1");
        p1.setLastName("Filan1");
        p1.printInformation();


        Student s1 = new Student();
        s1.setId(2);
        s1.setFirstName("Filan2");
        s1.setLastName("Filan2");
        s1.setAverageGrade(9.5);
//        s1.printStudentInformation();
        s1.printInformation();


        Teacher t1 = new Teacher();
        t1.setId(3);
        t1.setFirstName("Filan3");
        t1.setLastName("Filan3");
        t1.setSalary(100);
//        t1.printTeacherInformation();
        t1.printInformation();
    }
}
