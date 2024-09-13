package main.java.codingtest.inflearn2.section6;

import java.util.*;

public class Q05 {
    LinkedList<String> tmp;
    ArrayList<String> IPs;

    public void DFS(int start, String input) {
        if (tmp.size() == 4 && start == input.length()) {
            String IP = "";
            for (String element : tmp) {
                IP += element + ".";
            }
            IPs.add(IP.substring(0, IP.length() - 1));
        }
        else {
            for (int i = start; i < input.length(); i++) {
                if(input.charAt(start) == '0' && i > start) return;
                String num = input.substring(start, i + 1);
                if(Integer.parseInt(num) > 255) return;
                tmp.add(num);
                DFS(i + 1, input);
                tmp.pollLast();
            }
        }
    }

    public String[] solution(String s){
        tmp = new LinkedList<>();
        IPs = new ArrayList<>();
        DFS(0, s);
        String[] answer = new String[IPs.size()];
        for(int i = 0; i < IPs.size(); i++){
            answer[i] = IPs.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Q05 T = new Q05();
        System.out.println(Arrays.toString(T.solution("2025505")));
        System.out.println(Arrays.toString(T.solution("0000")));
        System.out.println(Arrays.toString(T.solution("255003")));
        System.out.println(Arrays.toString(T.solution("155032012")));
        System.out.println(Arrays.toString(T.solution("02325123")));
        System.out.println(Arrays.toString(T.solution("121431211")));
    }
}
