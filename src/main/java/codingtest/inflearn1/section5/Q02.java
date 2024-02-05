package main.java.codingtest.inflearn1.section5;

import java.util.Scanner;
import java.util.Stack;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        String result = "";

        for (char c : chars) {
            if (c == '(') {
                stack.add(1);
            }
            else if (c == ')') {
                stack.pop();
            }
            else {
                if (stack.isEmpty()) {
                    result += c;
                }
            }
        }
        System.out.println(result);
    }
}
