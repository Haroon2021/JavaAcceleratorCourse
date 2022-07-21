package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test 
    public void testGetsWordToGuess() {
        Game game = new Game("MAKERS");
        assertEquals(game.getWordToGuess(), "M_____");
        // assertEquals(game.GetWordToGuess(),String.valueOf("M_____"));
    }
    @Test
    public void testGetintialRemainingAttempts() {
        Game game = new Game("MAKERS");
        assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
    }

}
