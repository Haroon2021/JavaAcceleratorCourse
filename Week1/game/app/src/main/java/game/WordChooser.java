package game;

import java.util.Random;

public class WordChooser {
    public static final String[] DICTIONARY = {"MAKERS","CANDIES","DEVELOPER","LONDON"};
    // public String theword = getRandomWordFromDictionary();
    public static void main(String[] args) {

    }

    public String getRandomWordFromDictionary() {
        Random rand = new Random();
        int n = rand.nextInt(DICTIONARY.length);
        return DICTIONARY[n];
      }

}
