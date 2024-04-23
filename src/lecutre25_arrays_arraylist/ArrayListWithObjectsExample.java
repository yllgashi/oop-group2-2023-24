package lecutre25_arrays_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListWithObjectsExample {
    public static void main(String[] args) {
        // compare with arrays
        int[] arr = new int[10]; // create array
        arr[0] = 1000; // initialize element in array
        System.out.println(arr[0]); // get element in array

        ArrayList arrayList1 = new ArrayList(); // create arraylist
        arrayList1.add(1000); // initialize element in arraylist (don't mention index)
        System.out.println(arrayList1.get(0)); // get element in array


        // ways to create an arrayList
        ArrayList arrayList2 = new ArrayList(); // used the most
        ArrayList arrayList3 = new ArrayList(20);
        ArrayList arrayList4 = new ArrayList(arrayList2);


        // insert element in arraylist
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(2000);
        arrayList5.add("Test");
        arrayList5.add('W');
        arrayList5.add(false);

        // show elements in arraylist
        showArraylistData(arrayList5);

        // initialize arraylist element into variable
        int integerElement = (int) arrayList5.get(0);
        String stringElement = (String) arrayList5.get(1);
        char charElement = (char) arrayList5.get(2);
        boolean booleanElement = (boolean) arrayList5.get(3);


        // it is recommended to create specific type arraylist
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<Character> characterArrayList = new ArrayList<Character>();
        ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>();


        // work with specific type arraylist
        stringArrayList.add("MyString");
        String stringElementFromSpecificArraylist = stringArrayList.get(0); // it doesn't need cast


        // arraylist other methods
        ArrayList<String> testingArrayList = new ArrayList<String>();
        testingArrayList.add("Test"); // to insert element into arraylist
        testingArrayList.get(0); // to get element of specific index from arralist
        testingArrayList.size(); // get size of arraylist (elements number)
        testingArrayList.clear(); // remove elements from arraylist
        testingArrayList.contains("Test"); // checks if element exists into array
        testingArrayList.set(0, "AnotherElement"); // update element into specific index of arraylist
        testingArrayList.indexOf("AnotherElement"); // find index of element by value
        testingArrayList.remove("AnotherElement"); // remove element with specific value
        testingArrayList.remove(0); // remove element into specific index
        testingArrayList.isEmpty(); // check if arraylist doesn't contain any element
        String[] convertedArray = (String[]) testingArrayList.toArray(); // convert arraylist to array
    }

    public static void showArraylistData(ArrayList arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
    }
}










