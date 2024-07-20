package algorithms.xplorer.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  private BinarySearch search;

  @BeforeEach
  void setUp() {
    search = new BinarySearch();
  }

  @Test
  void binarySearchTest() {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    int target = 37;
    int expectedIndex = search.binarySearch(array, target);
    assertEquals(36, expectedIndex);
  }

  @Test
  void binarySearchV2Test() {
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    int target = 10;
    int expectedIndex = search.binarySearchV2(array, target);
    assertEquals(9, expectedIndex);
  }

  @Test
  void binarySearchRecursiveTest() {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    int target = 37;
    int expectedIndex = search.binarySearchRecursive(array, target, 0, array.length - 1);
    assertEquals(36, expectedIndex);
  }
}
