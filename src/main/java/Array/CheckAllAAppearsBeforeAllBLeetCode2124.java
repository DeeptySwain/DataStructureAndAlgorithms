package Array;

public class CheckAllAAppearsBeforeAllBLeetCode2124 {
    public static void main (String[] args) {
        CheckAllAAppearsBeforeAllBLeetCode2124 cab = new CheckAllAAppearsBeforeAllBLeetCode2124();
        String s = "aaabbabba";
        System.out.println(cab.checkString(s));
    }

    /**
     * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
     * @param s
     * @return
     */
        public boolean checkString(String s) {
            char[] ch = s.toCharArray();
            int i=0;
            while(i< ch.length-1){
                if(ch[i]=='b'){
                    i=i+1;
                    while(i<=ch.length-1) {
                        if (ch[i] == 'a') {
                            return false;
                        }
                        i++;
                    }
                }
                i++;
            }

            return true;
        }





}
