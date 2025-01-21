package String;

public class FindTheDifferenceLeetCode389 {
    public static void main(String[] args){
        FindTheDifferenceLeetCode389 add = new FindTheDifferenceLeetCode389();
        System.out.println(add.findTheDifference("abcd","abcde"));
    }


    /**
     * XORing a character with itself cancels it out (e.g., a ^ a = 0).
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        char result = 0;
        for(char c : s.toCharArray()){
            result ^=c;
        }
        for(char c : t.toCharArray()){
            result ^=c;
        }

        return result;
    }
}

/**
 * counting each charc in both the string
 */
