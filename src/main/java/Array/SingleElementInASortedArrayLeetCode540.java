package Array;

public class SingleElementInASortedArrayLeetCode540 {

    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicateUsingBST(nums));
    }

    private static int singleNonDuplicate(int[] nums) {
        int[] count = new int[nums.length + 1];
        int i = 0;
        int j = 1;
        while (i < nums.length) {
            if (nums[i] == nums[j]) {
                i += 2;
                j += 2;
            } else {
                return nums[i];
            }
        }
        return -1;
    }

    private static int singleNonDuplicateUsingBST(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            //Case1: edge case
            if (mid == 0 && nums[mid] != nums[mid + 1])
                return nums[mid];
            // Case2: edge case
            if (mid == nums.length - 1 && nums[mid] != nums[mid - 1])
                return nums[mid];
            // Case3: if we found the element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            // Case 4: For cases where we have answer on the left (your mid is second duplicate element)
            if (nums[mid] != nums[mid - 1] && mid % 2 == 0 || nums[mid] == nums[mid - 1] && mid % 2 != 0)
                low = mid + 1;

            // Case 4: For cases where we have answer on the right (your mid is first duplicate element)
            if (nums[mid] != nums[mid - 1] && mid % 2 != 0 || nums[mid] == nums[mid - 1] && mid % 2 == 0)
                high = mid - 1;
        }
        return nums[0];
    }
}
