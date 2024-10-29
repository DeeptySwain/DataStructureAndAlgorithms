package Array;

import java.util.Arrays;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
public class RotateImageLeetCode48 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotateImage90(matrix)));
    }

    private static int[][] rotateImage90(int[][] matrix){
        int n = matrix.length;
        //Transpose: Make row into column: {{1,4,7},{2,5,8},{3,6,9}}
        int temp =0;
        for(int i=0; i < n; i++){
            for(int j=i; j<n; j++){ /**By starting j from i: We only process each pair once. We avoid swapping elements with themselves (diagonal elements)
We avoid swapping elements that were already swapped **/
                temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse: now reverse the position to complete the rotation
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        return matrix;
    }
}
