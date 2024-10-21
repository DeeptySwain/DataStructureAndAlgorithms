package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2InputArrayIsSorted167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        TwoSum2InputArrayIsSorted167 ts = new TwoSum2InputArrayIsSorted167();
        System.out.println(Arrays.toString(ts.twoSumUsingHashmap(arr,target)));
    }

    /**
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        for(int i=1; i<numbers.length;i++){
            for(int j=i; j<numbers.length; j++){
                if(target == numbers[j] +numbers[j-i]){
                    return new int[] {((j-i)+1),(j+1)};
                }
            }
        }
        throw new IllegalArgumentException("Not found any two sum solution.");
    }

    /**
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSumUsingHashmap(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            int complement = target-numbers[i];
            if(map.containsKey(complement) && map.get(complement)!= i){
                return new int[] {map.get(complement)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        throw new IllegalArgumentException("Not found any two sum solution.");
    }
}
