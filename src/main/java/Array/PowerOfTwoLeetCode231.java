package Array;

/**
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 *
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: n = 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 *
 * Input: n = 3
 * Output: false
 *
 *
 * Constraints:
 *
 * -231 <= n <= 231 - 1
 *
 *
 * Follow up: Could you solve it without loops/recursion?
 */

public class PowerOfTwoLeetCode231 {

    public static void main(String[] args){
        int i = 10;
        System.out.println(findIsPowerOfTwo(i));
    }

    /**
     * n & (n-1) == 0 works because:
     *
     * CopyExample for n = 8 (a power of 2):
     * 8     = 1000
     * 8-1   = 0111
     * 8 & 7 = 0000  (equals 0 ✓)
     *
     * Example for n = 12 (not a power of 2):
     * 12    = 1100
     * 12-1  = 1011
     * 12&11 = 1000  (not 0 ✗)
     *
     * n > 0 is needed to handle the edge case of n = 0:
     *
     *
     * Without this check, 0 would be incorrectly identified as a power of 2 since 0 & -1 = 0
     *
     * So the complete condition n > 0 && n & (n-1) == 0 perfectly identifies powers of 2!
     * @param n
     * @return
     */
    public static boolean findIsPowerOfTwo(int n){
        if(n > 0 && (n&(n-1)) == 0){
            return true;
        }
        return false;
    }
}
