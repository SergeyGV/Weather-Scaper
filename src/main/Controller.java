package main;

import processors.SourceCollector;

public class Controller {

    public static void main(String[] args) {

        try {
            String source = SourceCollector.getRawHTMLData();
            System.out.println(source.length());
        } catch (Exception e) {
            System.out.println("You got 404d!");
        }

    }

}
