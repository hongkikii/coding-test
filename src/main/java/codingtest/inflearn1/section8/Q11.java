package main.java.codingtest.inflearn1.section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] path = new int[8][8];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int count = 0;
        boolean flag = false;

        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++) {
                path[i][j] = sc.nextInt();
            }
        }

        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(1, 1));
        path[1][1] = 1;

        while(!queue.isEmpty()) {
            Location poll = queue.poll();
            if(poll.row == 7 && poll.column==7){
                flag = true;
                break;
            }
            for(int i=0; i<4; i++) {
                int x = poll.row + dx[i];
                int y = poll.column + dy[i];
                if(x >=1 && x <= 7 && y >=1 && y <= 7 && path[x][y] ==0) {
                    queue.add(new Location(x, y));
                    path[x][y] = 1;
                }
            }
            count++;
        }

        if (flag) {
            System.out.println(count);

        } else {
            System.out.println(-1);
        }
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
