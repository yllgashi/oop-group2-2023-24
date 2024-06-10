package lecture50_exceptions_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicApplicationWithEHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Write a number");
            int numberOne = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Write a name with 4 characters");
            String name = scanner.nextLine();
            if (name.length() != 4) throw new UnsupportedOperationException();


            // ...
        } catch (InputMismatchException ex) {
            System.out.println("This is not a valid number");
        } catch (UnsupportedOperationException ex) {
            System.out.println("Name should have only 4 characters");
        } catch (Exception ex) {
            System.out.println("Other exception");
        }
    }
}
