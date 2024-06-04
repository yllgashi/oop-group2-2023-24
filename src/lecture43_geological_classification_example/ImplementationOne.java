package lecture43_geological_classification_example;

import java.util.Scanner;

public class ImplementationOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Write rock name: ");
            String rockString = scanner.nextLine().toUpperCase();

            switch (rockString) {
                case "GRANITE":
                    Granite obj1 = new Granite();
                    System.out.println(obj1.getDescription());
                    break;
                case "CHALK":
                    Chalk obj2 = new Chalk();
                    System.out.println(obj2.getDescription());
                    break;
                default:
                    System.out.println("Not registered in system");
            }
        }
    }
}
