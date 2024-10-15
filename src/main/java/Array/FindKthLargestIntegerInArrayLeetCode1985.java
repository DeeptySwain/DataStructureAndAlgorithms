package Array;

import java.util.Arrays;
import java.math.BigInteger;

public class FindKthLargestIntegerInArrayLeetCode1985 {
public static void main(String[] args){
    String[] s = {"3","6","7","10"};
    int k =4;
    System.out.println(findKthLargestElementUsingBigIntegerOnly(s,k));
}
// this works only if numbers are less than MAX.INTEGER
private static String findKthLargetElement(String[] s, int k){
    int[] nums = new int[s.length];
    for(int i=0; i<s.length; i++){
        nums[i] = Integer.parseInt(s[i]);
    }
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    return Integer.toString(nums[nums.length-k]);
}
// For Bigger numbers:

    /**
     * BigInteger is a class in Java that allows you to work with very large integers
     * @param s
     * @param k
     * @return
     */
  private static String findKthLargestElementUsingBigIntegerOnly(String[] s, int k){
      BigInteger[] bigNums = new BigInteger[s.length];
      for(int i=0; i<s.length;i++){
          bigNums[i] = new BigInteger(s[i]); //This is a constructor call that creates a new BigInteger object by parsing the string nums[i].
          //The BigInteger constructor takes a string as input and converts it to a BigInteger object. And store the value.
          //you are assigning the BigInteger object created from s[i] to the i-th position in the bigNums array.
      }
      Arrays.sort(bigNums);
      return bigNums[bigNums.length-k].toString();
  }
}
