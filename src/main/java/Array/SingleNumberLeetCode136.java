package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberLeetCode136 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,1};
        SingleNumberLeetCode136 ms = new SingleNumberLeetCode136();
        System.out.println(ms.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int n= nums.length;
        if(n==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Example: finding the key for value 1
        Integer key = getKeyByValue(map, 1);

        return key;
    }


    public static Integer getKeyByValue(HashMap<Integer, Integer> map, int targetValue) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == targetValue) {
                return entry.getKey(); // Return the key when the target value is found
            }
        }
        return null; // Return null if no key is found for the given value
    }

}
