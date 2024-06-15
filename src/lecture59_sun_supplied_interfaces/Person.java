package lecture59_sun_supplied_interfaces;

public class Person implements Runnable {
    @Override
    public void run() {
        System.out.println("Testing on thread...");
    }
}
