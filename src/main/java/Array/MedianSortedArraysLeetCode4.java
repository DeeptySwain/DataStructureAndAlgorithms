package Array;

import java.util.Arrays;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianSortedArraysLeetCode4 {
    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int[] resultArr = new int[m + n];
        int k = resultArr.length;
        int l = 0;
        int i = 0;
        int j = 0;
// merge the two array:
        // step 1: first search the small element among two array and assign to the result array 1 by 1 untill the small length arrays all value are placed [(while(i<m && j<n))]
        while (i < m && j < n) {
            if (nums2[j] < nums1[i]) {
                resultArr[l] = nums2[j];
                j++;
                l++;
            } else {
                resultArr[l] = nums1[i];
                i++;
                l++;
            }
        }
        System.out.println(Arrays.toString(resultArr));
        // if there are remaining elements of the first array, move them
        while (i < m) {
            resultArr[l] = nums1[i];
            l++;
            i++;
        }

        // Else if there are remaining elements of the second array, move them
        while (j < n) {
            resultArr[l] = nums2[j];
            l++;
            j++;
        }

        System.out.println(i);
        System.out.println(j);
        System.out.println(Arrays.toString(resultArr));

    // find median for even: nums1[n/2]+nums1[n-1/2] odd: nums1[n/2]
        median = k%2 ==0 ? ((resultArr[k/2])+ (resultArr[(k-1)/2]))/2.0 : resultArr[k/2];
    return median;
    }


/**
 * with explanation:
 */

public double findMedianSortedArraysLeetCode(int[] nums1, int[] nums2) {
    int i=0; int j=0; int l=0;
    int m = nums1.length;
    int n = nums2.length;
    int[] resultArr = new int[m+n];
    int k=resultArr.length;
    double median =0.0;

    // merge the two array:
    // step 1: first search the small element among two array and assign to the result array 1 by 1 untill the small length arrays all value are placed [(while(i<m && j<n))]
    while(i<m && j<n){
        if(nums1[i] < nums2[j]){
            resultArr[l++] = nums1[i++];
        }else resultArr[l++] = nums2[j++];
    }
    // step2: Check if any remaining values present in nums1 array add them to result Array:
    while(i<m){
        resultArr[l++] = nums1[i++]; // here we are checking the remaining i values
    }
    // step2: or Check if any remaining values present in nums2 array add them to result Array:
    while(j<n){
        resultArr[l++] = nums2[j++]; // here we are checking the remaining j values
    }
    // find median for even: nums1[n/2]+nums1[n-1/2] odd: nums1[n/2]
    median = k%2 ==0 ? ((resultArr[k/2])+ (double)(resultArr[(k/2)-1]))/2 : resultArr[k/2];
    return median;
}
}
