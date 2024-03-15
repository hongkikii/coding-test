package main.java.codingtest.inflearn2.section3;

import java.util.*;

class Q02 {
    public String solution(String s){
        Stack<String> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == ')' ) {
                String pop = stack.pop();
                StringBuilder save = new StringBuilder();
                while(!pop.equals("(")) {
                    save.insert(0, pop);
                    pop = stack.pop();
                }
                String peek = stack.peek();
                if(Character.isDigit(peek.charAt(0))) {
                    int count = Integer.parseInt(stack.pop());
                    String tmp = save.toString();
                    for(int i=1; i<count; i++) {
                        save.append(tmp);
                    }
                }
                stack.push(save.toString());
            }
			else {
                stack.push(String.valueOf(c));
            }
        }
        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()) {
            answer.insert(0, stack.pop());
        }
        return answer.toString();
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(T.solution("3(a2(b))ef"));
        System.out.println(T.solution("2(ab)k3(bc)"));
        System.out.println(T.solution("2(ab3((cd)))"));
        System.out.println(T.solution("2(2(ab)3(2(ac)))"));
        System.out.println(T.solution("3(ab2(sg))"));
    }
}

