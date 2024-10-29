package Array;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 *
 * Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroesLeetCode283 {

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroesWithoutCount(nums);
    }
    /**
     *
     * @param nums
     */
    private static void moveZeroes(int[] nums) {
        int j = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[j++] = nums[i];
            }else if(nums[i] == 0){
                count++;
            }
        }
        while(count>0){
            nums[nums.length-count] = 0;
            count--;
        }
        System.out.println(Arrays.toString(nums));
    }


    /**
     * Good
     * @param nums
     */
    private static void moveZeroesWithoutCount(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length){
            nums[j++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
