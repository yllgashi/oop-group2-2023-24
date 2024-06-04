package lecture50_exceptions_1;

import java.util.Scanner;

class HandleExpetionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Write a NUMBER: ");
                sum += Integer.parseInt(scanner.nextLine());
            }
            System.out.println("Final calculation: " + sum);

        } catch (ArithmeticException ex) {

            System.out.println("Arithmetic exception has happened...");

        } catch (NumberFormatException ex) {

            System.out.println("Invalid user input...");

        } catch (Exception ex) {

            System.out.println("Other type of error has happened...");

        }

        System.out.println("Application is running...");
    }
}
