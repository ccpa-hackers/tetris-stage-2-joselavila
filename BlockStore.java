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

    if(col < blocks.length && col >= 0 ){
      if(row < blocks[col].length && row >= 0){
        blocks[col][row] = shape;
        return true;
      }  
    }
    return false;
  }
  
  public boolean isEmpty(int col, int row) {
      if(col < blocks.length && col >= 0 ){
        if(row < blocks[col].length && row >= 0){
          if(blocks[col][row] == NULL_CHAR){
            return true;
          }
        }
      }
    return false;
  }
  
  public boolean isRowFilled(int row) {
    if(row >= blocks[0].length || row < 0) { 
      return false;
    }
      
      for(int col = 0; col < blocks.length; col++){
        char block = blocks[col][row];
        if(block == NULL_CHAR){
         return false;
        }
      }
    
      
    return true;
  }
  
  public boolean clear(int col, int row) {
    if(col < blocks.length && col >= 0 ){
      if(row < blocks[col].length && row >= 0){
        blocks[col][row] = NULL_CHAR;
        return true;
      }  
    }
    return false; 
  }
  public boolean shiftRowsDown(int rowCount) {
      if(rowCount < 1 || rowCount >= blocks[0].length){
        return false;
      }  
        for(int row = blocks[0].length-rowCount - 1; row >= 0 ; row--){
          for(int col = 0; col < blocks.length; col++){
           blocks[col][row + rowCount] = blocks[col][row];
           blocks[col][row] = NULL_CHAR;
    }
    
  }
  return true;
  }
}