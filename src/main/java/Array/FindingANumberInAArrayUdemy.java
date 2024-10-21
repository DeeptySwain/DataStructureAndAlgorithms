package Array;

public class FindingANumberInAArrayUdemy {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int value = 6;
        System.out.println(searchInArray(nums, value));
    }

    /**
     * considering array is sorted
     */
    private static int findANumberUsingBST(int[] nums, int value) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if (nums.length == 1 && nums[0] == value) {
            return nums[0];
        }

        while (low <= high) {
            mid = low + (high - low) / 2;
            // case1: if we found the ans:
            if (nums[mid] == value)
                return mid;
            //case2: if mid > value then answer is on the left, so we can discard right side values
            if (nums[mid] > value)
                high = mid - 1;
            //case3: if mid < value then answer is on the right, so we can discard left side values
            if (nums[mid] < value)
                low = mid + 1;
        }
        return -1;
    }

    /**
     * Bruteforce which will work even in case not sorted.
     */

    private static int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch)
                return i;
        }
        return -1;
    }
}
