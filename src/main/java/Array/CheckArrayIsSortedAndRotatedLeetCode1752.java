package Array;

/**
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
 */
public class CheckArrayIsSortedAndRotatedLeetCode1752 {
    public static void main(String[] args){
        CheckArrayIsSortedAndRotatedLeetCode1752 ch = new CheckArrayIsSortedAndRotatedLeetCode1752();
        int[] nums = {6};
        System.out.println(ch.check(nums));
    }

    /**
     * if more than 1 element is not in sorted order then return false i.e if count is greater than 1 afte the check nums[i] > nums[i+1]
     * @param nums
     * @return
     */
    public boolean check(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n = nums.length-1;
        int count =0;
        int i=0;
        while(i<n-1){
            if(nums[i] > nums[i+1]){
                count++;
            }
            i++;
        }
        if(nums[n-1]>nums[0]){
            count++;
        }
        if(count>1){
            return false;
        }
        return true;
    }
}
