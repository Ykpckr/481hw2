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

}
