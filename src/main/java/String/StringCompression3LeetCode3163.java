package String;

/**
 * Given a string word, compress it using the following algorithm:
 *
 * Begin with an empty string comp. While word is not empty, use the following operation:
 * Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
 * Append the length of the prefix followed by c to comp.
 * Return the string comp.
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcde"
 *
 * Output: "1a1b1c1d1e"
 *
 * Explanation:
 *
 * Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
 *
 * For each prefix, append "1" followed by the character to comp.
 *
 * Example 2:
 *
 * Input: word = "aaaaaaaaaaaaaabb"
 *
 * Output: "9a5a2b"
 *
 * Explanation:
 *
 * Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.
 *
 * For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
 * For prefix "aaaaa", append "5" followed by "a" to comp.
 * For prefix "bb", append "2" followed by "b" to comp.
 *
 *
 * Constraints:
 *
 * 1 <= word.length <= 2 * 105
 * word consists only of lowercase English letters.
 */


public class StringCompression3LeetCode3163 {

    public static void main(String[] args){
        String s = "aaaaaaaaaaaaaabb";
        StringCompression3LeetCode3163 scl = new StringCompression3LeetCode3163();
        System.out.println(scl.compressedString(s));
    }

    /**
     * i) check the character till 9 element so chunk of 9 char. // Count consecutive characters, but limit to 9
     * Process characters sequentially
     * Break into chunks of max 9
     * Maintain order of appearance
     * @param word
     * @return
     */

    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i=0;
        //Process characters sequentially for complete string
        while( i < word.length()){
            // to count the number of charc
            int count = 0;
            // to hold current charc
            char currentChar = word.charAt(i);
            // internal loop to check for each char until 9 count, more than that exist the loop or else word.charAt(i) is not the currentChar(same charcter for which we are counting the value)
            while(i < word.length() && word.charAt(i) == currentChar && count < 9){
                count++;
                i++;
            }
            comp.append(count).append(currentChar);
        }
        return comp.toString();
    }


}
