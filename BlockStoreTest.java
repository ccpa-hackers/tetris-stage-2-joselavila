import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

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
  /**
  *Test if the box is empty
  */
  @Test
  public void testIsEmpty(){
    BlockStore store = new BlockStore();
    char[][]blocks = store.blocks;
    
    boolean shouldBeTrue = store.isEmpty(0,0);
    assertTrue("Passed", shouldBeTrue);
    boolean shouldBeFalse = store.isEmpty(-1, 0);
    assertFalse("Wrong",shouldBeFalse );
  }
  
  @Test
  public void testIsRowFilled(){
    BlockStore store = new BlockStore();
    char[][]blocks = store.blocks;
    
    // TODO: load up the blocks array
    
    for(int col = 0; col < blocks.length; col++){
      store.insert(col, 3 ,'s');
    }
    boolean shouldBeTrue = store.isRowFilled(3);
    assertTrue("Passed", shouldBeTrue);
    
    boolean shouldBeFalse = store.isRowFilled(-67);
    assertFalse("Failed", shouldBeFalse);
  }
  @Test
  public void testClear(){
    BlockStore store = new BlockStore();
    char [][]blocks = store.blocks;
    
    for(int col = 0; col < blocks.length; col++){
      store.insert(6, 3 ,'s');
    }
    boolean shouldBeTrue = store.clear(6,3);
    assertTrue("Passed", shouldBeTrue);
    boolean shouldBeFalse = store.clear(-2,-5);
    assertFalse("failed" , shouldBeFalse);
    
  }
  
  @Test
  public void testShiftRowDown(){
    BlockStore store = new BlockStore();
    char [][]blocks = store.blocks;
    for(int col = 0; col < blocks.length; col++){
      store.insert(col, 18, 's');
      store.insert(col, 19, 't');
    }
    
    System.out.println();
    System.out.println(Arrays.deepToString(blocks).replace("], ", "]\n"));
    System.out.println();
    
    boolean shouldBeTrue = store.shiftRowsDown(1);
    assertTrue("Passed", shouldBeTrue);
    
    System.out.println(Arrays.deepToString(blocks).replace("], ", "]\n"));
    
    for(int col = 0; col < blocks.length; col++ ){
      assertEquals(blocks[col][19],'s');
    }
    
    boolean shouldBeFalse = store.shiftRowsDown(678678678);
    assertFalse("failed", shouldBeFalse);
    
  }
}