/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Welcome! Today the word to guess is:";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        WordChooser wordChooser = new WordChooser();
        Game game = new Game(wordChooser);
        System.out.println(game.getWordToGuess());

        do {
            System.out.println("Enter one letter to guess (" + game.remainingAttempts + " attempts remaining):");
            
            Scanner sc= new Scanner(System.in);      
            Character a = sc.next().charAt(0);
            game.guessLetter(a); 
            System.out.println(game.getWordToGuess());
        
          }
          while (game.remainingAttempts > 0);
    }
}
