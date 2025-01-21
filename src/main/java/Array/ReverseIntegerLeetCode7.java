package Array;

public class ReverseIntegerLeetCode7 {
    public static void main(String[] args){
        ReverseIntegerLeetCode7 ri = new ReverseIntegerLeetCode7();
        System.out.println(ri.reverse1(123));
    }

    /**
     * sIMPLE
     */
    public int reverse1(int x){
        long reverseNum = 0;
        while(x!=0){
            int reminder = x %10;
            reverseNum = reverseNum * 10 + reminder;
            x /=10;
        }
        return (reverseNum < Integer.MIN_VALUE || reverseNum > Integer.MAX_VALUE) ? 0 : (int)reverseNum;
    }


    /**
     * this will fail:
     *  if(reverse > Integer.MAX_VALUE){
     *                 return 0;
     *             }
     *             7. Reverse Integer" fails because it doesn't correctly handle cases where the reverse value overflows or underflows the range of a 32-bit signed integer. The Integer.MAX_VALUE check is applied incorrectly—it compares the reverse variable (which is an integer) directly against Integer.MAX_VALUE. However, the overflow occurs during the computation of reverse = reverse * 10 + reminder,
     *             so by the time you check it, the overflow has already occurred, and you cannot reliably detect it.
     *
     *             Why It Fails
     * Overflow or Underflow During Multiplication or Addition:
     *
     *
     * For a 32-bit signed integer:
     * Maximum value: 2,147,483,647
     * Minimum value: -2,147,483,648
     * If multiplying reverse by 10 or adding reminder causes the value to exceed this range, the behavior is undefined in Java due to integer overflow.
     * Logical Flaw in if (reverse > Integer.MAX_VALUE):
     *
     * You are comparing an int value (reverse) against Integer.MAX_VALUE. If reverse has already overflowed, it wraps around, and this comparison no longer works as expected.
     *
     * Explanation of Fixes*
     * Overflow Check Before Updating reverse:
     *
     * reverse > Integer.MAX_VALUE / 10: Multiplying reverse by 10 would exceed the max limit.
     * (reverse == Integer.MAX_VALUE / 10 && reminder > 7): Adding reminder would exceed the max limit (last digit of Integer.MAX_VALUE is 7).
     * Underflow Check:
     *
     * reverse < Integer.MIN_VALUE / 10: Multiplying reverse by 10 would go below the min limit.
     * (reverse == Integer.MIN_VALUE / 10 && reminder < -8): Adding reminder would go below the min limit (last digit of Integer.MIN_VALUE is -8).
     */


    public int reverse(int x){
        int reverseNum = 0;
        while(x != 0){
            int reminder = x % 10;
            /**
             * * Maximum value: 2,147,483,647
             *
             * Overflow Check Before Updating reverse:
             *  check the reverse num doesn't exceed the Integer.MAXVALUE when it is multiplied by 10 or adding by reminder i.e Check for overflow before multiplying by 10 or adding the digit
             *              cond 1: Multiplying reverse by 10 would exceed the max limit. [for multiplication of 10)
             *              cond 2: Adding reminder would exceed the max limit (last digit of Integer.MAX_VALUE is 7) [for addition of reminder]
             */
            if(reverseNum > Integer.MAX_VALUE/10 ||  (reverseNum == Integer.MAX_VALUE/10 && reminder > 7)){
                return 0;
            }
            /**
             *   * Minimum value: -2,147,483,648
             * Similar to overflow, condition for downfall:
             * cond 1: Multiplying reverse by 10 would lower the min limit. [for multiplication of 10)
             *              *              cond 2: Adding reminder shouldn't lower the min limit (last digit of Integer.MIN_VALUE is -8) [for addition of reminder]
             */
            if(reverseNum < Integer.MIN_VALUE/10 ||  (reverseNum == Integer.MIN_VALUE/10 && reminder < -8)){
                return 0;
            }
            reverseNum = reverseNum * 10 + reminder;

            x /= 10;
        }
        return reverseNum;
    }
}
