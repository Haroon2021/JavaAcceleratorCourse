package game;

public class Game {

    public String theword;
    public Integer remainingAttempts = 10;
    public String[] DICTIONARY = {"MAKERS","CANDIES","DEVELOPER","LONDON"};

    public Game(String word) {
        this.theword = word;
      }


    // public String GetWordToGuess() {

    // StringBuilder hiddenWord = new StringBuilder(theword);

    // for(int i = 0; i < hiddenWord.length(); i++) {
    //     if (i != 0) {
    //       hiddenWord.replace(i, i + 1, "_");
    //     }
    //   }
    //   return hiddenWord.toString();
    // }
    // }

    public String getWordToGuess() {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < this.theword.length(); i++) {
          Character currentLetter = theword.charAt(0);
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
}

