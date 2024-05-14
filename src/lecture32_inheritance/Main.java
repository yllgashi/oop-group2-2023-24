package lecture32_inheritance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.setId(1); // attribute of Person
        professor1.setFirstName("Yll"); // attribute of Person
        professor1.setLastName("Gashi"); // attribute of Person
        professor1.setPersonalNumber("12345"); // attribute of Person
        professor1.setSalary(10); // attribute of Professor
        professor1.setContractDate(LocalDate.now()); // attribute of Professor


        Student student1 = new Student();
        student1.setId(1); // attribute of Person
        student1.setFirstName("Filan"); // attribute of Person
        student1.setLastName("Fisteku"); // attribute of Person
        student1.setPersonalNumber("678910"); // attribute of Person
        student1.setGeneration("2023/24"); // attribute of Student
        student1.setAverageGrade(10.0); // attribute of Student
        student1.setMajor("Computer science"); // attribute of Student
    }
}
