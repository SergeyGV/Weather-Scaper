package main;

import processors.DataCollector;
import processors.SourceCollector;

/**
 * Controller - A class responsible for making sure other classes collaborate
 * with each other properly by handling the method calls and overall being
 * the brain of this program
 */
public class Controller {

    public static void main(String[] args) {

        try {
            String source = SourceCollector.getRawHTMLData();
            DataCollector processor = new DataCollector(source);
            processor.getCurrentWeather();
            System.out.println(source);
        } catch (Exception e) {
            System.out.println("You got 404d!");
        }

    }

}
