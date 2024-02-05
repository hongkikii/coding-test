package main.java.codingtest.inflearn1.section5;

import java.util.Scanner;
import java.util.Stack;

public class Q01 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        for (char c : chars) {
            if (c == '(') {
                stack.add(1);
            }
            else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
