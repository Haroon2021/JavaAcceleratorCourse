package game;

import java.util.ArrayList;

public class Masker {
    private String word;
    public ArrayList<Character> lettersGuessed = new ArrayList<Character>();

    public Masker(WordChooser wordchooser) {
        this.word = wordchooser.getRandomWordFromDictionary();
      }


    public String getMaskedWord() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i == 0) {
                builder.append(currentLetter);
            } else {
                if (lettersGuessed.indexOf(currentLetter) != -1) {
                  builder.append(currentLetter);
                } else {
                  builder.append("_");
                }
            }
        }
        return builder.toString();
    }

    // public String getMaskedWord(String word) {
    //     getWordToGuess(word);
    // }
}
