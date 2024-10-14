package Array;

import java.util.Arrays;

public class CalculateSumOfDiagonalLeetCode1572 {
    public static void main(String[] args){
        int[][] nums ={{1,2,3},{4,5,6},{7,8,9}};
      //  int[][] nums = {{1, 2, 3,4}, {5, 6, 7,8}, {9, 10, 11,12}, {13,14,15,16}};
        System.out.println(diagonalSum(nums)); // [2,3,4,]
    }

    private static int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=mat[i][i];
            sum+=mat[len-1-i][i];
        }
        if(len%2!=0){
            sum-=mat[len/2][len/2];
        }
        return sum;
    }
}
