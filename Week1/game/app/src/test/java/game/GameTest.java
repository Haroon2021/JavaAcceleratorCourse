package game;
import static org.junit.Assert.*; // imports assertEquals, asserttrue assertfalse ect
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
    // the game created below allows us to use this.game later on (initialised var)
    private Game game;
    @Before
    // This is done before each test
    public void initialiseTests() {
        // creating a mock wordchooser using its class
        WordChooser mockWordChooser = mock(WordChooser.class);
        // stubbing appears before the actual execution
        // the order of the 2 lines below is important the function calls need to be specified before using the mock
        when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        this.game = new Game(mockWordChooser);
    }
    @Test 
    public void testGetsWordToGuess() {
        assertEquals(this.game.getWordToGuess(), "M_____");
    }
    @Test
    public void testGetintialRemainingAttempts() {
        assertEquals(this.game.getRemainingAttempts(), Integer.valueOf(10));
    }
    @Test
    public void testGuessLetterReturnsTrueIfCorrectLetterGiven() {
        assertTrue("Test passes if correct letter given",this.game.guessLetter('E'));
    }
    @Test
    public void testGuessLetterReturnsFalseIfINorrectLetterGiven() {
        assertFalse("Test fails if incorrect letter is given", this.game.guessLetter('Z'));
    }
    @Test
    public void testIncorrectAnswerReducesCountByOne() {
        this.game.guessLetter('Z');
        assertEquals(Integer.valueOf(9), this.game.getRemainingAttempts());
        
    }
    @Test
    public void testCorrectLetter() {
         // creating a mock wordchooser using its class
         WordChooser mockWordChooser = mock(WordChooser.class);
         // stubbing appears before the actual execution
         // the order of the 2 lines below is important the function calls need to be specified before using the mock
         when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
         this.game = new Game(mockWordChooser);
         assertTrue("Letter E is in DEVELOPER", this.game.guessLetter(('E')));
         assertEquals(game.getWordToGuess(),"DE_E___E_");
    }
    @Test
    public void testCorrectLetters() {
         // creating a mock wordchooser using its class
         WordChooser mockWordChooser = mock(WordChooser.class);
         // stubbing appears before the actual execution
         // the order of the 2 lines below is important the function calls need to be specified before using the mock
         when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
         this.game = new Game(mockWordChooser);
         this.game.guessLetter(('E'));
         this.game.guessLetter(('V'));
         assertEquals(game.getWordToGuess(),"DEVE___E_");
    }

    @Test
    public void testIsGameLost() {
        WordChooser mockWordChooser = mock(WordChooser.class);
         // stubbing appears before the actual execution
         // the order of the 2 lines below is important the function calls need to be specified before using the mock
         when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
         this.game = new Game(mockWordChooser);

         for (int i = 0; i < 10; i++) {
            this.game.guessLetter(('Q'));
          }
        assertTrue("Checking to see if game is lost after 10 attempts",game.isGameLost());    
    }

    @Test
    public void testIsGameWon() {
        WordChooser mockWordChooser = mock(WordChooser.class);
         // stubbing appears before the actual execution
         // the order of the 2 lines below is important the function calls need to be specified before using the mock
         when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
         this.game = new Game(mockWordChooser);
         this.game.guessLetter(('M'));
         this.game.guessLetter(('A'));
         this.game.guessLetter(('K'));
         this.game.guessLetter(('E'));
         this.game.guessLetter(('R'));
         this.game.guessLetter(('S'));
         
        assertTrue("Checking to see if game returns message of won",game.isGameWon());    
    }
    

}
