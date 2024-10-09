package Array;

import java.util.Arrays;

public class DetermineMatrixCanBeObtainByRotationLeetCode1886 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0},
                        {0, 1, 0},
                        {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
           System.out.println(findRotation(mat, target));
    }

    private static boolean findRotation(int[][] matrix, int[][] target) {
        int count =4; // bcz a matrix can be rotated 4 times to get the same matrix
        int n = matrix.length;
        // Transpose: count<matrix.length &&
        while (count>0 &&!Arrays.deepEquals(matrix, target)){
            matrix=matrix;
         //   n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            // reverse:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int rev = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = rev;
                }
            }
           count--;
        }
        if(Arrays.deepEquals(matrix, target)){
            return true;
        }
        return false;
    }
    /**
     * Improvised: Separating
     */
}
