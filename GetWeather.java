import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetWeather{

private static String next = "";
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("---  Please type in a city ---");
        String input = in.nextLine();
        System.out.println("---  Type -  a to return temperature -  b for weather condition - c for humidity - d for wind speed ---");
        next = in.nextLine();
        System.out.println(getWeather(input));
        

    }

    public static String getWeather(String place) throws Exception {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + place + "&appid=43eb0b382279761afe085d3c6a5dcfc7");
        URLConnection connection = url.openConnection();

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())))
        {
            String line = in.readLine();
            System.out.println(line);
            double kelvinTemp = Double.parseDouble(line.substring(line.indexOf("p\":") + 3, line.indexOf(",\"f")));
            int farenheitTemp = (int) ((kelvinTemp - 273.15) * (9/5) + 32);
            String humidity = line.substring(line.indexOf ("humidity") + 10, line.indexOf("visibility") - 3);
            String windSpeed = line.substring(line.indexOf ("speed") + 7, line.indexOf("deg") - 2);
            String weatherCondition = line.substring(line.indexOf("on\":\"") + 5, line.indexOf("\",\"i"));
            if (next.equals("a") ){
               return "The temperature is " + farenheitTemp + " degrees";
            }
            if (next.equals("b") ){
               return  "The condition is " + weatherCondition;
            }
             if (next.equals("c") ){
               return  "The humidity is " + humidity;
            }
            if (next.equals("d") ){
               return  "The wind speed is " + windSpeed;
            }
            if (next != "b" && next!= "a" && next!= "c" && next!= "d"){
               return null;
            }
                }
      return "";
    }
}
