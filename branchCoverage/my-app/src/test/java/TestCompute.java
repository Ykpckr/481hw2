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

  // Another New Test: Element occurs multiple times in the queue
  @Test
  public void testElementOccursMultipleTimes() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("element")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("element");
    when(mq.getAt(1)).thenReturn("anotherElement");
    when(mq.getAt(2)).thenReturn("element");
    Compute c = new Compute(mq);
    
    assertEquals(2, c.countNumberOfOccurrences("element"));
  }


}
