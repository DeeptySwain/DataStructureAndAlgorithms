import java.util.Scanner;

/**
 * Binary Search is a algorithm where we work on a sorted array
 * and maximum time we have to find out the mid. and increase or decrease the left point and right point accordingly.
 * Take A problem if target element is available then return the index.
 * Base condition to check: if left most index is greater than rightmost index than return -1.(stoping criteria, don't recurse)
 * Recursive Case:
 * Find the mid: left (which is 0) + right (which is array's length-1) /2;
 * check if the target == mid  ----> -1
 *  target > mid ----->  which means the element is stored is at the right. Hence, increase the left boundary for search as  left = mid + 1
 *  target < mid ----> element is in the left hence reduce the right boundary as right = mid-1;
 *
 */
public class BinarySearchUsingRecursion {
    public int search(int[] nums, int left, int right, int target){
        // Base condition: If left > right
        if(left > right){
            return -1;
        }
        //Recursive Condition:
        int mid = (left + right)/2;

        if(target == nums[mid]){
            return mid;
        }
        if(target > nums[mid]){
            return search(nums, mid+1, right, target);
        }
            return search(nums, left, mid-1, target);
    }

    public static void main(String[] args) {
        // Taking the input from the user.
       Scanner scan = new Scanner(System.in);
        System.out.println("Provide the number array size:");
        int sizeOfArray = scan.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.println("Provide the numbers for storing inside Array:");
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scan.nextInt();
        }
       // int[] arr = {12,23,9,45,100};
        BinarySearchUsingRecursion bsr = new BinarySearchUsingRecursion();
        System.out.println(bsr.search(arr, 0, arr.length-1,9));
    }
}
