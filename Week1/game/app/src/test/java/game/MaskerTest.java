package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class MaskerTest {
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
    
}
