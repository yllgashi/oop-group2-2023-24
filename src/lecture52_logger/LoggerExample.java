package lecture52_logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
    private static Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        // with logger you can check logs of your application in:
//        Console
//        File
//        Memory
//        Socket
//        Stream


        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Show information to user");
            // add exception in log
            logger.log(Level.WARNING, e.getMessage(), e); // check console
            logger.log(Level.INFO, "Warning log", e); // check console
        }

        System.out.println("Code after try-catch");
    }
}
