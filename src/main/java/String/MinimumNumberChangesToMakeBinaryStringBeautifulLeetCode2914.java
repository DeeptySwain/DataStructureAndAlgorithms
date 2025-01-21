package String;

public class MinimumNumberChangesToMakeBinaryStringBeautifulLeetCode2914 {
    public static void main(String[] args){
        String s = "01010001";
        MinimumNumberChangesToMakeBinaryStringBeautifulLeetCode2914 scl = new MinimumNumberChangesToMakeBinaryStringBeautifulLeetCode2914();
        System.out.println(scl.minChanges(s));
    }

    public int minChanges(String s) {
        int count=0;
        int i=0;
        while(i < s.length()){
            if(s.charAt(i) != s.charAt(i+1)) {
                count++;
            }
            i+=2;
        }
        return count;
    }
}
