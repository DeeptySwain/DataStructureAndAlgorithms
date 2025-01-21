package String;

public class CountingWordsWithAGivenPrefixLeetCode2185 {
    public static void main(String[] args){
        String[] words = {"jqclbnvrbpdivpsrnlziatmqxxezmcalpnzuczafqpdpdcyuckdddylevyemabynhxrvnjakjlsglcfnylldll",
                "wzpsyqbydaaqyhjmbwfdvkgeyu",
                "kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmurkreyfyvraojedbdoxec",
                "kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmutmjfwmcammqvodenwxatsouojdgdpkxsabgve"
                ,"kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmuzsndtnkhdzrcgtkzeafa",
                "cciaewsuyzccnzziczcmuaohsnudsuptlgrdzzryajluaxghxbwf",
                "amtodzsovkmgdlw"
                ,"kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmuiqvnsluuynyblohrhhlqhakkcdabwklwsk"
                ,"cqgytlphkffnmmmahesxelsicqyjyfullvymoqceemtnpyfgejcnabjeinljtfespnwvftldcholuujys"
                ,"kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmunyockixnilatozvfkyqpbzcfnkpexbghjsklu",
                "wqhngwactepbsbmqahnjannhssnyazgbnrfygfqdpddqpotffkcgvepfmfmjvinpayfgkeimywrdfiisndvavkuuzdydvd"
                ,"gtahklmdpknhtzdxfxherktwctnwvrjudmmtyqtqxohzeziimvbus"
                ,"kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmunbzcuaekqqhwozxdnldfb"
                ,"egfkuytqptzqewpweeokurqmnqiyqdyeihucxzmgdu",
                "kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmutcgvtqoxgmwjmqdckyksnpgqbncsljzbpkpdy",
                "kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmuhzxpkltm"
                ,"kbvytpxvmuojitddvttknckrtbxhkobijobcv"};
        String pref = "kwrxrkemzzrftxzyxrnsiybqnlvmljljcpokfngosdyekhqaftmhjmixsytepmu";
        // String[] words = {"pay","attention","practice","attend"};
       // String pref = "at";
        System.out.println(prefixCount(words,pref));
    }
    private static int prefixCount(String[] words, String pref) {
        int prefLength = pref.length();
        int count = 0;
        int i =0;
        while(i < words.length){
            if(words[i].length() >= prefLength){
                String wordPref = words[i].substring(0,prefLength);
                System.out.println(wordPref + "==========" + pref);
                if(wordPref.equals(pref)){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
