package lecture2_classes;

import java.time.LocalDate;

class Player {
    int id;
    String firstName;
    String lastName;
    String clubName;
    String nationality;
    LocalDate birthYear;
    double height;
    String position;

    public void nderroEkip(String ekipiRi) {
        clubName = ekipiRi;
    }
}
