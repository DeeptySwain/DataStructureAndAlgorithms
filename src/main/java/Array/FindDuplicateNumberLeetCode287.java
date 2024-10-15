package Array;

public class FindDuplicateNumberLeetCode287 {
    public static void main(String[] args) {
        int[] nums = {3,8,8,1,2,4,5,6,7};
        FindDuplicateNumberLeetCode287 ms = new FindDuplicateNumberLeetCode287();
        System.out.println(ms.FindDuplicateNumberLeetCode287(nums));
    }

    /**
     * Using boolean array : 0ms
     * @param nums
     * @return
     */
    public int FindDuplicateNumberLeetCode287(int[] nums){
        boolean[] count = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(count[nums[i]]){
                return nums[i];
            }
            count[nums[i]] = true;
        }
        return  -1;
    }

    /**
     *
     * @param nums
     * @return
     */
    public int findDuplicateUsingInt(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[nums[i]]++;
            if(temp[nums[i]] >1){
                return nums[i];
            }
        }
        return -1;
    }
}
