import java.util.Scanner;

/**
 * Problem 1: Reverse a given String.
 * Approach 1: To solve the string reversal using the Recursion,
 * we need to first think, what would be the base condition to stop the recursion. :
 * 1. could be empty string.
 * 2. string.length() = 1;
 * - We need to find out the solution which will smaller the input to solve the problem.
 * 1. breaking the String into substring(1)[which means it will return a string  from index 1 and reduces gradually 1  by 1 index value] of the string each time
 * and concatenate it to the previous part of the string.
 * Eg: Input: Apple
 * Our Approach: recursiveFunction(String.subString(1)) + String.charAt(1) --->
 * till String length is 0 i.e string is "
 *
 * @author Deepti Swain
 */

public class StringReversalUsingRecursion {
    //Reverse Logic using recursion:
    public String reverseString(String str) {
        // Base case / Stopping Condition:
        if (str.length() == 0) {  // we also can have condition as if(str.equals(""))
            return "";
        }
        // recursive case:
        return reverseString(str.substring(1)) + str.charAt(0);

    }

   /** Without recursion:
    * public String reverseTheString(String value) {
        String[] arr = value.split("");
        String reverseWord = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseWord += arr[i];
        }
        return reverseWord;
    }**/

        // Driver Code:
    public static void main(String[] args) {
        // Taking user input:
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide the String for Reverse: ");
        String inputStr = scan.next();
        // calling reverseString method:
        StringReversalUsingRecursion dsr = new StringReversalUsingRecursion();
        System.out.println(dsr.reverseString(inputStr));
       // System.out.println(dsr.reverseTheString(inputStr));
    }
}