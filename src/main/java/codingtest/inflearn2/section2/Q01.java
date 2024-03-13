package main.java.codingtest.inflearn2.section2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Q01 {
    public int solution(String s){
        int answer = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                answer = Math.min(s.indexOf(entry.getKey())+1, answer);
            }
        }
        if(answer == Integer.MAX_VALUE) answer = -1;
        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}

