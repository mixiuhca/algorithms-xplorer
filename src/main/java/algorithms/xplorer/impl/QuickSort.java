package algorithms.xplorer.impl;

import algorithms.xplorer.Sort;

public class QuickSort implements Sort {

  @Override
  public int[] asc(int[] array) {
    return quicksort(array, 0, array.length - 1);
  }

  private int[] quicksort(int[] array, int start, int end) {

    if (start < end) { // base case
      // partition the array and get the pivot index
      int pivot = partition(array, start, end);
      // sort both sub-arrays
      quicksort(array, start, pivot - 1);
      quicksort(array, pivot + 1, end);
    }

    return array;
  }

  private int partition(int[] array, int start, int end) {
    // select the last element as the pivot
    int pivot = array[end];
    // get the index of the smaller element
    int i = start - 1;

    for (int j = start; j < end; j++) {
      if (array[j] < pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    // swap i+1 and arr[end]
    int temp = array[i + 1];
    array[i + 1] = array[end];
    array[end] = temp;

    return i + 1; // return the pivot index
  }

  @Override
  public int[] desc(int[] array) {
    return quickSortDesc(array, 0, array.length - 1);
  }

  private int[] quickSortDesc(int[] array, int start, int end) {

    if (start < end) {
      int pivot = partitionDesc(array, start, end);
      quickSortDesc(array, start, pivot - 1);
      quickSortDesc(array, pivot + 1, end);
    }

    return array;
  }

  private int partitionDesc(int[] array, int start, int end) {
    // select a pivot
    int pivot = array[end];
    // compare array[i] < pivot
    int i = start - 1;
    for (int j = start; j < array.length; j++) {
      if (array[j] > pivot) { // if so swap
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    // move the pivot to its final position
    int temp = array[i + 1];
    array[i + 1] = array[end];
    array[end] = temp;

    // return the pivot
    return i + 1;
  }
}
