public class BinarySearchUsingLoop {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {-1, 0, 3, 5, 9, 12};
        int[] nums = {-1,0,3,5,9,12};
        int target = -1;
        BinarySearchUsingLoop bsd = new BinarySearchUsingLoop();
       System.out.println(bsd.search(nums, target));
    }
}
