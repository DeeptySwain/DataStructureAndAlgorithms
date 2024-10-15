package Array;

import java.util.Arrays;
/**
 * Given an array, write a function to get first, second best scores from the array and return it in new array.
 *
 * Array may contain duplicates.
 *
 * Example
 *
 * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
 * firstSecond(myArray) // {90, 87}
 */


public class BestScoreUdemy {
    public static void main(String[] args){
        int[] nums = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(nums)));
        System.out.println(Arrays.toString(findTopThreeScores(nums)));
    }

    /**
     * find the first and 2nd top scores
     * @param nums
     * @return
     */
    private static int[] findTopTwoScores(int[] nums){
        int fLarge = 0;
        int sLarge = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i] > fLarge){
                sLarge=fLarge;
                fLarge=nums[i];
            }else if(nums[i]>sLarge && nums[i]!=fLarge){
                sLarge=nums[i];
            }
            i++;
        }
        return new int[]{fLarge,sLarge};
    }

    /**
     * Find the 1st,2nd, 3rd top scores
     */
    private static int[] findTopThreeScores(int[] nums){
        int fLarge = 0;
        int sLarge = 0;
        int tLarge = 0;
        int i=0;
        while(i<nums.length){
            if(nums[i] > fLarge){
                tLarge=sLarge;
                sLarge=fLarge;
                fLarge=nums[i];
            }else if(nums[i]>sLarge && nums[i]!=fLarge){
                tLarge=sLarge;
                sLarge=nums[i];
            }
            else if(nums[i]>tLarge && nums[i]!=fLarge && nums[i] !=sLarge){
                nums[i]=tLarge;
            }
            i++;
        }
        return new int[]{fLarge,sLarge,tLarge};
    }
}
