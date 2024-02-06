package main.java.codingtest.inflearn1.section5;

import java.util.Scanner;
import java.util.Stack;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                stack.push(c - 48);
            }
            else {
                int a = stack.pop();
                int b = stack.pop();
                if (c == '+') {
                    stack.push(b + a);
                }
                if (c == '-') {
                    stack.push(b - a);
                }
                if (c == '*') {
                    stack.push(b * a);
                }
                if (c == '/') {
                    stack.push(b / a);
                }
            }
        }
        System.out.println(stack.pop());
    }
}
