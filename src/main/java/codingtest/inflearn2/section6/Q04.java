package main.java.codingtest.inflearn2.section6;

import java.util.*;
class Q04 {
    int oddCount;
    char oddChar;
    Map<Character, Integer> map;
    int[] use;
    String[] answer;
    List<String> tmpAnswer;

    public String[] solution(String s){
        map = new HashMap<>();
        oddCount = 0;
        oddChar = ' ';
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) % 2 != 0) oddCount++;
            else oddCount--;
        }
        if(oddCount>1) return answer;
        for(char c : map.keySet()) {
            int count = map.get(c);
            if(count % 2 ==0) {
                map.put(c, count/2);
            }
            else {
                map.put(c, (count-1)/2);
            }
        }
        use = new int[26];
        tmpAnswer = new ArrayList<>();
        for(char c : map.keySet()) {
            use[c - 'a'] += 1;
            DFS(c, String.valueOf(c));
            use[c - 'a'] -= 1;
        }
        String[] answer = new String[tmpAnswer.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = tmpAnswer.get(i);
        }
        return answer;
    }

    public void DFS(char c, String palindrome) {
        if (use[c - 'a'] >= map.get(c)) {
            if (oddChar != ' ') {
                tmpAnswer.add(palindrome + oddChar); // reverse한 것도 넣어야 하는데
            }
            tmpAnswer.add(palindrome);
            return;
        }
        for(char v : map.keySet()) {
            if(use[v - 'a'] < map.get(v)) {
                use[v - 'a'] += 1;
                DFS(v, palindrome + v);
                use[v - 'a'] -= 1;
            }
        }
    }

    // DFS 마지막에 리턴할 때 (있으면) 홀수 char 하나 붙이기

    public static void main(String[] args){
        Q04 T = new Q04();
        System.out.println(Arrays.toString(T.solution("aaaabb")));
        System.out.println(Arrays.toString(T.solution("abbcc")));
        System.out.println(Arrays.toString(T.solution("abbccee")));
        System.out.println(Arrays.toString(T.solution("abbcceee")));
        System.out.println(Arrays.toString(T.solution("ffeffaae")));
    }
}
