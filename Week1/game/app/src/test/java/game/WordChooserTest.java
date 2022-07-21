package game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordChooserTest {
    @Test
    public void testgetRandomWordFromDictionary() {
        WordChooser wordchooser = new WordChooser();
        String randomvar = "MAKERS";
        assertEquals(wordchooser.getRandomWordFromDictionary(),randomvar);
    }
    
}
