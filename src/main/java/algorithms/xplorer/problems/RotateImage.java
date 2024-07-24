package algorithms.xplorer.problems;

public class RotateImage {

  public void rotate(int[][] matrix) {

    int len = matrix.length;

    // Step 1: Transpose the matrix
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // Step 2: Reverse each row
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len / 2; j++) {

        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][len - j - 1];
        matrix[i][len - j - 1] = temp;
      }
    }
  }
}
