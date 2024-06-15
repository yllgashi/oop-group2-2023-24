package lecture55_interfaces;

public class Animal implements Creature {

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void talk() {
        System.out.println("Talking...");
    }

    public void bark() {
        System.out.println("Ham ham...");
    }
}
