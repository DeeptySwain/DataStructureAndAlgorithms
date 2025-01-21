package String;

import List.FizzBuzzLeetCode412;

public class CheckIfStringIsAPrefixOfArrayLeetCode1961 {
    public static void main(String[] args){
       String s = "iloveleetcode";
       String[] words = {"i","love","leetcode","apples"};
        CheckIfStringIsAPrefixOfArrayLeetCode1961 scl = new CheckIfStringIsAPrefixOfArrayLeetCode1961();
        System.out.println(scl.isPrefixString(s, words));
    }


    public boolean isPrefixString(String s, String[] words) {
        StringBuilder temp = new StringBuilder();
        for(String word : words){
            if(!s.contains(word)){
                return false;
            }else{
                temp.append(word);
                if(temp.toString().equals(s)) {
                    System.out.println("Length of s: " + s.length());
                    System.out.println("Length of temp: " + temp.length());
                    return true;
                }
            }
        }
        return true;
    }
}
