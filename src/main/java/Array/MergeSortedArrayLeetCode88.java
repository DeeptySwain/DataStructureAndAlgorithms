package Array;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * Example 1:
 *
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 *
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * Example 3:
 *
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 *
 * Constraints:
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */

public class MergeSortedArrayLeetCode88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
       /** int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;**/
    //    merge(nums1, m, nums2, n);
        mergeOthersSolution(nums1, m, nums2, n);
    }

    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for num1 element traverse
        int j = n - 1; // pointer for nums2 element traverse
        int k = m + n - 1; //pointer for placing the element from end of nums1 array

        while (j >= 0) {
            // store the larger element at the end of the array
            if ( i >=0 && nums1[i] >= nums2[j]) { //i >=0 making sure num1 element is not crossing the first element.
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    /**
     * Another way same as median of sorted array
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    private static void mergeOthersSolution(int[] nums1, int m, int[] nums2, int n) {
    int[] result = new int[m + n];  // Temporary array to store the merged result
            int i=0; // pointer for nums1
            int j=0; // pointer for nums2
            int k =0; // pointer for result

        // Merge nums1 and nums2 into result
            while(i<m && j<n) {
                if(nums1[i] <= nums2[j]) {
                    result[k++] = nums1[i++];
                }else {result[k++] = nums2[j++];}
               // k++;
        }
            // add remaining element of nums1 to result array
            while (i<m) {
                result[k++] = nums1[i++];
            }
        // add remaining element of nums2 to result array
        while (j<n) {
            result[k++] = nums2[j++];
        }
    // Copy the result back into nums1 (the correct loop condition is m + n)
        // Copy the result back into nums1 (the correct loop condition is m + n)
       // for (i = 0; i < m + n; i++) {
        //    nums1[i] = result[i];
       // }
       nums1 = Arrays.copyOf(result,m+n);
System.out.println(Arrays.toString(nums1));
}
    }