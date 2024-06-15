package lecture62_static;

public class Main {
    public static void main(String[] args) {
        // you should create an object in order to call non-static members
        // Main main = new Main();
        // calculateTwoNumbers(1, 2);


        // use Person static and non-static members
        Person person1 = new Person("Filan", "Fisteku");
        Person person2 = new Person("Testim", "Testeri");

        Person.people.add(person1);
        Person.people.add(person2);
    }

    public void calculateTwoNumbers(int a, int b) {
        System.out.println(a + b);
        // main();
    }
}
