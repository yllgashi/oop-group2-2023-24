package lecture41_parent_child_connection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Person personObject = new Person(1, "FirstName1", "LastName1");
//        System.out.println(personObject.toString());
//
//        Lecturer lecturerObject = new Lecturer(2, "FirstName2", "LastName2", 10);
//        System.out.println(lecturerObject.toString());
//
//        Student studentObject = new Student(3, "FirstName3", "LastName3", 9.9);
//        System.out.println(studentObject.toString());



        /*
            Treat each object of: Person, Student, Lecturer as "Person"

         */
        Person personObject = new Person(1, "FirstName1", "LastName1");
        System.out.println(personObject.toString());

        Person lecturerObject = new Lecturer(2, "FirstName2", "LastName2", 10);
        System.out.println(lecturerObject.toString());

        Person studentObject = new Student(3, "FirstName3", "LastName3", 9.9);
        System.out.println(studentObject.toString());


        /*
            Playing with pointers
         */
        Lecturer obj1 = new Lecturer(1, "1", "1", 100);
        Person obj2 = obj1;
        Lecturer obj3 = (Lecturer) obj2;

        /*
            What can I access?
         */
        Student studentObjAsStudent = new Student(1, "Studenti", "Dalluar", 10);
        studentObjAsStudent.getId(); // method of Person class
        studentObjAsStudent.getFirstName(); // method of Person class
        studentObjAsStudent.getLastName(); // method of Person class
        studentObjAsStudent.getAverageGrade(); // method of Student class

        Person studentObjAsPerson = studentObjAsStudent;
        studentObjAsPerson.getId(); // method of Person class
        studentObjAsPerson.getFirstName(); // method of Person class
        studentObjAsPerson.getLastName(); // method of Person class
        // studentObjAsPerson.getAverageGrade(); // NO ACCESS


        /*
            Create an arrayList of parent-type
         */
        System.out.println("######################");
        ArrayList<Person> people = new ArrayList<>();
        people.add(personObject);
        people.add(studentObject);
        people.add(lecturerObject);

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
