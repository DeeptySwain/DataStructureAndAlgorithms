package Array;

/**
 * Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
 *
 * Example
 *
 * myArray = {1,2,3,4,6}
 * findMissingNumberInArray(myArray, 6) // 5
 * Hint:
 *
 * Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
 */
public class MissingNumberUdemy {
    public static void main(String[] args){
        int[] nums = {3,0,1};
        MissingNumberUdemy ms = new MissingNumberUdemy();
        System.out.println(ms.missingNumber(nums));
    }

    /**
     * we can use formula for sum of n integer number: n*(n+1))/2
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum +=nums[i];
        }
        int n = nums.length;
        return ((n*(n+1))/2) - sum;
    }
}
