package lecture39_object;

public class Main {
    public static void main(String[] args) {
        // we create obj1 object in which we have
        // attributes and methods of class "Person" and "Object"
        // because Person has parent "Object"
        Person obj1 = new Person(1, "Filan", "Fisteku");

        // we override implementation of method "toString()"
        System.out.println(obj1.toString());
        System.out.println(obj1); // same as obj1.toString()


        Person obj2 = new Person(2, "Testim", "Testeri");

        // we compare attribute "firstName" of two objeects and we print the result
        System.out.println("Is the same?: " + obj1.equals(obj2));
    }
}
