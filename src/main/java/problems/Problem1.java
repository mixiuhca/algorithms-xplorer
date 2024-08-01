package problems;

public class Problem1 {

  public int[] builtArray(int[] nums) {
    int len = nums.length;
    int[] ans = new int[len];

    for (int i = 0; i < len; i++) {
      ans[i] = nums[nums[i]];
    }

    return ans;
  }

  public int[] buildArraySolution2(int[] nums) {

    int len = nums.length;

    for (int i = 0; i < len; i++) {
      nums[i] = nums[i] + (nums[nums[i]] % len) * len;
    }

    for (int i = 0; i < len; i++) {
      nums[i] = nums[i] / len;
    }

    return nums;
  }

  public int[] buildArraySolution3(int[] nums) {
    permutation(nums, 0);
    return nums;
  }

  private void permutation(int[] nums, int start) {
    if (start < nums.length) {
      int temp = nums[start];
      int result = nums[temp];
      permutation(nums, start + 1);
      nums[start] = result;
    }
  }
}
