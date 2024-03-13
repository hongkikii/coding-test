package main.java.codingtest.inflearn2.section2;

import java.util.HashSet;
import java.util.Set;

class Q01 {
    public int solution(String s){
        int answer = -1;
        Set<Character> set = new HashSet<>();
        Set<Character> duplicateSet = new HashSet<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                duplicateSet.add(c);
                int tmp = answer;
                answer = -1;
                for(int j=tmp-1; j<=i; j++) {
                    if(!duplicateSet.contains(s.charAt(j))) {
                        answer = j+1;
                        break;
                    }
                }
            }
            else {
                set.add(c);
                if(answer == -1) answer = i+1;
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

