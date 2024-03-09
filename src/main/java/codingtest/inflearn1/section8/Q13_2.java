package main.java.codingtest.inflearn1.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q13_2 {

    static Queue<Location> queue = new LinkedList<>();
    static int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
    static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[][] map;
    static int N;

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
                    queue.add(new Location(i, j));
                    BFS();
                }
            }
        }

        System.out.println(count);
    }

    public static void BFS() {
        while(!queue.isEmpty()){
            Location poll = queue.poll();
            for(int i=0; i<8; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx >= 0 && nx < N && ny>=0 && ny < N && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    queue.add(new Location(nx, ny));
                }
            }
        }
    }

    static class Location {
        int x;
        int y;
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
