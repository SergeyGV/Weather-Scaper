package processors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * SourceCollector - A class to extract the HTML Source Code from any given
 * website.
 */
public class SourceCollector {

    public static String getRawHTMLData() throws IOException, InterruptedException {

        URL WeatherNetwork = new URL("https://www.theweathernetwork.com/ca/weather/ontario/mississauga");
        URLConnection WNOpen = WeatherNetwork.openConnection();
        Thread.sleep(20000);
        BufferedReader getter = new BufferedReader(new InputStreamReader(
                WNOpen.getInputStream(), "UTF-8"));
        String line;
        //StringBuilder container = new StringBuilder();
        String text = "";
        while ((line = getter.readLine()) != null) {
            //container.append(line);
            text = "" + text + line;
        }
        getter.close();
        //text = text.replaceAll("\\\\*<*[*^*>*]*>*-*!*","");
        System.out.println(text.replaceAll("\\\\*<*[*^*>*]*>*-*!*",""));
        //return container.toString().replaceAll("\\\\<[^>]*>","");
        return text;

    }

}
