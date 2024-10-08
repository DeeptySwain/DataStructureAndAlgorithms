/**
 * MERGE SORT: Sort the problem into two half and then work on each half and solve it and then merge the two solved solution.
 *
 * Sort an array
 */
public class DemoMergeSort {
    // creating a mergesort method to divide the array into two part:
    public void mergeSort(int[] data, int start, int end) {
        // we will check till starting is less than end, which means post that there is no element present.
        while (start < end) {
            // findout the mid to divide it:
            int mid = (start + end) / 2;
            // recursive the left half and divide it till start < mid (mid is end in this case) in left half array
            mergeSort(data, start, mid);
            // recursive the right half and divide it till mid+1 < right (mid+1 is start in this case) in right half array
            mergeSort(data, mid + 1, end);
            // once both the left half and right half all element divided we will merge those
            merge(data, start, mid, end);
        }
    }

    // Let's create a merge method for merging the sub arrays to original array in sorted format.
    public void merge(int[] data, int start, int mid, int end) {
        // creating a temporary/auxilary array for storing the value in sorted format:
        int[] temp = new int[end - start + 1];  // the size of the array
        int i = start, j = mid + 1, k = start;
        // checking the first logic where
        while (i <= mid && j <= end) {
            // compare left hand array with right hand array element
            // if left hand array element less than right hand array element store left one as it is smaller one.
            if (data[i] < data[j]) {
                temp[k++] = data[i++]; // store temp [k] = data[i] then do k++ and i++
            } else {
                temp[k++] = data[j++];
            }
        }

        // incase above while condition not satisfied, which mean one of the side's elements are done
        // check if left hand array is still pending then store all the pending element into temp
        while (i <= mid) {
            temp[k++] = data[i++];
        }
        // check if the right hand array is pending
        while (j <= end) {
            temp[k++] = data[j++];
        }

        // Now that we are done with storing all element in temp array in sorted format, let's copy these element into the original array
        for (k = start; k <= end; k++) {
            data[k] = temp[k - start];
        }
    }
    // driver code:
    public static void main(String[] args) {
        int[] data = {12,34,56,-1,2,19,0,100,2};
        DemoMergeSort dms = new DemoMergeSort();
        dms.mergeSort(data,0, data.length-1);
    }
}
