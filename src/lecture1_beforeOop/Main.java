package lecture1_beforeOop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = kerkoNumerNgaPerdoruesi();
        int shuma = mbledhNeIndeksCiftNumratCift(number);
        System.out.println(shuma);
    }

    public static int kerkoNumerNgaPerdoruesi() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int mbledhNeIndeksCiftNumratCift(int number) {
        String numberInString = String.valueOf(number);
        int shuma = 0;
        for (int i = 0; i < numberInString.length(); i++) {
            char digitAsChar = numberInString.charAt(i);
            int digit = Character.getNumericValue(digitAsChar);
            if (i % 2 == 0 && digit % 2 == 0) {
                shuma += digit;
            }
        }
        return shuma;
    }
}
