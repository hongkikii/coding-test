package main.java.codingtest.inflearn1.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] box = new int[N][M];
        int[][] check = new int[N][M];
        Queue<Location> queue = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int total = 0;
        int complete = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] != -1) {
                    total++;
                    if (box[i][j] == 1) {
                        queue.add(new Location(i, j));
                        complete++;
                    }
                }
            }
        }

        if (total == complete) {
            System.out.println(0);
            return;
        }

        while (!queue.isEmpty()) {
            Location tmp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.row + dx[i];
                int ny = tmp.column + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && box[nx][ny] == 0) {
                    queue.add(new Location(nx, ny));
                    box[nx][ny] = 1;
                    check[nx][ny] = check[tmp.row][tmp.column] + 1;
                    complete++;
                }
            }
        }

        if (total != complete) {
            System.out.println(-1);
            return;
        }

        int result = -9999;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result = Math.max(result, check[i][j]);
            }
        }
        System.out.println(result);
    }

    static class Location {
        int row;
        int column;
        public Location(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}
