package lecture16_enums_1;

public class Main {
    public static void main(String[] args) {
        // before enums 1
        /*
        Scanner scanner = new Scanner(System.in);

        // all season values
        final String SPRING = "Spring";
        final String SUMMER = "Summer";
        final String FALL = "Fall";
        final String WINTER = "Winter";

        // input from user
        String choosenSeason = scanner.nextLine();

        if(choosenSeason.equals(SUMMER)) {
            System.out.println("Drink coffe inside/outside");
        }
        else if(choosenSeason.equals(WINTER)) {
            System.out.println("Drink coffe only inside");
        }
        else {
            System.out.println("I don't know");
        }
        */


        // before enums 2
        /*
        final String GENDER_MALE = "Male";
        final String GENDER_FEMALE = "Female";
        // 2

        final String MONTHS_JANUARY = "January";
        final String MONTHS_FEBRUARY = "February";
        // ... 12
         */

        // enums 1 (only for example, not executable)
        /*
        String inputFromUser = "Male";

        if (inputFromUser == Gender.MALE) {

        } else if (inputFromUser == Gender.FEMALE) {

        } else {

        }
        */

        // enums 2
        // option 1 (not recommended)
        final String GENDER_MALE = "Male";
        final String GENDER_FEMALE = "Female";
        System.out.println(GENDER_MALE);
        System.out.println(GENDER_FEMALE);

        // option 2 (recommended)
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);





    }
}