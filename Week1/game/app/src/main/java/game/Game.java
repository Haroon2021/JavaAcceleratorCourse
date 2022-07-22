package game;

import java.util.ArrayList;
// import java.util.Random;

public class Game {

    
    public Integer remainingAttempts = 10;
    private String word;
    private ArrayList<Character> lettersGuessed = new ArrayList<Character>();

    public Game(WordChooser wordchooser) {
        this.word = wordchooser.getRandomWordFromDictionary();
      }


    public String getWordToGuess() {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < this.word.length(); i++) {
          Character currentLetter = word.charAt(0);
          if (i == 0) {
              builder.append(currentLetter);
          } else {
              builder.append("_");
          }
      }
      return builder.toString();
  }

    public Integer getRemainingAttempts() {
      return this.remainingAttempts;
    }

    public Boolean guessLetter(Character guessLetter) {
      if (this.word.indexOf(guessLetter) != -1) {
        this.lettersGuessed.add(guessLetter);
        return true;
      } else {
        this.remainingAttempts --;
        return false;
      }
    }

   
}

