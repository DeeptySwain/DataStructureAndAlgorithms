package Array;

public class RotateStringLeetCode796 {
    public static void main(String[] args){
        String s = "abcde";
        String goal ="abced";
        System.out.println(rotateString(s,goal));
    }

    /**
     *
     * @param s
     * @param goal
     * @return
     */
    private static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        if((s+s).contains(goal)){
            return true;
        }
        return false;
    }
}
