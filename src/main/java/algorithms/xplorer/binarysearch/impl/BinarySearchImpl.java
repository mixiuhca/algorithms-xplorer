package algorithms.xplorer.binarysearch.impl;

import algorithms.xplorer.binarysearch.BinarySearch;

public class BinarySearchImpl implements BinarySearch {

  @Override
  public int binarySearch(int[] arr, int target, int lo, int hi) {
    return -1;
  }

  @Override
  public int binarySearch(String[] arr, String target, int lo, int hi) {

    for (; lo <= hi; ) {

      int mid = lo + hi / 2;
      int cmp = arr[mid].compareToIgnoreCase(target);
      if (cmp == 0) return mid;
      if (cmp < 0) hi = mid - 1;
      else lo = mid + 1;
    }

    return -1;
  }
}
