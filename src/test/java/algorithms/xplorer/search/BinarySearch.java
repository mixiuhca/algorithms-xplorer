package algorithms.xplorer.search;

public class BinarySearch {

  public int binarySearch(int[] array, int target) {

    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + ((right - left) / 2);

      if (array[mid] == target) {
        return mid;
      }

      if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

  public int binarySearchV2(int[] array, int target) {

    int start = 0;
    int end = array.length - 1;

    for (; start <= end; ) {
      int mid = start + ((end - start) / 2);
      if (array[mid] == target) {
        return mid;
      }

      if (array[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return -1;
  }

  public int binarySearchRecursive(int[] arr, int target, int left, int right) {

    if (left > right) {
      return -1;
    }

    int mid = left + ((right - left) / 2);
    if (arr[mid] == target) {
      return mid;
    }

    if (arr[mid] > target) {
      return binarySearchRecursive(arr, target, left, mid - 1);
    }

    return binarySearchRecursive(arr, target, mid + 1, right);
  }
}
