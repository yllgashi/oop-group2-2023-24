package lecture46_final;

public class Main {
    public static void main(String[] args) {
        /*
            1. Final variable -> You cannot change value of final constant
            2. Final method -> You cannot change implementation (body) of method in children classes
            3. Final class -> You cannot create children from final class
         */



        final double PI_VALUE = 3.14; // you cannot change value of final variable

        Human obj1 = new Human();
        Lion obj2 = new Lion();
        obj1.breath();  // you cannot change implementation (body) of final method
        obj2.breath();  // you cannot change implementation (body) of final method
    }
}
