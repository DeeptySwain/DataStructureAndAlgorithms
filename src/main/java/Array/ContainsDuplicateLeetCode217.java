package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateLeetCode217 {

    /**
     * Using Set
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        if(nums.length ==2){
            if(nums[0]==nums[1]){
                return true;
            }else return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
