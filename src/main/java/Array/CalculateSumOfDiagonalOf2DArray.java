package Array;

/**
 * Given 2D array calculate the sum of diagonal elements.
 *
 * Example
 *
 * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 *
 * sumDiagonalElements(myArray2D) # 15
 *
 */
public class CalculateSumOfDiagonalOf2DArray {
public static void main(String[] args){
    int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(CalculateSumOfDiagonal(myArray2D));
    System.out.println(calculateSumOfAllDiagonal(myArray2D));
}

    /**
     * Sum of only primary diagonal
     * @param nums
     * @return
     */

private static int calculateSumOfAllDiagonal(int[][] nums){
    int n = nums.length;
    int sum =0;
    for(int i=0; i<n; i++){
        sum +=nums[i][i];           // if we have to add secondary diagonal as well then we can just add as + nums[i][n-1-i];
    }
    return sum;
    }
    /**
     *
     */
    private static int CalculateSumOfDiagonal(int[][] array){
        int primaryDiagonalSum = 0;
       // int secondaryDiagonalSum = 0;
        // int[][] temp = new int[array.length][array.length];

        for(int row=0; row < array.length; row++){
            for(int col=0; col < array[0].length; col++){
                if(row==col){
                    primaryDiagonalSum += array[row][col];
                    // temp[row][col]= array[row][col];
                }
             //   if(row + col == array.length -1){
                //    secondaryDiagonalSum += array[row][(array.length - (row+1))];
                    //temp[row][col]= array[row][col];
             //   }
            }
        }
        return primaryDiagonalSum;
    }
}
