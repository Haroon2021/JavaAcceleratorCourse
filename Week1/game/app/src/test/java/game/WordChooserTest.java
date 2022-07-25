package game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WordChooserTest {
    @Test
    public void testgetRandomWordFromDictionary() {
        WordChooser mockedRandom = mock(WordChooser.class);
        when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
        assertEquals(String.valueOf("MAKERS"), mockedRandom.getRandomWordFromDictionary());
    } 
}

