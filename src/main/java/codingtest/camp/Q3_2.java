package main.java.codingtest.camp;

import java.util.*;

public class Q3_2 {
    public boolean solution(String[] words) {
        boolean answer = true;
        Set<String> wordSet = new HashSet<>();

        String firstWord = words[0];
        char end = firstWord.charAt(firstWord.length()-1);
        wordSet.add(firstWord);

        for(int i=1; i<words.length; i++) {
            String word = words[i];
            if(wordSet.contains(word)) return false;
            if(end != word.charAt(0)) return false;
            end = word.charAt(word.length()-1);
            wordSet.add(word);
        }
        return answer;
    }
}
