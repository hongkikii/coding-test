package main.java.codingtest.inflearn1.section5;

import java.util.Scanner;
import java.util.Stack;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N + 1][N + 1];
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int column = sc.nextInt();
            int pick = 0;
            for (int j = 1; j <= N; j++) {
                if (A[j][column] == 0) {
                    continue;
                }
                pick = A[j][column];
                A[j][column] = 0;
                break;
            }
            if (!stack.isEmpty() && stack.peek() == pick) {
                stack.pop();
                count += 2;
            }
            else if (pick != 0) {
                stack.push(pick);
            }
        }
        System.out.println(count);
    }
}
