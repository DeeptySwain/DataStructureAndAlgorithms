package Array;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExistLeetCode1346 {
public static void main(String[] args){
    CheckIfNAndItsDoubleExistLeetCode1346 ch = new CheckIfNAndItsDoubleExistLeetCode1346();
    int[] arr = {-2,0,10,-19,4,6,-8};
    System.out.println(ch.checkIfExist(arr));
}
    public boolean checkIfExist(int[] arr) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int num:arr){
            if(hashSet.contains(2*num)||(num %2==0 && hashSet.contains(num/2))){
                return true;
            }
            hashSet.add(num);
        }
        System.out.println(hashSet);
        return false;
    }
}
