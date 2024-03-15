package main.java.codingtest.inflearn2.section2;

import java.util.*;
class Q02 {
    public int[] solution(String s){
        int[] answer = new int[5];
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            max = Math.max(max, map.get(c));
        }
        for(int i=0; i<5; i++) {
            answer[i] = max - map.getOrDefault((char) ('a' + i), 0);
        }
        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }
}

