import org.junit.Test;
import static org.junit.Assert.*;

public class HopperTest {
  char NULL_CHAR = '\u0000';
 
  /**
   * Tests that Hopper.queue has a fixed size of 7.
   */
  @Test
  public void testQueueSize() {
    Hopper hopper = new Hopper();
    char[] queue = hopper.queue;
    
    // Verify that the array is the right size.
    assertEquals("Hopper.queue is the wrong length", 7, queue.length);
  }
 
  /**
   * Tests that Hopper.getNextShape() returns a reasonable value.
   */
  @Test
  public void testNextShape() {
    Hopper hopper = new Hopper();
    
    // Verify that the first shape is not empty.
    char shape = hopper.getNextShape();
    assertNotEquals("The shape should not be empty", NULL_CHAR, shape);
  }
  
  /**
   * Tests that Hopper.getNextShape() will refill the hopper wihout
   */
  @Test
  public void testNextShape1000() {
    Hopper hopper = new Hopper();
    
    for (int i = 0; i < 1000; i++) {
      // Verify that the shape is not empty.
      char shape = hopper.getNextShape();
      assertNotEquals("The shape should not be empty", NULL_CHAR, shape);
      
      // Verify that the size of the array never changes.
      assertEquals(hopper.queue.length, 7);
    }
  }
}