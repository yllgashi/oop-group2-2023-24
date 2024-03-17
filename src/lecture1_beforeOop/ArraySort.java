package lecture1_beforeOop;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arraySize = 10;

        int[] array = new int[arraySize];

        mbushArray(array);
        String a = "";
        System.out.println("Before sort");
        shfaqArray(array);

        Arrays.sort(array);


        System.out.println("After sort");
        shfaqArray(array);
    }

    public static void mbushArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void shfaqArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}




