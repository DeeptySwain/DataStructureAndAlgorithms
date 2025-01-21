package String;

public class FindWordsThatCanBeFormedByCharactersLeetCode1160 {
    public static void main(String[] args){
    String[] words = {"hello","world","leetcode"};
    String chars = "welldonehoneyr";
    FindWordsThatCanBeFormedByCharactersLeetCode1160 ran = new FindWordsThatCanBeFormedByCharactersLeetCode1160();
    System.out.println(ran.countCharacters(words,chars));
}

    /**
     *
     * @param words
     * @param chars
     * @return
     */
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        int result =0;
        // count of each char in chars string
        for(char c: chars.toCharArray()){
            arr[c - 'a']++;
        }
        // loop through second String array.
        for(String s : words){
            int[] temp = arr.clone();
            boolean currentWordCanForm = true;
            for(char c : s.toCharArray()){
                if((temp[c-'a'] <= 0)){ // if the char freq is <=0
                    currentWordCanForm = false; // we can't form the word
                    break;
                }
                temp[c-'a']--;
            }
            // if we can form the word which means all charc present in the temp array with required freq
            if(currentWordCanForm){
                result += s.length();
            }

        }
        return result;
    }
}
