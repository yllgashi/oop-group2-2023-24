package lecture52_logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFileExample {
    private static final Logger logger = Logger.getLogger(LoggerInFileExample.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("src/lecture52_logger/application.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);


        try {
            throw new Exception();
        } catch (Exception e) {
            logger.log(Level.FINEST, "Ka ndodhur gabimi ne diqka...");
            logger.log(Level.WARNING, e.getMessage(), e); // check console
        }

        System.out.println("Code after try-catch");
    }
}
