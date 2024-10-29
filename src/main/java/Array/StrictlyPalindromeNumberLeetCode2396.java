package Array;

public class StrictlyPalindromeNumberLeetCode2396{
    public static void main(String[] args){
        int num = 4;
        StrictlyPalindromeNumberLeetCode2396 pnl = new StrictlyPalindromeNumberLeetCode2396();
        System.out.println(pnl.isStrictlyPalindromic(num));
    }

    public boolean isStrictlyPalindromic(int n) {
        String baseNum = "0";
        for(int base=2; base<= n-2; base++){
             baseNum  = Integer.toString(n, base); // Convert n to a string in the specified base
            System.out.println(baseNum);
            if(!isPlaindromString(baseNum)){
                return false;
            }
        }
        return  true;
    }


    public boolean isPalindrome(int x) {
        int temp = x;
        int sum =0;
        int reminder =0;
        while(x > 0){
            reminder = x % 10;
            //    System.out.println("r = " + reminder);
            sum = (sum * 10) + reminder;
            //   System.out.println("s =" + sum);
            x = x / 10;
            //    System.out.println("x =" + x);
        }
        if(sum == temp){
            return true;
        }
        return false;
    }

    private static boolean isPlaindromString(String  x) {
        char[] ch = x.toCharArray();

        int left = 0;
        int right = ch.length -1;

        while(left<right){
            if(ch[left] != ch[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }
}
