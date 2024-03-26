package lecture10_pointers;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Filan Fisteku");

        Person person2 = person1;
        Person person3 = person1;

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
    }
}
