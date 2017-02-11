/**
 * This class keeps track off all the blocks that have fallen from previous shapes.
 * Each block is represented using a char. 
 * When a shape stops moving because it has collided with a block, the 4 blocks
 * that make up the shape are inserted into the 2D array in this class.
 */
public class BlockStore {
  // 2D array that holds the character of the
  // type of shape in the cell.
  char[][] blocks = new char[10][20];
  char NULL_CHAR = '\u0000';
  
  public boolean insert(int col, int row, char shape) {
    // TODO: check boundaries
    blocks[col][row] = shape;
    return true;
  }
  
  public boolean isEmpty(int col, int row) {
    // TODO: fix
    return true;  
  }
  
  public boolean isRowFilled(int row) {
    // TODO: fix
    return true;
  }
  
  public boolean clear(int col, int row) {
    // TODO: fix
    return true;
  }
  
  public boolean shiftRowsDown(int rowCount) {
    // TOOD: fix
    return true;
  }
}