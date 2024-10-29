package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelfLeetCode238 {
    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        ProductOfArrayExceptSelfLeetCode238 ms = new ProductOfArrayExceptSelfLeetCode238();
        System.out.println(Arrays.toString(ms.findProduct(nums)));
    }

      private static int[] findProduct(int[] nums){
          int n = nums.length;
          int[] leftProductArray = new int[nums.length];
          int[] rightProductArray = new int[nums.length];
          leftProductArray[0]=1;
          for(int i=1; i<n; i++){
              leftProductArray[i] = leftProductArray[i-1] * nums[i-1];
          }

          rightProductArray[n-1]=1;
          for(int i=n-2; i>=0; i--){
              rightProductArray[i] = rightProductArray[i+1] * nums[i+1];
          }

          for(int i=0; i<n; i++){
              nums[i] = leftProductArray[i] * rightProductArray[i];
          }
          return nums;
      }
}
