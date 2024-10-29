package Array;

public class PalindromeNumberLeetCode9 {
    public static void main(String[] args){
        int num = 121;
        PalindromeNumberLeetCode9 pnl = new PalindromeNumberLeetCode9();
        System.out.println(pnl.isPalindrome(num));
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
}
