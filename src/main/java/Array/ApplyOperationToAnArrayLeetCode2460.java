package Array;

import java.util.Arrays;

public class ApplyOperationToAnArrayLeetCode2460 {
    public static void main(String[] args){
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }

    /**
     *
     * @param nums
     * @return
     */
    private static int[] applyOperations(int[] nums) {
        int n = nums.length;
        int i;
        int j = 0;
        for(i=0; i < n-1; i++){
            if(nums[i] == nums[i+1] && nums[i]!=0) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] !=0){
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length){
            nums[j++] = 0;
        }
        return nums;
    }

    /**
     *
     * @param nums
     * @return
     */
    private static int[] applyOperations1(int[] nums) {
        int n = nums.length;
        int i;
        int nonZeroInex = 0;
        for(i=0; i < n-1; i++){
            if(nums[i] == nums[i+1] && nums[i]!=0) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
/**
 * Let's take an example: [0, 3, 0, 12, 0]
 *
 * nonZeroIndex keeps track of where the next non-zero number should go
 * i scans through the array
 *
 * Step by step:
 *
 * i = 0, nonZeroIndex = 0
 *
 * nums[0] = 0, skip (it's zero)
 *
 *
 * i = 1, nonZeroIndex = 0
 *
 * nums[1] = 3 (non-zero)
 * 1 != 0, so move 3 to position 0
 * Array: [3, 0, 0, 12, 0]
 * nonZeroIndex becomes 1
 *
 *
 * i = 2, nonZeroIndex = 1
 *
 * nums[2] = 0, skip
 *
 *
 * i = 3, nonZeroIndex = 1
 *
 * nums[3] = 12 (non-zero)
 * 3 != 1, so move 12 to position 1
 * Array: [3, 12, 0, 0, 0]
 * nonZeroIndex becomes 2
 *
 *
 * i = 4, nonZeroIndex = 2
 *
 * nums[4] = 0, skip
 *
 *
 *
 * The if(i != nonZeroIndex) check is an optimization:
 *
 * Only moves numbers if they need to move
 * If a non-zero number is already in the correct position, we don't need to copy it to itself
 */

       for(i=0; i <n ; i++){
           if(nums[i] !=0) { // If we find a non-zero number
               if (i != nonZeroInex) { // If current position is different from where it should be
                   nums[nonZeroInex] = nums[i]; // Move number to its correct position
                   nums[i] = 0; // Set current position to zero
               }
               nonZeroInex++;  // Move the position pointer for next non-zero number
           }
        }
        return nums;
    }
}
