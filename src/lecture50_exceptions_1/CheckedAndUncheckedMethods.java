package lecture50_exceptions_1;

import java.io.IOException;

public class CheckedAndUncheckedMethods {
    public static void main(String[] args) {
        try {
            checkedException(); // we cannot call without try-catch (or without specifying also in calling method)
        } catch (Exception e) {
        }


        uncheckedException(); // we can call without try-catch
    }

    public static void checkedException() throws IOException, Exception {
        System.out.println("When we call this method we ARE aware it can throw an exception");
    }

    public static void uncheckedException() {
        System.out.println("When we call this method we ARE NOT aware it can throw an exception");
        System.out.println(1 / 0);
    }
}
