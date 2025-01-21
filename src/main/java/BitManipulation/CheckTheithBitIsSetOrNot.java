package BitManipulation;

/**
 * https://www.youtube.com/watch?v=nttpF8kwgd4
 * Set Bit
 * A set bit refers to a bit in the binary representation of a number that has a value of 1.
 */
public class CheckTheithBitIsSetOrNot {

    public static void main(String[] args){
        int a=13;
        int i=2;
        CheckTheithBitIsSetOrNot checkBit = new CheckTheithBitIsSetOrNot();
        System.out.println(checkBit.checkIthElementIsSetBitOrNotUsingLeftShiftOperator(a, i));
        System.out.println(checkBit.checkIthElementIsSetBitOrNotUsingRightShiftOperator(a, i));
    }

    /**
     * First we will do 1 << i we will
     * @param i
     */
    public boolean checkIthElementIsSetBitOrNotUsingLeftShiftOperator(int a, int i){
       if((a & (1 << i)) != 0){
           return true;
       }
        return false;
    }

    public boolean checkIthElementIsSetBitOrNotUsingRightShiftOperator(int a, int i){
        if(((a >> i) & 1) != 0){
            return true;
        }
        return false;
    }
}
