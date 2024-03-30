import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util util;

  @Before
  public void setUp() {
    util = new Util();
  }

  // Existing test for single element
  @Test
  public void testSingleElement() {
    assertFalse(util.compute(1));
  }

  // New Test: Even number of elements
  @Test
  public void testEvenNumberOfElements() {
    assertFalse(util.compute(1, 2));
  }

  //sum is divisible by at least one element
  @Test
  public void testOddNumberOfElementsSumDivisible() {
    assertTrue(util.compute(1, 2, -3, 4, -4));
  }

  @Test(expected = RuntimeException.class)
  public void testContainsZero() {
    util.compute(1, 0, 3);
  }
  @Test
  public void testOddNumberOfElementsSumNotDivisibleByAny() {
  Util util = new Util();
  assertFalse(util.compute(2, -4, 5)); 
}

}
