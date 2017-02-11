import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This is a JUnit Test class.
 * See how to make assertions using JUnit methods: https://github.com/junit-team/junit4/wiki/Assertions
 */
public class BlockStoreTest {
  char NULL_CHAR = '\u0000';
  
  /**
   * Tests that a new block store has entirely empty cells.  
   */
  @Test
  public void testEmptyGrid() {
    BlockStore store = new BlockStore();
    char[][] blocks = store.blocks;
    
    
    // Loop over each column
    for (int col = 0; col < blocks.length; col++) {
      
      // Loop over each row
      for (int row = 0; row < blocks[col].length; row++) {
        
        // Pick each individual cell and check that it is the null character.
        assertEquals(blocks[col][row], NULL_CHAR);
      }
    } 
  }
  
  /**
   * Tests that inserting a new block into the block store places the block
   * in the right place.
   */
  @Test
  public void testInsert() {
    BlockStore store = new BlockStore();
    char[][] blocks = store.blocks;
    
    store.insert(3, 4, 's');
    assertEquals(blocks[3][4], 's');
  }
  
  /**
   * Tests that inserting to a new block into an invalid coordinate 
   * always returns false and the blockis not placed in the store.
   */
  @Test
  public void testInsertOutOfBounds() {
    BlockStore store = new BlockStore();
    char[][] blocks = store.blocks;
    
    boolean success = store.insert(10, 0, 's');
    assertFalse(success);
  }
  
  // TODO: write test cases to cover all possible errors!
}