package lecture50_exceptions_1;

import java.io.IOException;

class CheckedUncheckedExceptions {
    public static void main(String[] args) throws IOException {
        // checked exceptions (we know for sure that in this code an exception CAN happen
        // we have to handle it - mandatory
        int userInfo = System.in.read();


        // unchecked exceptions (we do not know for sure that this code can throw an exception)
        // we can compile this code even though there is an unhandled exception
        int numberOne = 10;
        int numberTwo = 0;
        int result = numberOne / numberTwo;
    }
}
