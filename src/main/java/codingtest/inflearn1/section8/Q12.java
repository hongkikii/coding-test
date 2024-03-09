package main.java.codingtest.inflearn1.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] box = new int[N+1][M+1];
        int[][] check = new int[N+1][M+1];
        int total = 0;
        int complete = 0;
        Queue<Location> queue = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int result = -1;
        boolean flag = false;

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                box[i][j] = sc.nextInt();
                if(box[i][j] != -1) {
                    total++;
                    if(box[i][j] == 1) {
                        complete++;
                        queue.add(new Location(i, j));
                        check[i][j] = 1;
                    }
                }
                else {
                    check[i][j] = -1;
                }
            }
        }

        if(total == complete) {
            System.out.print(0);
            return;
        }

        while(!queue.isEmpty()){
            if (flag) {
                break;
            }
            Location tmp = queue.poll();
            for(int i=0; i<4; i++) {
                int nx = tmp.row + dx[i];
                int ny = tmp.column + dy[i];
                if(nx >= 1 && nx <= N && ny >= 1 && ny <= M) {
                    while (check[nx][ny] == -1) {
                        nx += dx[i];
                        ny += dy[i];
                        if(!(nx >= 1 && nx <= N && ny >= 1 && ny <= M)) {
                            break;
                        }
                    }
                    if(nx >= 1 && nx <= N && ny >= 1 && ny <= M && check[nx][ny] == 0) {
                        queue.add(new Location(nx, ny));
                        check[nx][ny] = 1;
                        box[nx][ny] = box[tmp.row][tmp.column] + 1;
                        complete++;
                        if(total == complete) {
                            result = box[nx][ny];
                            flag = true;
                        }
                    }
                }
            }
        }
        System.out.print(result);
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
