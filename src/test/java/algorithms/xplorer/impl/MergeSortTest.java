package algorithms.xplorer.impl;

import static org.junit.jupiter.api.Assertions.*;

import algorithms.xplorer.Sort;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {

  private Sort sort;

  @BeforeEach
  void setUp() {
    sort = new MergeSort();
  }

  @Test
  public void mergeSortAscTest() {
    int[] unsorted = {3, 7, 2, 9, 1, 5};
    int[] sorted = sort.asc(unsorted);
    assertEquals("[1, 2, 3, 5, 7, 9]", Arrays.toString(sorted));
  }

  @Test
  public void mergeSortDescTest() {
    int[] unsorted = {3, 7, 2, 9, 1, 5};
    int[] sorted = sort.desc(unsorted);
    assertEquals("[9, 7, 5, 3, 2, 1]", Arrays.toString(sorted));
  }
}
