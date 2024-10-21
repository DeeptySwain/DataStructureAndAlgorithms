package Array;
/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Custom Judge:
 *
 * The judge will test your solution with the following code:
 *
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 *
 * int k = removeDuplicates(nums); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 *
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 3 * 104
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 *
 */

import java.util.Arrays;
import java.util.SortedMap;

public class RemoveDuplicatesfromSortedArrayLeetCode26 {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,4,4,8};
        RemoveDuplicatesfromSortedArrayLeetCode26 ms = new RemoveDuplicatesfromSortedArrayLeetCode26();
    //    System.out.println(ms.removeDuplicatesUdemy(nums));
        System.out.println(ms.removeDuplicates(nums));
    }

    /**
     *he expected answer with correct length
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int j=1; // This will be used as a pointer to keep track of where to place the next unique element.
        for(int i=1; i<nums.length; i++){ // The method then iterates through the array starting from the second element (index 1):
            if(nums[i] != nums[i-1]){ // For each element, it checks if the current element is different from the previous one:
                nums[j++] = nums[i]; // If they are different (i.e., we've found a new unique element), it does two things:
              //  a. It places this unique element at position j in the array.
              //  b. It increments j to be ready for the next unique element.
            }
        }
        System.out.println(Arrays.toString(nums));
        return j; //  which represents the number of unique elements in the array.
    }

    /**
     *
     * @param nums
     * @return
     */
    public int removeDuplicatesUdemy(int[] nums) {
        //TODO
        int num =0;
        for(int i=0;i<nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[num++] = nums[i];
            }
        }
        nums[num++] = nums[nums.length-1];
        System.out.println(Arrays.toString(nums));
        return num;
    }

}
