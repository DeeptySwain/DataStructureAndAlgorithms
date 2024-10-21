package Array;

import java.util.Arrays;

/**
 * Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
 *
 * Example
 *
 * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
 * Output : [1, 2, 3, 4, 5]
 */
public class FindUniqueNumFromAnyNumOfDuplicateNumUdemy {
    public static void main(String[] args) {
        int[] nums = {1, 1,1,2, 2, 2, 3,3, 4, 3,5,5,6,3,4,4,4,6,9};
        FindUniqueNumFromAnyNumOfDuplicateNumUdemy ms = new FindUniqueNumFromAnyNumOfDuplicateNumUdemy();
    System.out.println(Arrays.toString(ms.findDuplicateNumber(nums)));
    }

    /**
     *
     * @param nums
     * @return
     */
    public int[] findDuplicateNumber(int[] nums){
        int[] temp = new int[nums.length];
        boolean[] count = new boolean[nums.length+1];
int j=0;
        for (int i=0;i<nums.length;i++){
         if(!count[nums[i]]){
             temp[j] = nums[i];
             j++;
           }
         count[nums[i]] = true;
        }
        return Arrays.copyOf(temp,j);
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr) {
        //   TODO
        int notduplicate = 0;
        int[] temp = new int[arr.length];

        for (int i =0; i < arr.length ; i++){
            boolean isDuplicate = false;
            for( int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            // when not duplicate element
            if(!isDuplicate){
                temp[notduplicate] = arr[i];
                notduplicate++;
            }
        }

        return Arrays.copyOf(temp, notduplicate);
    }
}
