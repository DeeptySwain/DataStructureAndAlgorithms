package String;

import java.util.HashMap;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 * Constraints:
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */

public class RansomNoteLeetCode383 {
public static void main(String[] args){
    String ransomNote = "aa";
    String magazine = "aab";
    RansomNoteLeetCode383 ran = new RansomNoteLeetCode383();
    System.out.println(ran.canConstruct(ransomNote,magazine));
}

    /**
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        // add the frequency/count of each charc of magazine
        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        // check the charc of ransomNote in 'magazine'
        for(char c : ransomNote.toCharArray()){
            if (!map.containsKey(c) || map.get(c) == 0){ // if the charcter is not present in magazine (map) or if the count is mismatched, retrun false
                return false;
            }
            map.put(c,(map.get(c)-1)); // reduce each count of charc already present
        }

        return true;
    }

    /**
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructWithoutHashMap(String ransomNote, String magazine) {
        int[] arr = new int[26]; // array to store count of 26 alphabet as all are lower case
        // add count of each charc into array
        for(char c : magazine.toCharArray()){
            // formula to finout the index of each lowercase alphabet charc is: index = charc -'a'
            // Eg: 'a' - 'a' = 97-97= 0; 'b'-'a' =98-97 = 1, 'c'-'a' = 99-97 = 2 etc
            arr[c - 'a'] ++; // increase count
        }
        // check the count of each ransomNote charcter in arr.
        // if count is negative or zero that means there is a mismatch of chac and ransomNote can't be created using magazine.
        for(char c: ransomNote.toCharArray()){
            if(arr[c-'a'] <= 0){
                return false;
            }
            arr[c-'a']--; // Use one of the letter from the magazine
        }
        return true;// All characters in ransomNote can be constructed
    }
}
