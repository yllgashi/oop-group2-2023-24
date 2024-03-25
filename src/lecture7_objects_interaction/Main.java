package lecture7_objects_interaction;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner();
        Dog dog1 = new Dog();

        // still no interactivity between objects
        owner1.setName("Filan Fisteku");
        dog1.setName("Bandit");

        // kindof interactivity between objects
        owner1.orderDog("Bandit", "Speak...");

        // real interactivity between objects
        owner1.orderDog(dog1, "Speak...");
    }
}
