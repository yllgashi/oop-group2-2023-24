package lecture0_recap;

public class FencepostProblem {
    public static void main(String[] args) {
        String text = "Cacttus";
//        printLettersOptionOne(text);
//        printLettersOptionTwo(text);
        printLettersOptionThree(text);
    }

    public static void printLettersOptionOne(String textOne) {
        for (int i = 0; i < textOne.length(); i++) {
            System.out.print(textOne.charAt(i));
            if (i != textOne.length() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printLettersOptionTwo(String textOne) {
        System.out.print(textOne.charAt(0));
        for (int i = 1; i < textOne.length(); i++) {
            System.out.print("," + textOne.charAt(i));
        }
        System.out.println();
    }

    public static void printLettersOptionThree(String textOne) {
        for (int i = 0; i < textOne.length() - 1; i++) {
            System.out.print(textOne.charAt(i) + ",");
        }
        int lastIndex = textOne.length() - 1;
        char lastChar = textOne.charAt(lastIndex);
        System.out.print(lastChar);
        System.out.println();
    }
}
