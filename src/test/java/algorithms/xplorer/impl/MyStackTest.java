package algorithms.xplorer.impl;

import static org.junit.jupiter.api.Assertions.*;

import algorithms.xplorer.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyStackTest {

  private Stack stack;

  @BeforeEach
  void tearDown() {

    stack = new MyStack();
  }

  @Test
  void peek() {

    assertEquals(0, stack.size());
    for (int i = 0; i < 20; i++) {
      stack.push(i);
    }
    assertEquals(20, stack.size());

    assertEquals(19, stack.peek());
    assertEquals(19, stack.peek());
    assertEquals(19, stack.peek());
  }

  @Test
  void push() {
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.size());

    for (int i = 0; i < 20; i++) {
      stack.push(i);
    }
    assertEquals(20, stack.size());
    assertFalse(stack.isEmpty());
  }

  @Test
  void pop() {

    assertEquals(0, stack.size());
    for (int i = 0; i < 20; i++) {
      stack.push(i);
    }
    assertEquals(20, stack.size());

    assertEquals(19, stack.pop());
    assertEquals(18, stack.pop());
    assertEquals(17, stack.pop());
    assertFalse(stack.isEmpty());
    assertEquals(17, stack.size());
  }
}
