package game;

import java.util.ArrayList;

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

    public Integer getRemainingAttempts() {
      return this.remainingAttempts;
    }

    public Boolean isGameLost(){
      return remainingAttempts <= 0;
    }

    public Boolean isGameWon(){
      return this.word.equals(getWordToGuess());
    }

    public Boolean guessLetter(Character letter) {
      if (this.word.indexOf(letter) == -1) {
          remainingAttempts--;
          return false;
      } else {
        lettersGuessed.add(letter);
          return true;
      }
  }

   
}

