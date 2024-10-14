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
        int n = matrix.length-1;
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
                for (int j = 0; j < n / 2; j++) { // we have to swap first half of row to 2nd half , but if j =n we do then we will end up swaping everything and coming back to previous state. so n/2 so that only one time we swap
                    int rev = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j]; /** If we used matrix[i][n-1], we would always be referring to the last element of the row.
                     This would result in swapping each element with the last element, instead of reversing the entire row.
                     n-1-j gives us the index of the element we want to swap with j.
                     matrix[i][n-1-j] is necessary because it allows us to dynamically calculate the correct "mirror" position for each element as we move through the first half of the row.
                     This ensures a proper reversal of the entire row, not just swapping with the last element repeatedly. **/
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
     *
     */

}
