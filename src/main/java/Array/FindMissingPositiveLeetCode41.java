package Array;

import java.util.HashSet;
import java.util.Set;

public class FindMissingPositiveLeetCode41 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        FindMissingPositiveLeetCode41 ms = new FindMissingPositiveLeetCode41();
        System.out.println(ms.firstMissingPositive(nums));
    }

    /**
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> hashSets = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
                hashSets.add(nums[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!hashSets.contains(i)) {
                return i;
            }
        }
        // If all numbers are present
        return n+1;
    }
}
