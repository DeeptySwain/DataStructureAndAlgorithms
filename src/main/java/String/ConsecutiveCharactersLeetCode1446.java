package String;

public class ConsecutiveCharactersLeetCode1446 {

    public int maxPower(String s) {
        int maxPower = 0;
        for(int i=1; i<s.length(); i++){
            int count =1;
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else {
                count = 1;
            }

            if(maxPower < count){
                maxPower = count;
            }
        }

        return maxPower;

    }
}
