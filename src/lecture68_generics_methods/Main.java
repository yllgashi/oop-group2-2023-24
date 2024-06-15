package lecture68_generics_methods;

public class Main {
    public static void main(String[] args) {
        int a = getMiddle(1, 2, 3);
        String b = getMiddle("A", "B", "C");
        boolean c = getMiddle(false, true, false);
    }

    public static <T> T getMiddle(T a, T b, T c) {
        return b;
    }
}
