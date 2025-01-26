package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BasicArrayFunctionality {
    public static void main(String[] args){
        int[] arr = {20,30,5,38,29};
        System.out.println(BasicArrayFunctionality.findSum(arr));
        System.out.println(Arrays.toString(BasicArrayFunctionality.printEvenOddCount(arr)));
        System.out.println(takeValuesFromConsole());
    }

    /**
     * find the sum of all the element.
     */
    private static int findSum(int[] arr){
        int sum=0;
        for(int i : arr){
            sum +=i;
        }
        return sum;
    }

    /**
     * print the even and odd numbers of all the element.
     */
    private static int[] printEvenOddCount(int[] arr){
        int evenCount=0;
        int oddCount=0;
        for(int i : arr){
            if(i%2 ==0){
                evenCount++;
            }else oddCount++;
        }
        int[] result = {evenCount,oddCount};
        return result;
    }
    /**
     * Scanner Class Use:
     */
    private static ArrayList<Integer> takeValuesFromConsole(){
        Scanner scan = new Scanner(System.in);

      /*  if(scan.hasNext()){
            System.out.println("Provide Int numbers: " +scan.nextInt());
            System.out.println("Provide Double numbers: " +scan.nextDouble());
            System.out.println("Provide String numbers: " +scan.next());
        }
        else scan.next();*/
      //  To allow for the user to input a list of integers, comma separated, you can use the following.
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Enter the values: ");
        String[] values = scan.nextLine().split(",");
        for (String value : values)
            al.add(Integer.parseInt(value));
        return al;
    }
}
