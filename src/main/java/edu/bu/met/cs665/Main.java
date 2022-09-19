package edu.bu.met.cs665;
import edu.bu.met.cs665.Assignment1.BrewCoffee;
import edu.bu.met.cs665.Assignment1.BrewTea;
import org.apache.log4j.Logger;
import java.util.Scanner;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

//  private static Logger logger = Logger.getLogger(Main.class);
    /**
     * A main method to run .
     *
     * @param args not used
     */
    public static void main(String[] args) {
        //Main m = new Main();
        // This configuration is for setting up the log4j properties file.
        // It is better to set this using java program arguments.
        // PropertyConfigurator.configure("log4j.properties");

        // Let us create an object of the Main class.
        //Main m = new Main();

        /**
         * This is the base price for blacktea
         */
        int blacktea = 3;
        /**
         * This is the base price for greentea
         */
        int greentea = 3;
        /**
         * This is the base price for yellowtea
         */
        int yellowtea = 4;

        System.out.println("Enter your choice: 1)Coffee 2)Tea");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            /**
             * Switch between creating a new object of BrewCoffee or BrewTea
             */
            case 1:
                /**
                 * Creating a new object of BrewCoffee
                 */
                BrewCoffee c = new BrewCoffee();
                c.Coffee_Choice();
                break;

            case 2:
                /**
                 * Creating a new object of BrewTea
                 */
                BrewTea t = new BrewTea(blacktea, greentea, yellowtea);
                t.Tea_Choice();
                break;
        }
        //logger.info(m.doIt());

//    logger.trace("Trace Message!");
//    logger.debug("Debug Message!");
//    logger.info("Info Message!");
//    logger.warn("Warn Message!");
//    logger.error("Error Message!");
//    logger.fatal("Fatal Message!");

    }
}
