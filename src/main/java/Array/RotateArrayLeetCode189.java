package Array;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 */
public class RotateArrayLeetCode189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArrayLeetCode189 ral = new RotateArrayLeetCode189();
        ral.rotateUsingReverse(nums, k);
    }

    /**Let me explain the purpose of the modulo operator (%) with a clear example:
     Let's say we have an array of length 5: [1,2,3,4,5]
     And we want to rotate it by k = 7 positions.
     Without modulo:

     Element at index 0 should go to position 0+7 = 7
     Element at index 1 should go to position 1+7 = 8
     Element at index 2 should go to position 2+7 = 9
     Element at index 3 should go to position 3+7 = 10
     Element at index 4 should go to position 4+7 = 11

     But wait! Our array only has indexes 0 to 4. We can't put elements at positions 7,8,9,10,11!
     This is where modulo helps. When we do % with array length (5):

     7 % 5 = 2 (so element at index 0 goes to position 2)
     8 % 5 = 3 (so element at index 1 goes to position 3)
     9 % 5 = 4 (so element at index 2 goes to position 4)
     10 % 5 = 0 (so element at index 3 goes to position 0)
     11 % 5 = 1 (so element at index 4 goes to position 1)

     * Let's visualize it:
     * javaCopyInitial array:        [1, 2, 3, 4, 5]
     * Rotate by k=7:
     * 1 goes to index 2:    [_, _, 1, _, _]
     * 2 goes to index 3:    [_, _, 1, 2, _]
     * 3 goes to index 4:    [_, _, 1, 2, 3]
     * 4 goes to index 0:    [4, _, 1, 2, 3]
     * 5 goes to index 1:    [4, 5, 1, 2, 3]
     * This is equivalent to rotating by k=2 because:
     *
     * 7 rotations = 5 rotations (full circle) + 2 rotations
     * That's why we do k = k % n first (7 % 5 = 2)
     *
     * Another way to think about it:
     *
     * When you rotate an array of length n by n positions, you get back the same array
     * So rotating by k positions is the same as rotating by (k % n) positions
     * This is why we do k = k % n first to optimize for large values of k
     * @param nums
     * @param k
     */


    /**
     * Original Solution: nums[] = 1,2,3,4,5,6,7, k =3
     * I) First Reverse the array position from start to end.  7,6,5,4,3,2,1
     * II) Reverse the first k elements only: 5,6,7,4,3,2,1
     * III) Reverse the rest elements: 5,6,7,1,2,3,4
     **/

    public void rotateUsingReverse(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
       // Step I)
        reverseElementOfArray(nums,0,n-1);
        //Step II)
        reverseElementOfArray(nums,0,k-1);
        //Step III)
        reverseElementOfArray(nums,k,n-1);

        System.out.println(Arrays.toString(nums));
    }

    /**
     * Reverse the array element:
     * @param nums
     * @param start
     * @param end
     */
    private static void reverseElementOfArray(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }


    /**
     * Solution 1: O(n) TC and O(n) SC
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k in case k > n
        int[] temp = nums.clone();

        for (int i = 0; i < n; i++) {
          //  Move each element to its rotated position
            nums[(i+k)%n] = temp[i];
        }
      //  System.out.println(Arrays.toString(nums));
    }
}
