package lecture24_exercises;

import java.util.Scanner;

public class EnumExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Using ProcessorType enum
        System.out.print("Write processor type: ");
        ProcessorType processorType = ProcessorType.valueOf(scanner.nextLine().toUpperCase());

        switch (processorType) {
            case INTEL:
                System.out.println("You typed Intel");
                break;
            case AMD:
                System.out.println("You typed AMD");
                break;
        }


        // Using RamType enum
        System.out.print("Write Ram type: ");
        RamType ramType = RamType.valueOf(scanner.nextLine().toUpperCase());

        switch (ramType) {
            case DRAM:
                System.out.println(ramType.getDescription());
                break;
            case SRAM:
                System.out.println(ramType.getDescription());
                break;
            case SDRAM:
                System.out.println(ramType.getDescription());
                break;
        }
    }
}
