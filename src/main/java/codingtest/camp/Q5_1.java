package main.java.codingtest.camp;

import java.util.*;

public class Q5_1 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') stack.add(c);
            if(c == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
