/**
 * This class stores and keeps track of the shapes that are in the queue to fall.
 * It serves as an abstraction for determining what shape should come next.
 * Each shape is represented by a char.
 */
public class Hopper {
  // Array of characters for blocks that will fall. Ordered first to last.
  char[] queue = new char[7];
  char NULL_CHAR = '\u0000';
  
  public char getNextShape() {
    if (queue[0] == NULL_CHAR) {
      refillQueue();
    }
    
    // Get the first shape in the queue.
    char next = queue[0];
    
    // Shift remaining shapes forward by 1.
    for (int i = 1; i < queue.length; i++) {
      queue[i - 1] = queue[i];
    }

    return next;
  } 
  
  public int getRemainingCount() {
    // Search for NULL_CHAR inside of the queue.
    for (int i = 0; i < queue.length; i++) {
      if (queue[i] == NULL_CHAR) {
        // Add one to index because count, not index is to be returned.
        return i + 1;
      }
    }
    
    // If NULL_CHAR is not found, then the queue is full.
    return queue.length;
  }
  
  private void refillQueue() {
    queue[0] = 'i';
    queue[1] = 'j';
    queue[2] = 'l';
    queue[3] = 'o';
    queue[4] = 's';
    queue[5] = 't';
    queue[6] = 'z';
   
    for (int i = 0; i < queue.length; i++) {
      // Choose a random character to swap with.
      int swapIndex = (int) (Math.random() * queue.length);
      
      // Save swap destination from being clobbered and perform swap.
      char swapChar = queue[swapIndex];
      queue[swapIndex] = queue[i];
      queue[i] = swapChar;
    }
  }
}