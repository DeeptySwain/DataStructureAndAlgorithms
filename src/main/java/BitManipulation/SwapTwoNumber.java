package BitManipulation;

/**
 * XOR ^ operator: even number of 1's =0
 * Odd number of 1's = 1;
 * unlike OR operator, for XOR operator only if either of the value is 1/true then  o/p is 1 or true
 *
 * xor of same number will be zero:
 * for example 5 = 101, 5 = 101
 * 5 ^ 5 = 101 ^ 101 = 000
 *
 * 4 ^ 5 = 100 ^ 101 = 001 = 1
 */
public class SwapTwoNumber {
    public static void main(String[] args){
        int a = 10;
        int b = 30;
        SwapTwoNumber swap = new SwapTwoNumber();
        swap.swapTwoNumUsingBitWiseOperator(a,b);
   }
    /**
     * Swap two number using regular temp
     */

    public void swapTwoNum(int a, int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println(+a + "," + b);
    }

    /**
     *
     * @param a
     * @param b
     */
    public void swapTwoNumUsingBitWiseOperator(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(+a + "," + b);
    }

}
