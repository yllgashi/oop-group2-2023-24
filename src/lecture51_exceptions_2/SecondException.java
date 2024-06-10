package lecture51_exceptions_2;

public class SecondException extends Exception {
    public SecondException() {
        super("Information about second exception");
    }

    public SecondException(String message) {
        super(message);
    }

    public SecondException(String message, Throwable cause) {
        super(message, cause);
    }
}
