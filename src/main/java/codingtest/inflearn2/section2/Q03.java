package main.java.codingtest.inflearn2.section2;

import java.util.*;
import java.util.Map.Entry;

class Q03 {
    public int solution(String s){
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            while(set.contains(value)) {
                value--;
                answer++;
            }
            if(value ==0) continue;
            set.add(value);
        }
        return answer;
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }
}

