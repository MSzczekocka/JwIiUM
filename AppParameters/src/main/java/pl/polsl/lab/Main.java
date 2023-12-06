package pl.polsl.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.polsl.lab.controller.PlanetController;
import pl.polsl.lab.controller.PlanetFileController;

/** 
 * Class call up writing out the parameters for the console output.
 * 
 * @author Martyna Szczekocka
 * @version 1.0
 */
@SpringBootApplication
public class Main {

    /**
     * Main method which starting program
     */
    
    public static void main(String args[]) {
        SpringApplication.run(Main.class, args);
    }
}
