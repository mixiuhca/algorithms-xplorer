package algorithms.xplorer;

public interface BinarySearch {

  /**
   * Runtime Complexity: O(log n). The original array will be divided in halves, in each division we
   * simply the problem. To compute the number of steps it'll take to find the searched element we
   * could use k = log base2 n, k=num of steps
   *
   * <p>Space Complexity: O(1) constant using Iterative approach, only a few variables are declared
   * to resolve the search. O(log n) using Recursive approach, uses stack space on each division.
   *
   * @return the index of the target in the collection
   */
  int binarySearch(int[] arr, int target);
}
