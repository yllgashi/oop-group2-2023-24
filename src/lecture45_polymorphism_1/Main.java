package lecture45_polymorphism_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new KosovaBank(1, "Kosova", 2000);
        Bank bank2 = new AlbaniaBank(2, "Albania", 1999);

        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(bank1);
        banks.add(bank2);

        System.out.println("Bank 1 interest rate: " + banks.get(0).getRateOfInterest());
        System.out.println("Bank 2 interest rate: " + banks.get(1).getRateOfInterest());
    }
}
