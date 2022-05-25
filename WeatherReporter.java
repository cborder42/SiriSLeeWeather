
Carolyn Davis
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class WeatherReporter{

    
    public String toPhonetics(String city){
         String SearchURL= "https://www.phonemicchart.com/transcribe/?w=" + city;
         Document doc = Jsoup.connect(SearchURL).userAgent("Mozilla/5.0").get();
         Elements results = doc.select("h3.r > a");

		   for (Element result : results) {
			   String linkHref = result.attr("href");
			   String linkText = result.text();
			   System.out.println("Text::" + linkText + ", URL::" + linkHref.substring(6, linkHref.indexOf("&")));
         
         
     public static void main(String args[]) throws IOException {
            //Instantiating the URL class
            URL url = new URL("https://www.phonemicchart.com/transcribe/?w=" + city);
            //Retrieving the contents of the specified page
            Scanner sc = new Scanner(url.openStream());
            //Instantiating the StringBuffer class to hold the result
            StringBuffer sb = new StringBuffer();
            while(sc.hasNext()) {
               sb.append(sc.next());
               //System.out.println(sc.next());
            }
            //Retrieving the String from the String Buffer object
            String result = sb.toString();
            System.out.println(result);
            //Removing the HTML tags
            result = result.replaceAll("<[^>]*>", "");
            System.out.println("Contents of the web page: "+result);
            
         }
     //goes through ever letter in the webpage
     String phonetics = "";
     for(String letter: result){
         //looks for a slash then adds each letter until the next slash to a string
         if(letter.equals("/"){
             while(!(letter.equals("/"))){
                 phonetics+=letter;
                 
         }
     }
    
    
}


