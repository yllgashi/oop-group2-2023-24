package lecture9_default_values;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        // default values (if user does not set any value to attributes)

        System.out.println(p1.getFirstName()); // null
        System.out.println(p1.getLastName()); // null
        System.out.println(p1.getHeight()); // 0
        System.out.println(p1.isAlive()); // false

    }
}
