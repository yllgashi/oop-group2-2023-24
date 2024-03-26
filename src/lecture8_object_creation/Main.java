package lecture8_object_creation;

public class Main {
    // memory of application has:
    // stack: where primitive types, methods and objects pointers are stored
    // heap: where reference types (objects) are stored
    public static void main(String[] args) {
        /*
            Statement above has three parts:
            Person person1 -> We create a pointer
            =              -> We assign object to pointer
            new Person();  -> We create object
         */
        Person person1 = new Person();


        // create object
        new Person();

        // create pointer
        Person person2;

        // assign object to a pointer
        Person person3 = new Person();
    }
}









