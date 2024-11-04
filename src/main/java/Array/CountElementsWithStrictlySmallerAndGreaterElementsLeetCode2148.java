package Array;

public class CountElementsWithStrictlySmallerAndGreaterElementsLeetCode2148 {
public static void main(String[] args){
    int[] nums = {3,11,7,2,9};
    System.out.println(countElement(nums));

}
private static int countElement(int[] nums){
    int count=0;
    int minValue = nums[0];
    int maxValue = nums[0];

    if(nums.length < 2){
        return 0;
    }

    for(int i=0; i<nums.length;i++){
         minValue = Math.min(minValue, nums[i]);
         maxValue = Math.max(maxValue, nums[i]);
    }
    for(int num: nums){
        if(minValue < num && num < maxValue){
            count++;
        }
    }
    return count;
}
}
