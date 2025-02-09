package Array;

/**
 * Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
 *
 * A subarray is defined as a contiguous sequence of numbers in an array.
 *
 * A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,20,30,5,10,50]
 * Output: 65
 * Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
 *
 */

public class MaximumAscendingSubarraySumLeetCode1800 {
    public static void main(String[] args) {
        MaximumAscendingSubarraySumLeetCode1800 mas = new MaximumAscendingSubarraySumLeetCode1800();
        int[] nums = {10,20,30,5,10,50};
        System.out.println(mas.maxAscendingSum(nums));
    }

    public int maxAscendingSum(int[] nums) {
        int n= nums.length-1;
        int resultMax =nums[0]; // initially nums[0] is maximum sum
        int currentMax = nums[0];

        for(int i=0;i<n;i++){
            if(nums[i+1] > nums[i]){
                currentMax += nums[i+1];
            }else{
                currentMax = nums[i+1];
            }
            resultMax = Math.max(resultMax, currentMax);
        }
        return resultMax;
    }

}
