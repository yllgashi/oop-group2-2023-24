package lecture64_generics_1;

import lecture11_encapsulation_1.Person;

class MathCalculations {

//    public static int giveLastElement(int a, int b) {
//        return b;
//    }
//
//    public static double giveLastElement(double a, double b) {
//        return b;
//    }

//    public static boolean giveLastElement(boolean a, boolean b) {
//        return b;
//    }
//
//    public static Person giveLastElement(Person a, Person b) {
//        return a;
//    }

    public static <T> T giveLastElement(T a, T b) {
        return b;
    }
}
