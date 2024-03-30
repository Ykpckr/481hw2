import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  
  // Existing test for when the queue is empty
  @Test
  public void testQueueEmpty() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    Compute c = new Compute(mq);
    
    assertEquals(-1, c.countNumberOfOccurrences("element"));
  }

  // New Test: Element is not present in the queue
  @Test
  public void testElementNotInQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains(anyString())).thenReturn(false);
    Compute c = new Compute(mq);
    
    assertEquals(0, c.countNumberOfOccurrences("element"));
  }


}
