package algorithms.xplorer.problems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateImageTest {

  private RotateImage image;

  @BeforeEach
  void setUp() {
    image = new RotateImage();
  }

  @Test
  void rotate90DegreesTest() {
    int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    System.out.println(matrixToString(matrix));
    image.rotate(matrix);
    System.out.println(matrixToString(matrix));
  }

  private String matrixToString(int[][] matrix) {
    StringBuilder sb = new StringBuilder();
    for (int[] row : matrix) {
      sb.append(Arrays.toString(row)).append(System.lineSeparator());
    }
    return sb.toString();
  }
}
