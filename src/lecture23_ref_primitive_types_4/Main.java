package lecture23_ref_primitive_types_4;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        addElementsInArray(array);
    }

    public static void addElementsInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
