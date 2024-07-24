package algorithms.xplorer.impl;

import static org.junit.jupiter.api.Assertions.*;

import algorithms.xplorer.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyQueueTest {

  private Queue queue;

  @BeforeEach
  void setUp() {
    queue = new MyQueue();
  }

  @Test
  void peek() {

    for (int i = 0; i < 10; i++) {
      queue.add(i);
    }
    assertEquals(10, queue.size());

    assertEquals(0, queue.peek());
    assertEquals(0, queue.peek());
    queue.remove();
    assertEquals(1, queue.peek());
    assertEquals(1, queue.peek());
    queue.remove();
    assertEquals(2, queue.peek());
  }

  @Test
  void add() {
    assertEquals(0, queue.size());
    queue.add(100);
    assertEquals(1, queue.size());
    for (int i = 0; i < 10; i++) {
      queue.add(100);
    }
    assertEquals(11, queue.size());
  }

  @Test
  void remove() {

    assertEquals(-1, queue.remove());

    for (int i = 0; i < 10; i++) {
      queue.add(i);
    }
    assertEquals(10, queue.size());
    assertEquals(0, queue.remove());
    assertEquals(1, queue.remove());
    assertEquals(2, queue.remove());
    assertEquals(7, queue.size());
  }
}
