package Array;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertionPostionLeetCode35 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    /**
     * Used binary search to  find the index of target element to be placed in the array.
     * Returns the start value.
     * @param nums
     * @param target
     * @return
     */
        private static int searchInsert(int[] nums, int target){
        int start =0;
        int end = nums.length-1;
        int mid = 0;

        while(start<= end) {
            mid = start + (end-start)/2;
            if (nums[mid] == target){
                return mid;
             }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else end = mid-1;
        }
        return start;
        }

}
