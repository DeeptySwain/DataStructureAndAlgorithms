package BitManipulation;

import java.util.Arrays;

public class ConvertBinaryNumToDecimalNum {
    public static void main(String[] args){
        ConvertBinaryNumToDecimalNum convert = new ConvertBinaryNumToDecimalNum();
        System.out.println(convert.convertToBinary(13));
    }

    /**
     * log base 2 n(since
     */

    public String convertToBinary(int n){
        String result = "";
        while(n != 1) {
            if(n%2 ==1){
                result += "1";
            }else {
                result += "0";
            }
            n = n / 2;
        }
        result += "1"; // for adding last n, when n=1, we exit above while loop.hence that final 1 adding\
        char[] ch = result.toCharArray();

        // reverse the string
        int i=0; int j = ch.length-1;
           while(i<ch.length/2) {
              char temp = ch[i];
              ch[i] = ch[j];
              ch[j] = temp;
              i++;
              j--;
           }
        result = String.valueOf(ch);
        return result;
    }
}
