package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q10 {
    static int count;
    static int[][] path;
    static int[][] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        path = new int[8][8];
        check = new int[10][10];

        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                path[i][j] = sc.nextInt();
            }
        }

        DFS(1, 1);
        System.out.print(count);
    }

    public static void DFS(int a, int b) {
        if(a > 7 || b > 7 || a <= 0 || b <= 0) return;
        if(path[a][b] == 1) return;
        if(a == 7 && b == 7) count++;
        else {
            if (check[a][b] == 0) {
                check[a][b] = 1;
                DFS(a-1, b);
                DFS(a, b - 1);
                DFS(a + 1, b);
                DFS(a, b + 1);
                check[a][b] = 0;
            }
        }
    }
}
