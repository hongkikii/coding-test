package main.java.codingtest.leetcode.hashMap;

public class Q383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineToCharArray = magazine.toCharArray();
        char[] ransomNoteToCharArray = ransomNote.toCharArray();
        int[] alphabet = new int[26];
        for(char element : magazineToCharArray) {
            alphabet[element - 97]++;
        }
        for(char element : ransomNoteToCharArray) {
            int target = --alphabet[element - 97];
            if(target < 0) return false;
        }
        return true;
    }
}
