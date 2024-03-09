package main.java.codingtest.inflearn1.section8;

import java.util.Scanner;

public class Q13_1 {
    static int N;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
    static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        int count = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] == 1) {
                    count++;
                    map[i][j] = 0;
                    DFS(i, j);
                }
            }
        }

        System.out.println(count);
    }

    public static void DFS(int x, int y) {
        for(int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < N && ny>=0 && ny < N && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                DFS(nx, ny);
            }
        }
    }
}
