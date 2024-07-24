package algorithms.xplorer.problems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GenericClassTest {

  private GenericClass generic;

  @BeforeAll
  public void setUp() {
    generic = new GenericClass();
  }

  @Test
  public void numberOfSteps() {
    int result = generic.numberOfSteps(14);
    assertEquals(6, result);
  }

  @Test
  public void numberOfStepsTestCase2() {
    int result = generic.numberOfSteps(0);
    assertEquals(0, result);
  }

  @Test
  public void fizzBuzzTest() {
    String[] result = generic.fizzBuzz(15);
    assertEquals(
        "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]",
        Arrays.toString(result));
  }

  @Test
  public void richestCustomerWealth() {
    int[][] accounts = new int[][] {{7, 1, 3}, {2, 8, 7}, {1, 9, 5}};
    int result = generic.richestCustomerWealth(accounts);
    assertEquals(17, result);
  }

  @Test
  public void runningSum1DArrayTest() {
    var array = new int[] {3, 1, 2, 10, 1};
    int[] sum1DArray = generic.runningSum1DArray(array);
    System.out.printf(Arrays.toString(sum1DArray));
  }
}
