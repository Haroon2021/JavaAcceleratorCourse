package mountatin;

import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {
    @Test public void isTheTreeMature() {
        Tree treeinstance = new Tree("pine",10,10);
        for (int i = 0; i<250; i++) {
            treeinstance.photosynthesise();
            treeinstance.grow();
        }
        assertTrue("Check if the tree is mature", treeinstance.isTreeMature());
    }
    @Test public void isTheTreeMatureZeroGrowth() {
        Tree treeinstance = new Tree("pine",10,10);
        assertFalse("Check if a newly created tree is not mature",treeinstance.isTreeMature());
    }
    @Test public void speciesDeclarationTest() {
        Tree treeinstance = new Tree("pine",10,10);
        assertEquals("I am a born pine tree", treeinstance.speciesDeclaration());
    }
    
}
