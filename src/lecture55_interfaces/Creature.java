package lecture55_interfaces;

public interface Creature {
    void eat();

    void talk();

    // not recommended (it works only on new versions of Java)
    default void breath() {
        System.out.println("Breathing");
    }
}
