package algorithms.xplorer.impl;

import algorithms.xplorer.BinarySearch;

public class IterativeBinarySearch implements BinarySearch {

  @Override
  public int binarySearch(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;

    for (; left <= right; ) {

      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (arr[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return -1;
  }
}
