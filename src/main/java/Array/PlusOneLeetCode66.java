package Array;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 *
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 *
 * Example 3:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 *
 *
 * Constraints:
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */

public class PlusOneLeetCode66 {
    public static void main(String[] args) {
        int[] nums1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(nums1)));
    }

    /**
     * @param digits
     * @return
     */
    private static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            digits[i] =0;
        }
       digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    private static int[] plusOneTrying(int[] digits) {
        int[] temp = new int[digits.length+1];
        int sum =0; int carry=1;
        for(int i=digits.length-1; i >=0; i--){
            sum = digits[i]+ carry;
            carry = sum/10;
            sum %=10;
            digits[i] = sum;
        }
        if(carry==0){
            return digits;
        }else{
            temp[0]=carry;
        }
        return temp;
    }
}

