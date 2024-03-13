package main.java.codingtest.inflearn2.section2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Q01 {
    public int solution(String s){
        int answer = -1;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                answer = i + 1;
                break;
            }
        }
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

