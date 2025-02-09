package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
 *
 * Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "bank", s2 = "kanb"
 * Output: true
 * Explanation: For example, swap the first character with the last character of s2 to make "bank".
 * Example 2:
 *
 * Input: s1 = "attack", s2 = "defend"
 * Output: false
 * Explanation: It is impossible to make them equal with one string swap.
 *
 * s1 = aab s2 = caa
 */


public class CheckIfOneStringSwapCanMakeStringsEqualLeetCode1790 {
    public static void main(String[] args) {
        CheckIfOneStringSwapCanMakeStringsEqualLeetCode1790 cios = new CheckIfOneStringSwapCanMakeStringsEqualLeetCode1790();
        String s1 = "aab";
        String s2 = "caa";
        System.out.println(cios.areAlmostEqual1(s1, s2));

    }
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0; i< s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            if(s1.contains(String.valueOf(s2.charAt(i)))){
                map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) + 1);
            }
        }
        // forEach(action) method to iterate map
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() %2 ==0 && entry.getValue() !=0){
                return true;
            }
        }
        return false;
    }

    public boolean areAlmostEqual1(String s1, String s2) {
        List<Integer> mismatch = new ArrayList<>();
        if(s1.equals(s2)){
            return true;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for(int i=0; i< ch1.length; i++){
            if(ch1[i] != ch2[i]){
                mismatch.add(i);
            }
        }
        if(mismatch.size() !=2){
            return false;
        }
        int i = mismatch.get(0);
        int j = mismatch.get(1);


        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j)== s2.charAt(i);
    }



}
