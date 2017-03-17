import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitIntroTest {
  
  /**
   * Every method with the `@Test` annotation is called a test case.
   */
  @Test
  public void testAssertEquals() {
    int whatIExpect = 42;
    int actualResults = 1000;
    assertEquals(actualResults, whatIExpect);
  }
}