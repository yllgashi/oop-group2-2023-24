package lecture2_classes;

import java.time.LocalDate;

class Person {
    String id;
    String firstName;
    String lastName;
    LocalDate birthYear;
    String birthplace;
    String eyeColor;
    char gender;
    int height;

    public void introduceYourself() {
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
