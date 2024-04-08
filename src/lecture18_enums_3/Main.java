package lecture18_enums_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Brand.BMW); // print BMW
        System.out.println(Brand.MERCEDES); // print MERCEDES
        System.out.println(Brand.VW); // print VW

        // Brand brand1 = "BMW"; // syntax error (we need to convert)
        Brand brand2 = Brand.valueOf("BMW");


        // Brand.values() gives us an array of each enum value (instance)
        for (Brand c : Brand.values()) {
            System.out.println(c);
        }

        // get enum value from scanner
        Scanner scanner = new Scanner(System.in);
        Brand brand3 = Brand.valueOf(scanner.nextLine().toUpperCase());
    }
}