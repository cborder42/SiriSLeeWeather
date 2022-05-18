import java.util.Scanner; 
package com.journaldev.jsoup;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SiriSLee{

   public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";
    
    public String getDay(){
      Scanner myObj = new Scanner(System.in);  
      System.out.println("Enter which day you want the weather for in word form (ex: May 15th)");

      String day = myObj.nextLine();  
      return day; 
    }
    
    public String getLocation(){
      Scanner myObj = new Scanner(System.in);  
      System.out.println("Enter your location");

      String loc = myObj.nextLine();  
      return loc;
    
    }
    
    public String GoogleSearch(String day, String location){
         String SearchURL= GOOGLE_SEARCH_URL+"?p="+"weather"+ location+day;
         Document doc = Jsoup.connect(SearchURL).userAgent("Mozilla/5.0").get();
         Elements results = doc.select("h3.r > a");

		   for (Element result : results) {
			   String linkHref = result.attr("href");
			   String linkText = result.text();
			   System.out.println("Text::" + linkText + ", URL::" + linkHref.substring(6, linkHref.indexOf("&")));

    }
    
    

}