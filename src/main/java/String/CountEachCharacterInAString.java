package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountEachCharacterInAString {
    public static void main(String[] args){
        String s = "aaaaaaaaaaaaaabb";
        System.out.println(countChar(s));
    }

    private static String countChar(String s){
        char[] strArray = s.toCharArray();
        String comp = "";
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        // calculate the value if already exist in the map:
        for (char c: strArray){
                charMap.put(c, charMap.getOrDefault(c,0)+1);
                }
        for (Character name: charMap.keySet()) {
            String key = name.toString();
            String value = charMap.get(name).toString();
            comp += value + key;
        }
        System.out.println(comp);
        return comp;
    }

    /**
     *
     * @param word
     * @return
     */
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        Map<Character, Integer> charMap = new LinkedHashMap<Character,Integer>();
        // calculate count of each charc in the String:
        for(char c : word.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }
        // add value and key to comp String, to create a new String
        for(Character c : charMap.keySet()){
            comp.append(charMap.get(c).toString()).append(c.toString());
        }
        return comp.toString();
    }

    /**
     *
     * @param word
     * @return
     */

    public String compressedStringUsingEntry(String word) {
        StringBuilder comp = new StringBuilder();
        Map<Character, Integer> charMap = new LinkedHashMap<Character,Integer>();
        // calculate count of each charc in the String:
        for(char c : word.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }
        // add value and key to comp String, to create a new String
        for(Map.Entry<Character,Integer> entry : charMap.entrySet()){
            comp.append(entry.getValue()).append(entry.getKey());
        }
        return comp.toString();
    }
}
