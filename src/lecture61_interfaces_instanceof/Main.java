package lecture61_interfaces_instanceof;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        if (dog instanceof Dog) {
            System.out.println("dog its an instance of Dog");
        }

        if (dog instanceof Animal) {
            System.out.println("dog its an instance of Animal");
        }

        if (dog instanceof Pet) {
            System.out.println("dog its an instance of Pet");
        }
    }
}
