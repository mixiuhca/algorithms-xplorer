package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem1Test {

  private Problem1 problem;

  @BeforeEach
  void setUp() {
    problem = new Problem1();
  }

  @Test
  void builtArrayTest() {
    int[] nums = new int[] {0, 2, 1, 5, 3, 4};
    int[] ans = problem.builtArray(nums);
    Assertions.assertEquals("[0, 1, 2, 4, 5, 3]", Arrays.toString(ans));
  }

  @Test
  void builtArray2Test() {
    int[] nums = new int[] {0, 2, 1, 5, 3, 4};
    int[] ans = problem.buildArraySolution2(nums);
    Assertions.assertEquals("[0, 1, 2, 4, 5, 3]", Arrays.toString(ans));
  }

  @Test
  void builtArraySolution3Test() {
    int[] nums = new int[] {0, 2, 1, 5, 3, 4};
    int[] ans = problem.buildArraySolution3(nums);
    Assertions.assertEquals("[0, 1, 2, 4, 5, 3]", Arrays.toString(ans));
  }
}
