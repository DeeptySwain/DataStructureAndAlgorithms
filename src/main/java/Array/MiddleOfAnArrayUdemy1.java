package Array;

import java.util.Arrays;

/**
 * Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
 *
 * myArray = [1, 2, 3, 4]
 * middle(myArray)  # [2,3].
 */

public class MiddleOfAnArrayUdemy1 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(Middle(nums))); // [2,3,4,]
    }

    /**
     * For Loop Used to iterate over the array nums and store value of middle elements (not including first nums[0] and last nums[n-1])) element in the array.
     * @param nums
     * @return
     */
    private static int[] Middle(int[] nums){
        int[] temp = new int[nums.length - 2];
        for(int i=0; i<nums.length-2;i++){
            temp[i] = nums[i+1];
        }
        return temp;
}
}
