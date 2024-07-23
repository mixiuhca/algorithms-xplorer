package algorithms.xplorer.impl;

import algorithms.xplorer.BinarySearch;

public class RecursiveBinarySearch implements BinarySearch {

  @Override
  public int binarySearch(int[] arr, int target) {
    return binarySearch(arr, target, 0, arr.length - 1);
  }

  private int binarySearch(int[] arr, int target, int left, int right) {

    if (left > right) {
      return -1;
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] > target) {
      return binarySearch(arr, target, left, mid - 1);
    }

    return binarySearch(arr, target, mid + 1, right);
  }
}
