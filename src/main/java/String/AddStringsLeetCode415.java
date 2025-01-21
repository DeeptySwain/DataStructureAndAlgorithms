package String;

/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 *
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 * Example 2:
 *
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 * Example 3:
 *
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 *
 *
 * Constraints:
 *
 * 1 <= num1.length, num2.length <= 104
 * num1 and num2 consist of only digits.
 * num1 and num2 don't have any leading zeros except for the zero itself.
 */
public class AddStringsLeetCode415 {
    public static void main(String[] args){
        AddStringsLeetCode415 add = new AddStringsLeetCode415();
        System.out.println(add.addStrings("456","77"));
    }

    /**
     *Steps:
     * Use two pointers starting at the last digit of num1 and num2.
     * Add the digits at the current position along with the carry.
     * Compute the new carry and the resulting digit:
     * sum = digit1 + digit2 + carry
     * carry = sum / 10
     * result digit = sum % 10
     * Append the result digit to a result string.
     * Move the pointers leftward until both numbers are processed.
     * If a carry remains after all digits are processed, append it to the result.
     * Reverse the result string to get the final answer.
     */
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry =0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        int sum =0;

        while(i>=0 || j >=0 || carry !=0){
            // form the digit from each number from back side:
            int digit1 = i>=0 ? num1.charAt(i)-48 : 0;  //(since we are using charcter, so we are doing - '0' or  -48 from the charcter value, so that we will get correct int value to substract or else it will take the ASCII value)
            int digit2 = j>=0 ? num2.charAt(j)-48 : 0;
            // add the digits and carry
            sum = digit1 + digit2 + carry;
            // to find out carry we divide 10 by a number
            carry = sum / 10;
            // // Append last digit of the sum: now  sum%10 we will append to result (because if double digit value is the sum then it will carry the left digit and append only the right digit: mathematics)
            result.append(sum%10);

            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
