package Array;

import java.util.Arrays;

public class Rotate90LeetCode48 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3,4}, {5, 6, 7,8}, {9, 10, 11,12}, {13,14,15,16}};
      //  System.out.println(Arrays.deepToString(rotate90(matrix)));
        System.out.println(Arrays.deepToString(rotateAnArray90(matrix)));
      System.out.println(Arrays.deepToString(rotateAnArray90TraverseAndReverse(matrix)));
    }

    private static int[][] rotate90(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        for(int j = 0; j < n; j++){
            for(int i = n-1, p = 0; i >= 0; i--, p++){ // ? why did you made internal loop coming from back side?
            temp[j][p] = matrix[i][j];

            }
        }
        System.out.println(Arrays.deepToString(temp));



//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = 0; j < n; j++) {
//                temp[j][i] = matrix[i][j];
//            }
//        }
//      System.out.println(Arrays.deepToString(temp));  // [[1, 4, 7], [2, 5, 8], [3, 6, 9]] // should be: [[7,4,1],[8,5,2],[9,6,3]]
//        int temp1 =0;
//        //int[][] temp1 = new int[n][n];
//        for(int i=0; i<n; i++) {
//            for (int j = temp.length-1, k=0; j >0 && k< n-1; j--,k++) {
//                temp1=temp[i][j];
//                temp[i][j]= temp[i][k];
//                temp[i][k] = temp1;
//            }
//        }
        matrix = temp.clone();
        return matrix;
    }

    //
    private static int[][] rotateAnArray90(int[][] matrix){
        int n = matrix.length;
        int[][] temp = new int[n][n];
        for(int i = 0; i <n ; i++){
            for(int j = 0; j<n; j++){
                temp[j][(n-1)-i] = matrix[i][j];
            }
        }
        matrix = temp.clone();
        return temp;
    }

    //Transpose and reverse:
    private static int[][] rotateAnArray90TraverseAndReverse(int[][] matrix){
    int n = matrix.length;
    // Traverse
        for(int i = 0; i <n; i++){
        for(int j = i; j<n; j++){ /**Why start at i?
                    By starting j at i, we only process the upper triangular part of the matrix (including the diagonal).
                    This avoids swapping elements twice and ensures each pair is swapped only once. **/

            int temp = matrix[i][j];
            matrix[i][j] =  matrix[j][i];
            matrix[j][i] = temp;
        }
    }
     //   System.out.println(Arrays.deepToString(matrix));

        // reverse:
        for(int i=0; i <n; i++) {
            for (int j = 0; j < n/2; j++) {  /**
             We only need to iterate through half of the row because we're swapping elements.
             For each iteration, we swap an element from the first half with its corresponding element from the second half.
             If we went through the entire row, we'd end up swapping everything twice, effectively undoing the reversal.**/
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j]; /** If we used matrix[i][n-1], we would always be referring to the last element of the row.
                 This would result in swapping each element with the last element, instead of reversing the entire row.
                 n-1-j gives us the index of the element we want to swap with j.
                 matrix[i][n-1-j] is necessary because it allows us to dynamically calculate the correct "mirror" position for each element as we move through the first half of the row.
                 This ensures a proper reversal of the entire row, not just swapping with the last element repeatedly. **/
                matrix[i][n-1-j] = temp;
            }
        }
       // System.out.println(Arrays.deepToString(matrix));
        return matrix;
}
}
