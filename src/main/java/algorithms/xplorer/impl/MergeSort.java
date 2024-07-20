package algorithms.xplorer.impl;

import algorithms.xplorer.Sort;

public class MergeSort implements Sort {

  /**
   * Given: array of unsorted elements Output: should return an arrya of sorted elements
   *
   * <p>Options: Merge Sort Define base case. Divide the array in halves. Recursively sort left and
   * right halves. Merge back each array to its branch.
   *
   * @param array
   * @return
   */
  @Override
  public int[] asc(int[] array) {

    // recursive algorithm Runtime Complexity: O(n log n)
    // Base case
    // Split the array in halves
    // Sort recursively each halve
    // merge back the array sorted to its original halve

    if (array.length <= 1) {
      return array;
    }

    int mid = array.length / 2;
    int[] left = new int[mid];
    int[] right = new int[array.length - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = array[i];
    }

    for (int i = mid; i < array.length; i++) {
      right[i - mid] = array[i];
    }

    left = asc(left);
    right = asc(right);

    return merge(left, right);
  }

  private int[] merge(int[] left, int[] right) {

    int[] sorted = new int[left.length + right.length];
    int l = 0, r = 0, i = 0;

    while (l < left.length && r < right.length) {
      if (left[l] < right[r]) {
        sorted[i++] = left[l++];
      } else {
        sorted[i++] = right[r++];
      }
    }

    while (l < left.length) {
      sorted[i++] = left[l++];
    }

    while (r < right.length) {
      sorted[i++] = right[r++];
    }

    return sorted;
  }

  @Override
  public int[] desc(int[] array) {
    // base case
    // split in halves the array
    // recursively sort each side
    // merge back both sides into the original array
    if (array.length <= 1) {
      return array;
    }

    int mid = array.length / 2;
    int[] left = new int[mid];
    int[] right = new int[array.length - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = array[i];
    }

    for (int i = mid; i < array.length; i++) {
      right[i - mid] = array[i];
    }

    left = desc(left);
    right = desc(right);

    return mergeDsc(left, right);
  }

  private int[] mergeDsc(int[] left, int[] right) {

    int[] sorted = new int[left.length + right.length];
    int l = 0, r = 0, i = 0;

    while (l < left.length && r < right.length) {
      if (left[l] > right[r]) {
        sorted[i++] = left[l++];
      } else {
        sorted[i++] = right[r++];
      }
    }

    while (l < left.length) {
      sorted[i++] = left[l++];
    }

    while (r < right.length) {
      sorted[i++] = right[r++];
    }

    return sorted;
  }
}
