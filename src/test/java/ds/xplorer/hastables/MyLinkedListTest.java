package ds.xplorer.hastables;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

  private MyLinkedList linkedList;

  @BeforeEach
  void setUp() {
    linkedList = new MyLinkedList();
  }

  @Test
  void insertAtBeginning() {
    assertEquals(0, linkedList.getSize());
    int data = 100;
    int result = linkedList.insertAtBeginning(data);
    assertEquals(0, result);
    result = linkedList.insertAtBeginning(900);
    assertEquals(0, result);
    result = linkedList.insertAtBeginning(1000);
    assertEquals(0, result);
    assertEquals(3, linkedList.getSize());
    linkedList.print();
  }

  @Test
  void insertAtEnd() {
    assertEquals(0, linkedList.getSize());
    int data = 100;
    int result = linkedList.insertAtEnd(data);
    assertEquals(0, result);
    result = linkedList.insertAtEnd(data);
    assertEquals(0, result);
    result = linkedList.insertAtEnd(data);
    assertEquals(0, result);
    result = linkedList.insertAtEnd(data);
    assertEquals(0, result);
    assertEquals(4, linkedList.getSize());
    linkedList.print();
  }

  @Test
  void deleteNode() {
    assertEquals(0, linkedList.getSize());
    for (int i = 0; i < 10; i++) {
      int result = linkedList.insertAtBeginning(i);
      assertEquals(0, result);
    }
    assertEquals(10, linkedList.getSize());
    linkedList.print();

    linkedList.deleteNode(9);
    linkedList.deleteNode(8);
    linkedList.deleteNode(7);
    assertEquals(7, linkedList.getSize());
    linkedList.print();
  }
}
