package algorithms.xplorer.problems;

public class GenericClass {

  /**
   * Time Complexity O(log n) This is because in the worst case the most steps we can take for a
   * given num will be when everytime we halve we subtract one in the following step.
   *
   * <p>Space Complexity is O(1), as we have not created data structure proportional in size to the
   * value of our input.
   */
  public int numberOfSteps(int num) {

    boolean isEven;
    int executions = 0;
    while (num > 0) {
      isEven = num % 2 == 0;
      if (isEven) {
        num = num / 2;
      } else {
        num--;
      }
      executions++;
    }

    return executions;
  }

  public String[] fizzBuzz(int n) {
    String[] result = new String[n];
    for (int i = 1; i <= n; i++) {

      boolean divisibleBy3 = i % 3 == 0;
      boolean divisibleBy5 = i % 5 == 0;

      int idxMinusOne = i - 1;
      if (divisibleBy3 && divisibleBy5) {
        result[idxMinusOne] = "FizzBuzz";
      } else if (divisibleBy3) {
        result[idxMinusOne] = "Fizz";
      } else if (divisibleBy5) {
        result[idxMinusOne] = "Buzz";
      } else {
        result[idxMinusOne] = String.valueOf(i);
      }
    }
    return result;
  }

  // Time Complexity is O(n x m) as we must traverse each
  // account in a bank for the given customer.
  // Space Complexity is O(1), as we don't create another
  // data structure proportional in size to our input that help us
  // find the solution.
  public int richestCustomerWealth(int[][] accounts) {

    int richest = 0;
    for (int i = 0; i < accounts.length; i++) {
      int wealth = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        wealth += accounts[i][j];
      }
      if (wealth > richest) {
        richest = wealth;
      }
    }
    return richest;
  }

  public int[] runningSum1DArray(final int[] array) {

    int[] result = new int[array.length];
    result[0] = array[0];

    for (int i = 1; i < array.length; i++) {
      result[i] += array[i - 1];
    }

    return result;
  }
}
