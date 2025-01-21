package String;

public class DeleteCharactersToMakeFancyStringLeetCode1957 {

    public static void main(String[] args){
        String s = "aaabaaaa";
        DeleteCharactersToMakeFancyStringLeetCode1957 dcm = new DeleteCharactersToMakeFancyStringLeetCode1957();
        System.out.println(dcm.makeFancyString(s));
    }

    /**
     *
     * @param s
     * @return
     */
    public String makeFancyString(String s) {
        StringBuilder comp = new StringBuilder();
        int count =1;
        comp.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }else{
                count =1;
            }
            if( count <= 2 ){
                comp.append(s.charAt(i));
            }
        }
        return comp.toString();
    }

    }
