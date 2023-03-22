// работа с логером


package Seminar_3;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

// public class task_1 {
//     public static void main(String[] args) throws IOException{
//         Logger ll = Logger.getLogger(lg.class.getName());
//         String logsPath = "log.txt";
//         FileHandler fh = new FileHandler(logsPath, false);
//         ll.addHandler(fh);
//         SimpleFormatter formatter = new SimpleFormatter();
//         // XMLFormatter form = new XMLFormatter();
//         fh.setFormatter(formatter);

//         for(int i = 0; i < 10; i++)
//         {
//             ll.log(Level.INFO,"element: " + i);
//         }
//         ll.log(Level.WARNING, "logger off" );

//         ll.info("test" );
//         ll.warning("logsPath");
    

//     }
// }

// второй вариант
public class task_1 {

public static void main(String[] args) throws IOException{
    Logger ll = Logger.getLogger(lg.class.getName());
    String logsPath = "log.txt";
    FileHandler fh = new FileHandler(logsPath, false);
    ll.addHandler(fh);
    SimpleFormatter formatter = new SimpleFormatter();
    // XMLFormatter form = new XMLFormatter();
    fh.setFormatter(formatter);

    ll.log(Level.INFO,"element: " + i);
    ll.log(Level.WARNING, "logger off" );

    ll.info("test" );
    ll.warning("logsPath");

    }
}