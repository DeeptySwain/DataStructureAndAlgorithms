package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationUdemy {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4,5,1,2};
        int[] nums2 = {1,1,3,2,5,4,2};
        System.out.println(findPermutation(nums1,nums2));
    }

    private static boolean findPermutation(int[] nums1, int[] nums2){
        // creating a map to store the frequency of numbers in array 1
        HashMap<Integer, Integer> map = new HashMap<>();
        // storing the frequency of element in first array in map
        for(int i=0; i<nums1.length; i++){
                map.put(nums1[i], map.getOrDefault(nums1[i],0) + 1); /** value is same as: if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }**/
        }
        map.forEach((key, value) -> System.out.println(key + " " + value));
        // comparing the frequency of elements of array2 in first array
        for(int num:nums2){
            //case1:
            if(!map.containsKey(num))
                return false;
            //case2:
            // creating a integer count for checking the frequency  of element in map
            // if count == 1 then it means we have checked all the occurance already or only 1 occurance of element is present and we can proceed with removing the element to make map empty at the end.
            // because if the map is empty at the end, it means all the elements present in nums2 array and occurance also same. and they are permutation of each other.
            int count = map.get(num);
            if(count == 1){
                map.remove(num);
            }else {
                map.put(num, count - 1);
            }
        }
        return map.isEmpty();
    }

    /**
     *
     * @param array1
     * @param array2
     * @return
     */
    public boolean permutation(int[] array1, int[] array2){

        if(array1.length != array2.length){
            return false;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i=0; i<array1.length; i++){
            if(array1[i] == array2[i]){
                return true;
            }
        }

        return false;
    }
}
