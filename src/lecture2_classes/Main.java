package lecture2_classes;

import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Road rruga1 = new Road();
        rruga1.id = 1;
        rruga1.name = "Rr. Filan Fisteku";
        rruga1.length = 10000;
        System.out.println(rruga1.id);
        System.out.println(rruga1.name);
        System.out.println(rruga1.length);

        Road rruga2 = new Road();
        rruga2.id = 2;
        rruga2.name = "Rr. Cacttus Education";
        rruga2.length = 20000;

        Person ylli = new Person();
        ylli.id = "12346578";
        ylli.firstName = "Yll";
        ylli.lastName = "Gashi";
        ylli.birthYear = LocalDate.now();
        ylli.gender = 'M';

        Person filane = new Person();
        filane.id = "12346579";
        filane.firstName = "Filane";
        filane.lastName = "Fisteku";
        filane.birthYear = LocalDate.now();
        filane.gender = 'F';

        System.out.println(filane.id);
        System.out.println(filane.birthYear);
        System.out.println(filane.gender);
        System.out.println(filane.eyeColor); // vlera default
        System.out.println(filane.height); // vlera default

        System.out.println("############");

        ylli.introduceYourself();
        filane.introduceYourself();

        System.out.println("############");
        Player maradona = new Player();
        maradona.lastName = "Maradona";

        Player messi = new Player();
        messi.lastName = "Messi";
    }
}
