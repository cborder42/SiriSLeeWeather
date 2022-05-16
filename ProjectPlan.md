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
