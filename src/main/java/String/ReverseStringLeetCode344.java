package String;

import java.util.Arrays;

public class ReverseStringLeetCode344 {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        ReverseStringLeetCode344 scl = new ReverseStringLeetCode344();
       scl.reverseString(s);
    }

    /**
     * using one variable increment:
     * @param s
     */
    public void reverseString(char[] s) {
        int i=0;
        int j = s.length;
        while(i < s.length/2) {
            char tempC = s[i];
            s[i] = s[j - 1 - i];
            s[j - 1 - i] = tempC;
            i++;
        }
        System.out.println(Arrays.toString(s));
    }

    /**
     * Using two variable increment:
     * @param s
     */
    public void reverseString1(char[] s) {
        int i=0;
        int j = s.length-1;
        while(i < s.length/2){
            char tempC = s[i];
            s[i] = s[j];
            s[j] = tempC;
            i++;
            j--;
        }
    }
}
