package main.java.codingtest.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineToHashMap = new HashMap<>();
        char[] magazineToCharArray = magazine.toCharArray();
        for(char element : magazineToCharArray) {
            magazineToHashMap.put(element, magazineToHashMap.getOrDefault(element, 0) + 1);
        }

        char[] ransomNoteToCharArray = ransomNote.toCharArray();
        for(char element : ransomNoteToCharArray) {
            if(magazineToHashMap.containsKey(element) && magazineToHashMap.get(element) > 0) {
                magazineToHashMap.replace(element, magazineToHashMap.get(element)-1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
