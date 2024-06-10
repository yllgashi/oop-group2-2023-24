package lecture51_exceptions_2;

public class MyException extends Exception {
    // we should create three constructors (and call parent constructor)


    // without parameters
    public MyException() {
        super();
    }


    // with "message" parameter
    public MyException(String message) {
        super(message);
    }

    // with "message" and "cause" parameter
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
