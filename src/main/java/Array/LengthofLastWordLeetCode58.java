package Array;

import java.util.Arrays;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 *
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 *
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */


public class LengthofLastWordLeetCode58 {
    public static void main(String[] args){
        String s = "   fly me   to   the moon  "; // o/p:5
     //   String s = "luffy is still joyboy";
      //  System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord1(s));
    }

    private static int lengthOfLastWord(String s) {
        // split the string with spaces
        String[] holder = s.split("\\s+");
        // converted last string to char array
      //  String lastElement = holder[holder.length-1];
        char[] ch = holder[holder.length-1].toCharArray();
        //counted the length of the ch array which hold last element.
        return ch.length;
    }
    private static int lengthOfLastWord1(String s) {
        int count =0;
        int i=s.length()-1;
        while( i >=0 ) {
            if (s.charAt(i) != ' ') {
                count++;
            } else{
                if(count > 0) {   // which means already some word with out space detected
                    return count;
                }
            }
            i--;
        }
        return count;
    }


}
