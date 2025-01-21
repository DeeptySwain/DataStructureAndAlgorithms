package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 *
 *
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class MajorityElementLeetCode169 {
public static void main(String[] args){
    int[] nums = {2,2,1,1,1,2,2};

    MajorityElementLeetCode169 maj = new MajorityElementLeetCode169();
    System.out.println(maj.majorityElementUsingBoyerMooreMajorityVotingAlgorithm(nums));

}
    public int majorityElement(int[] nums){
    int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num , 0)+1);
            }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxCount < entry.getValue() && entry.getValue() > nums.length/2){
                maxCount = entry.getKey();
            }
            System.out.println(maxCount);
        }
        return maxCount;
    }

    public int majorityElement0(int[] nums) {
        int majorityElement = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intList = new ArrayList<>();
        intList.contains(1);
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            // if current element count is > > nums.length/2
            if(map.get(num)> nums.length/2){
                majorityElement = num;
                break;
            }
        }
        return majorityElement;
    }

    /**
     * This algorithm works on the fact that if an element occurs more than N/2 times, it means that the remaining elements other than this would definitely be less than N/2. So let us check the proceeding of the algorithm.
     *
     * First, choose a candidate from the given set of elements if it is the same as the candidate element, increase the votes.
     * Otherwise, decrease the votes if votes become 0, select another new element as the new candidate.
     * @param nums
     * @return
     */
    public int majorityElementUsingBoyerMooreMajorityVotingAlgorithm(int[] nums){
    int vote =0;
    int candidate = -1;
    for(int num : nums){
        if(vote ==0){
            candidate = num;
        }
        if(candidate == num){
            vote++;
        }
        else vote --;
    }
    return candidate;
    }
}
