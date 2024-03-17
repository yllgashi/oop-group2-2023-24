package lecture0_recap;

public class ArrayReference {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int numri = 10;

        ndryshoArray(array);
        // 99, 2, 3

        ndryshoNumer(numri);
        // 1
    }

    public static int[] ndryshoArray(int[] arr) {
        arr[0] = 99;
        return arr;
    }

    public static int ndryshoNumer(int numri) {
        numri = 1;
        return numri;
    }
}
