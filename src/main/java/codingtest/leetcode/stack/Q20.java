package main.java.codingtest.leetcode.stack;

import java.util.Stack;

public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for(char c : chars) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                if(c == ')') {
                    if(stack.pop() != '(') {
                        return false;
                    }
                }
                else if(c == ']') {
                    if(stack.pop() != '[') {
                        return false;
                    }
                }
                else {
                    if(stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        if(stack.size() > 0) return false;
        return true;
    }
}
