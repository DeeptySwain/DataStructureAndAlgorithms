import java.util.Scanner;

/**
 * Problem 2: Check if a given String is a palindrome or not?
 * eg 1: POP --> if we reverse the string it remains same as original string i.e POP : So return true
 * eg 2: KayaK --> True (Since, reverse is true)
 * eg 3: kayaK -> false
 * eg 3: Good ---> False (Since, reverse is dooG not same as original String.
 * <p>
 * Approach: Base condition: String length is 0 or 1  then return true.
 * <p>
 * if char at 0 is same as char at length()-1 ---> then true
 * ---> call the recursive function with smaller input by substring from next char i.e 1 and remaining str.length()-1
 *
 * @author Deepti Swain
 */
public class PalindromeStringUsingRecursion {
    // Function to check the string is Palindrome or not.
    public boolean isPalindrome(String str) {
        // Base condition / stopping condition:
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // recursive case:
        if (str.charAt(0) == str.charAt(str.length() - 1)) { //k = k, a= a
            return isPalindrome(str.substring(1, str.length() - 1)); //a=a so on // string immutable, hence even after substring, str.length() is same as previous
        }
        return false;
    }

    // Driver Code:
    public static void main(String[] args) {
        // Taking user input:
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide the String To Check Palindrome Or Not: ");
        String inputStr = scan.next();
        // calling PalindromeString method:
        PalindromeStringUsingRecursion palDrmStr = new PalindromeStringUsingRecursion();
        System.out.println(palDrmStr.isPalindrome(inputStr));
    }
}
