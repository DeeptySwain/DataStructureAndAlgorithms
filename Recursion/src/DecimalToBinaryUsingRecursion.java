import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Decimal to binary:
 * 123/2 = 61  : reminder = 1
 * 61/2 = 30  : reminder = 1
 * 30/2 = 15 : reminder = 0
 * 15/2 = 7 : reminder = 1
 * 7/2 = 3 : reminder = 1
 * 3/2 = 1 : reminder = 1
 * 1/2 = 0 : reminder=1
 *
 * now the binary no. of 123 = 1101111
 * So, here we can achieve it using recursive function as below:
 * Approach 1:
 * Two input: first int decimal_no. 2nd string result_binary
 * Base condition: if(decimal_no == 0) { return binary_no};
 * Recursive case could be:
 * first result_binary += decimal_no%2 ; (so all the reminders will be concate to sting result_binary
 * findBinary(decimal_no/2) put in stack till decimal_no=0 (when decimal_no= 0,
 * we return the reminders collected so far as binary_no. (result_binary += decimal_no%2)
 *
 */

public class DecimalToBinaryUsingRecursion {
    public static String findBinary(int decimal_no, String result_binary){
        // Base/ stopping condition:
        if(decimal_no == 0){
            return result_binary;
        }
        //Recursive case:
        result_binary += decimal_no%2;
        return findBinary(decimal_no/2, result_binary);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide the decimal number: ");
        // int decimal_no = scan.nextInt();
        System.out.println(findBinary(scan.nextInt(), ""));
    }
}
