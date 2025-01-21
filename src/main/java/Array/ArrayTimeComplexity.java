package Array;

import java.util.Arrays;

public class ArrayTimeComplexity {
    public static void main(String[] args){
        int[] sentence = {1,3,4,5};
        ArrayTimeComplexity cs = new ArrayTimeComplexity();
        System.out.println(Arrays.toString(cs.printSum(sentence)));
    }

    /**
     * TC: O(N^2)
     * @param arr
     */
    private static void printPairs(int[] arr){
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr.length; j++){
                System.out.println(arr[i] + "" +arr[j]);
            }
        }
    }

    /**
     * TC: O(N * N/2) === O(N^2)
     * @param arr
     */
    private static void printUnOrderedPairs(int[] arr){
        for(int i=0; i < arr.length; i++){ //-----> O(N)
            for(int j=i+1; j < arr.length; j++){ // ----> 1st step when i=0 : n-1, 2nd step when i =1 n-2, n-3 ...2, 1 ===== n(n-1)/2= n2/2 - n/2 ==== removing constant: n2/2
                System.out.println(arr[i] + "" +arr[j]);
            }
        }
    }

    /**
     * TC: for each element of A we are looping through each element of B. O(A*B) = O(AB)
     * @param arrA, arrB
     */
    private static void printMul(int[] arrA, int[] arrB){
        for(int i=0; i < arrA.length; i++){ //-----> O(A)
            for(int j=0; j < arrB.length; j++){ // ----> O(B)
                System.out.println(arrA[i] + "" +arrB[j]);
            }
        }
    }

    /**
     * TC: for each element of A we are looping through each element of B. O(A*B) = O(AB)
     * @param arrA, arrB
     */
    private static void printSum(int[] arrA, int[] arrB){
        for(int i=0; i < arrA.length; i++){ //-----> O(A)
            for(int j=i; j < arrB.length; j++){ // ----> O(B)
                System.out.println(arrA[i] + "" +arrB[j]);
            }
        }
    }

    /**
     * Reverse an array
     * TC: O(N/2) ---> O(N)
     * @param arrA, arrB
     */
    private static int[] printSum(int[] arrA){
      //  int j = arrA.length-1;
        for(int i=0; i < arrA.length/2; i++) {
            int k = arrA.length-i-1;
            int temp = arrA[i];
            arrA[i] = arrA[k];
            arrA[k] = temp;
       //    j--;
        }
        return arrA;
    }

}
