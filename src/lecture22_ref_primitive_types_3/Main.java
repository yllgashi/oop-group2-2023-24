package lecture22_ref_primitive_types_3;

public class Main {
    public static void main(String[] args) {
//        Person arif = new Person();
//        arif.setFirstName("Arif");
//        arif.setLastName("Imeri");

        Person arif = new Person("Arif", "Imeri"); // create reference type (stored in heap)
        int x = 100; // create primitive type (stored in stack)


        // execute and check result
        changePrimitiveTypeValue(x);
        System.out.println(x);

        changeReferenceTypeAttribute(arif);
        System.out.println(arif.getFirstName());

        changeReferenceTypeAddress(arif);
        System.out.println(arif.getFirstName());
    }


    // it will create new variable (y) and it will not affect variable (x)
    public static void changePrimitiveTypeValue(int y) {
        y = 200;
    }

    // it will get address of object in memory, and it will modify that
    public static void changeReferenceTypeAttribute(Person person) {
        person.setFirstName("Fatlind");
    }

    // it will not allow us to change address of object
    public static void changeReferenceTypeAddress(Person person) {
        person = new Person("Filan", "Fisteku");
    }
}
