package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q10 {
    static int count;
    static int[][] path;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        path = new int[8][8];

        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                path[i][j] = sc.nextInt();
            }
        }

        path[1][1] = 1;
        DFS(1, 1);
        System.out.print(count);
    }

    public static void DFS(int a, int b) {
        if(a == 7 && b == 7) count++;
        else {
            for (int i = 0; i < 4; i++) {
                int x = a + dx[i];
                int y = b + dy[i];
                if (x >= 1 && x <= 7 && y >= 1 && y <= 7 && path[x][y] == 0) {
                    path[x][y] = 1;
                    DFS(x, y);
                    path[x][y] = 0;
                }
            }
        }
    }
}
