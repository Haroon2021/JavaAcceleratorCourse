package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class MaskerTest {
    // private Game game;
    private Masker masker;
    @Before
    // This is done before each test
    public void initialiseTests() {
        // creating a mock wordchooser using its class
        WordChooser mockWordChooser = mock(WordChooser.class);
        // stubbing appears before the actual execution
        // the order of the 2 lines below is important the function calls need to be specified before using the mock
        when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        this.masker = new Masker(mockWordChooser);
    }
    @Test 
    public void testGetsWordToGuess() {
        assertEquals(this.masker.getMaskedWord(), "M_____");
    }

    @Test
    public void guessingLettersInWordToGuess() {
        // creating a mock wordchooser using its class
        // ArrayList<Character> guessedLetters = new ArrayList<Character>();
        WordChooser mockWordChooser = mock(WordChooser.class);
        // stubbing appears before the actual execution
        // the order of the 2 lines below is important the function calls need to be specified before using the mock
        when(mockWordChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        masker.lettersGuessed.add('K');
        masker.lettersGuessed.add('R');
        assertEquals(this.masker.getMaskedWord(),"M_K_R_");
    }
    
}
