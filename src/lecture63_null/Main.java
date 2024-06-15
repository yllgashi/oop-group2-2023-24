package lecture63_null;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setFullname("Testim Testeri");

        Brain brain = new Brain();
        brain.setColor("Orange");
        person.setBrain(brain);

        System.out.println(person.getId());
        System.out.println(person.getFullname());
        System.out.println(person.getBrain().getColor());


        // null is something empty which we do not have reference for that
        // there is a pointer "Object a..." but this pointer does not point
        // in any place in heap


        Person person2 = null;





        Person person3 = new Person();
        person3.setId(2);
        person3.setFullname("Filan Fisteku");

        // print these data (checking if any of that is null)
        if (person3 != null) {
            System.out.println(person3.getId());
            System.out.println(person3.getFullname());

            if (person3.getBrain() != null) {
                System.out.println(person3.getBrain().getColor());
            }
            else {
                System.out.println("Brain object is null");
            }

        }
        else {
            System.out.println("Person3 object is null");
        }
    }
}
