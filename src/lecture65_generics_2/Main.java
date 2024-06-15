package lecture65_generics_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add("Testim Testeri");

        // best version
        // int a = (int) arrayList1.get(0);
        // String b = (String) arrayList1.get(1);

        // syntax error
        // int a = (String) arrayList1.get(0);
        // String b = (int) arrayList1.get(1);


        // runtime error (cannot perform a type-check)
        // int a = (int) arrayList1.get(1); // cannot store "Testim Testeri" into int
        // String b = (String) arrayList1.get(0); // cannot store 1 into String



        //
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Testim Testeri");
//        arrayList2.add(2); // syntax error
    }
}
