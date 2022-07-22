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

}
