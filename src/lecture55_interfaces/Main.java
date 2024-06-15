package lecture55_interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.talk();
        animal.breath();
        animal.bark();


        Creature creature = new Animal();
        creature.eat();
        creature.talk();
        creature.breath();
    }
}
