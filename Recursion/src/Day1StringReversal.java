import java.util.Scanner;

/**
 * Problem 1: Reverse a given String.
 * Approach 1: To solve the string reversal using the Recursion,
 we need to first think, what would be the base condition to stop the recursion. :
 1. could be empty string.
 2. string.length() = 1;
 - We need to find out the solution which will smaller the input to solve the problem.
 1. breaking the String into substring(1)[which means it will return a string  from index 1 and reduces gradually 1  by 1 index value] of the string each time
 and concatenate it to the previous part of the string.
 Eg: Input: Apple
 Our Approach: recursiveFunction(String.subString(1)) + String.charAt(1) --->
 till String length is 0 i.e string is ""
 */

public class Day1StringReversal {
    //Reverse Logic using recursion:
    public String reverseString(String str){
        if(str.length() == 0){  // we also can have condition as if(str.equals(""))
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Driver Code:
    public static void main(String[] args){
        // Taking user input:
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide the String for Reverse: ");
        String inputStr = scan.next();
        // calling reverseString method:
        Day1StringReversal dsr = new  Day1StringReversal();
        System.out.println(dsr.reverseString(inputStr));
    }
}