package processors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DataCollector - Goes through raw HTML data and obtains the various required
 * Weather data. Assumes HTML data is from The Weather Network
 */
public class DataCollector {

    private String HTMLData;
    private String curWeather = "class=\\\"temperature\\\"";

    public DataCollector(String data) {

        HTMLData = data;

    }

    public int getCurrentWeather() {

        Pattern ptt = Pattern.compile(curWeather);
        Matcher mch = ptt.matcher(HTMLData);
        System.out.println(curWeather);
        while (mch.find()) {
            System.out.println("Found something!");
            System.out.println(mch.start());
            System.out.println(mch.end());
        }
        return 0;

    }

}
