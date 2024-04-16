package lecture21_ref_primitive_types_3;

public class Main {
    public static void main(String[] args) {
        // primitive type
        int primitiveVariable = 10; // variable holds all value (10 in this case)

        // reference type
        MyReferenceType referenceType = new MyReferenceType(); // variable holds address of object
        referenceType.setName("FilanFisteku");


        // change value & attribute
        changeValue(primitiveVariable);
        changeAttribute(referenceType);

        // check result
        System.out.println(primitiveVariable);
        System.out.println(referenceType.getName());
    }

    // passing variable by value (we pass only value in new variable "parameter")
    public static void changeValue(int parameter) {
        parameter = 20;
    }

    // passing variable by reference (we pass object address in heap memory)
    public static void changeAttribute(MyReferenceType parameter) {
        parameter.setName("RemzijeOsmani");
    }
}
