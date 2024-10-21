package Array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Examples
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 *
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Input: nums = [3,0,3], target = 6
 *  * Output: [0,2]
 */
public class TwoSumLeetCode1 {
public static void main(String[] args) {
    int[] arr = {2,7,11,15};
    int target = 9;
    System.out.println(Arrays.toString(twoSumold(arr,target)));
}

private static int[] twoSumold(int[] arr, int target){
    int[] temp = new int[2];
    for(int i=0; i<arr.length-1;i++) {
        for(int j=i+1; j<arr.length;j++) {
            if (arr[i] + arr[j] == target) {
                temp[0] = i;
                temp[1] = j;
            }
        }
    }
    return  temp;
}

    /**
     * Oms but o(n2)
     * @param arr
     * @param target
     * @return
     */
    private static int[] twoSumUsingBruteForce(int[] arr, int target) {
        for(int i=1; i<arr.length;i++) {
            for(int j=i; j<arr.length;j++) {
                if (target == arr[j] + arr[j-i]) {
                    return new int[] {j-i,j};
                }
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution Found.");
    }

    /**
     * Algorithm Explanation:
     * This solution uses a hash map to solve the "Two Sum" problem efficiently. The goal is to find two numbers in the array that add up to the target sum.
     * Here's how it works:
     *
     * It iterates through the array once.
     * For each element, it calculates the complement (target - current element).
     * If the complement exists in the hash map, we've found our pair.
     * If not, it adds the current element to the hash map.
     *
     * TC: We traverse the array once, and hash map operations (containsKey, get, put) are generally O(1) on average.
     * In the worst case, we might need to iterate through all elements once, giving us O(n) time complexity.
     *
     * SC: In the worst case, we might need to store n-1 elements in the hash map before finding the solution.
     * This gives us a space complexity of O(n).
     */

    private static int[] twoSumUsingMap(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement) && map.get(complement) !=i){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found.");
    }
}
