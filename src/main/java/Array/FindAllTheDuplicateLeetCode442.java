package Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheDuplicateLeetCode442 {
    public static void main(String[] args) {
        int[] nums = {3,8,9,5,7,8,1,2,4,5,6,7};
        FindAllTheDuplicateLeetCode442 ms = new FindAllTheDuplicateLeetCode442();
        System.out.println(ms.findAllDuplicateNumber(nums));
    }

    /**
     *
     * @param nums
     * @return
     */
    public List<Integer> findAllDuplicateNumber(int[] nums){
        List<Integer> list = new ArrayList<Integer>();
        boolean[] count = new boolean[nums.length];
        for(int i=0;i<nums.length;i++) {
            if (count[nums[i]]) {
                list.add(nums[i]);
            }
            count[nums[i]] = true;
        }
        return list;
    }
}
