package String;

public class CircularSentenceLeetCode2490 {
    public static void main(String[] args){
        String sentence = "a a ba";
        CircularSentenceLeetCode2490 cs = new CircularSentenceLeetCode2490();
        System.out.println(cs.isCircularSentence(sentence));
    }

    /**
     *
     * @param sentence
     * @return
     */
    public boolean isCircularSentence(String sentence) {
        boolean result = false;

        if(sentence.split(" ").length == 1){
            if(sentence.charAt(0) == sentence.charAt(sentence.length()-1)){
                result = true;
            }
        }

        if(sentence.charAt(0) == sentence.charAt(sentence.length()-1)){
            for(int i=0; i < sentence.length(); i++){
                if(sentence.charAt(i) == ' '){
                    if(sentence.charAt(i-1) != sentence.charAt(i+1)){
                        result= true;
                    }else {
                        result= false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean isCircularSentenceOptimized(String sentence){
        //case1: The last character of the last word is equal to the first character of the first word.
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)){
            return false;
        }
        // check the index of space and then check the previous and after char is same:
        int i = sentence.indexOf(" ");
      //  only single word is present hence no space. and since  case1  already checked the first char of first word and last word of last charc
        if(i == -1){
            return true;
        }
        while(i >= 1){
            if(sentence.charAt(i-1) != sentence.charAt(i+1)){
                return false;
            }
            // find the next space index
            i = sentence.indexOf(" ", i+1);
        }
        return true;
    }
}
