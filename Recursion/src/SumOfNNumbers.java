/**
 * Sum of N integers:
 * num = 10
 * sum of 10 = 1+2+3+4+5+6+7+8+9+10
 */

public class SumOfNNumbers {
    public static int findSum(int num){
        // BASE CONDITION:
        if( num == 0){
            return num;
        }
        return findSum(num-1)+num;
    }

    public static void main(String[] args){
        int res = findSum(10);
        System.out.println(res);
    }
}
