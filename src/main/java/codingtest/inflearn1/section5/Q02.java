package main.java.codingtest.inflearn1.section5;

import java.util.Scanner;
import java.util.Stack;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }
    }
}
