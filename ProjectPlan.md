Carolyn D
Anika K
Eddy H
Hayool P

Identification of Code: 
API for making a request to google: https://developers.google.com/sheets/api/quickstart/java

Phonetic sound install: bin/elasticsearch-plugin install analysis-phonetic
GET _analyze?filter_path=tokens.token

Soundex: https://en.wikipedia.org/wiki/Soundex

elastic search needed to get phonetic tokens: 
https://github.com/elastic/elasticsearch/blob/7.13/plugins/analysis-phonetic/src/main/java/org/elasticsearch/index/analysis/PhoneticTokenFilterFactory.java


The SiriSLee Segment: 

Proposal ** SiriSLee takes in a question from a user, and returns a result to their question using google. Using text to speech technology, SiriSLee will read out the first result from google.com

File Structure/API record all phonetic sounds and take phonetic codes from words in google result and return the string in audio text to speech. Our class structure will be two classes.

The first class (ends up getting the google result in the end using these methods in the main method): There will be a method that takes out all of the words from the user-entered string that are not key to the String. There will be another method that sends the new String (with only key words) to Google. There will be another method that returns the 1st and most accurate result from Google.

The second class (turns the google result into speech using text to speech): We will Pre-record phonetic sounds that will be used. One method that gets the phonetic key of the string returned from google. Another method that returns the text to speech of the string returned using the phonetic key and the pre-recorded phonetic sounds.

New Java
Text to speech
Recording phonetic keys
Sending a scanner class and sending results from user to a foreign structure.
Removing non-key words from the user input string
Division of Labor: This project will require at least 5 people. Each person can write one method. (shown in #2)

takes in a string and returns text to speech (manually with prerecorded files for each letters) with "a quick brown fox jumps over the lazy dog."
has a string array with all of the letters of the alphabet. loops through string and finds the corresponding letter and location inside of the array w all the letters of the alphabet. Then finds the file with the letter sound with the same location as the letter found.

The WeatherApp Segment:

A function that pulls json data from the OpenWeather API.

It creates a URLConnection object with the .openConnection() on the api web link
- This creates a connection to the specified URL

It then creates a BufferedReader object, which simplifies text from a stream of characters. 
The stream of characters that is supplied is an InputStreamReader, decoding the json and returning the stream

After this process of decoding and simplifying the json, a string variable is created to capture that simplified stream of characters

Once the String variable is created, the temperature value in Kelvin can be turned into a double value using the substring method

This double value is turned into an int value, and returned.
