package algorithms.xplorer.search;

import static org.junit.jupiter.api.Assertions.*;

import algorithms.xplorer.BinarySearch;
import algorithms.xplorer.impl.IterativeBinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  private BinarySearch binarySearch;

  @BeforeEach
  void setUp() {
    binarySearch = new IterativeBinarySearch();
  }

  @Test
  void binarySearchIterativeTest() {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    int target = 59;
    int expectedIndex = binarySearch.binarySearch(array, target);
    assertEquals(58, expectedIndex);
  }

  @Test
  void binarySearchRecursiveTest() {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    int target = 87;
    int expectedIndex = binarySearch.binarySearch(array, target);
    assertEquals(86, expectedIndex);
  }
}
