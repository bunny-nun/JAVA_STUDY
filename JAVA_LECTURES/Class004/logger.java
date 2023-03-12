import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class logger {
    public static void main(String[] args) throws IOException {
        Logger logfile = Logger.getLogger(task001.class.getName());
        String logsPath = "log.txt";
        FileHandler fileHandler = new FileHandler(logsPath, false);
        logfile.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
//        XMLFormatter formatter = new XMLFormatter();
        fileHandler.setFormatter(formatter);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            logfile.log(Level.INFO, "element: " + a);
        }
        logfile.log(Level.WARNING, "logger off");
        logfile.info("test");
        logfile.warning("logsPath");
    }
}
