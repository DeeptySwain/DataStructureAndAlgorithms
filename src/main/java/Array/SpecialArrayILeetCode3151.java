package Array;

public class SpecialArrayILeetCode3151 {
    public static void main(String[] args) {
        SpecialArrayILeetCode3151 ch = new SpecialArrayILeetCode3151();
        int[] arr = {3, 4, 1, 6};
        System.out.println(ch.specialArray(arr));
    }

    /**
     * if numbers module by 2 are not same then return true else both are even or odd
     *
     * @param arr
     * @return
     */
    private boolean specialArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == arr[i + 1] % 2)
                return false;
        }
        return true;
    }

    /**
     * sum of even and odd always odd so if sum is even then return false
     *
     * @param arr
     * @return
     */
    private boolean specialArraySumAlgo(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] + arr[i - 1]) % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}