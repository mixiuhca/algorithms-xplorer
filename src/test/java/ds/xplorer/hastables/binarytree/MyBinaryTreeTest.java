package ds.xplorer.hastables.binarytree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBinaryTreeTest {

  private MyNode tree;

  @BeforeEach
  void setUp() {
    tree = new MyNode(41);
  }

  @Test
  void insertTest() {
    int[] randomNumbers = {
      45, 78, 23, 56, 12, 67, 89, 34, 99, 41, 17, 68, 73, 54, 30, 25, 92, 10, 84, 3
    };
    for (int i = 0; i < randomNumbers.length; i++) {
      tree.insert(randomNumbers[i]);
    }
    assertEquals(20, tree.getSize());
  }

  @Test
  void searchTest() {

    int[] randomNumbers = {
      45, 78, 23, 56, 12, 67, 89, 34, 99, 41, 17, 68, 73, 54, 30, 25, 92, 10, 84, 3
    };
    for (int i = 0; i < randomNumbers.length; i++) {
      tree.insert(randomNumbers[i]);
    }

    boolean result = tree.contains(41);
    assertTrue(result);
  }
}
