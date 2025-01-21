package String;

import java.util.StringTokenizer;

public class NumberOfSegmentsInAStringLeetCode434 {

    public static void main(String[] args){
        String s = ", , , ,        a, eaefa";
        NumberOfSegmentsInAStringLeetCode434 nsn = new NumberOfSegmentsInAStringLeetCode434();
        System.out.println(nsn.countSegmentsUsingTrim(s));
    }

    /**
     *
     * @param s
     * @return
     */
    // StringTokenizer splits the string with whitespace
    public int countSegments(String s) {
        StringTokenizer words = new StringTokenizer(s);
        return words.countTokens();
}

    /**
     *
     * @param s
     * @return
     */
    public int countSegmentsUsingTrim(String s) {
        if(s.length()==0){
            return 0;
        }
        String[] words = s.trim().split("\\s+");
        return words.length;
    }
}
