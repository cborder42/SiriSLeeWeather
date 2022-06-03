import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetWeather
{

    public static void main(String[] args) throws Exception {
        System.out.println(getWeather("Seattle"));

    }

    public static String[] getWeather(String place) throws Exception {
        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + place + "&appid=43eb0b382279761afe085d3c6a5dcfc7");
        URLConnection connection = url.openConnection();

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())))
        {
            String line = in.readLine();
            double kelvinTemp = Double.parseDouble(line.substring(line.indexOf("p\":") + 3, line.indexOf(",\"f")));
            int farenheitTemp = (int) ((kelvinTemp - 273.15) * (9/5) + 32);
            String temperature = String.valueOf(farenheitTemp) + " degrees";
            String humidity = line.substring(line.indexOf ("humidity") + 10, line.indexOf("visibility") - 3);
            if (humidity.indexOf("sea_level") != -1) {
                humidity = line.substring(line.indexOf("humidity") + 10, line.indexOf("visibility") - 37);
            }
            String windSpeed = line.substring(line.indexOf ("speed") + 7, line.indexOf("deg") - 2);
            String weatherCondition = line.substring(line.indexOf("on\":\"") + 5, line.indexOf("\",\"i"));
            String[] results = {temperature, weatherCondition, humidity, windSpeed};
            return results;
        }

    }
}
