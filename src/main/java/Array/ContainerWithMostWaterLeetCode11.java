package Array;

/**You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 Find two lines that together with the x-axis form a container, such that the container contains the most water.
 Return the maximum amount of water a container can store.
 Notice that you may not slant the container.

 Example 1:
 Input: height = [1,8,6,2,5,4,8,3,7]
 Output: 49
 Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 Example 2:
 Input: height = [1,1]
 Output: 1

 Constraints:
 n == height.length
 2 <= n <= 105
 0 <= height[i] <= 104
 *
 */

/**
 * Problem Understanding:
 *
 * You're given an array of heights, where each height represents a vertical line
 * You need to find two lines that together with the x-axis forms a container that can hold the most water
 * The width is the distance between the two lines.
 * The height is limited by the shorter of the two lines:
 * The amount of water is width × minimum height of the two lines
 */
public class ContainerWithMostWaterLeetCode11 {
    public static void main(String[] args){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }

    /**
     * maxwater/area to be findout using two pointer approach, bst
     * @param heights
     * @return
     */
    private static int maxArea(int[] heights) {
        int maxWater = 0;
        int low = Integer.MIN_VALUE;
        int high = heights.length - 1;

        while(low < high) {
            // The width is the distance between the two lines: so we will keep checking from high-low point
            int width = high - low;
            // The height is limited by the shorter of the two lines.
            int hight = Math.min(heights[low], heights[high]);
            // The maximum area for max water content:
            maxWater = Math.max(maxWater, width * hight);

        if (heights[low] < heights[high]) { // increase low only when low place value is less than high place value
            low++;
        } else{
            high--;
        }
        }

        return maxWater;
    }
}
