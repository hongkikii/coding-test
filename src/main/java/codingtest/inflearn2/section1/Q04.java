package main.java.codingtest.inflearn2.section1;

import java.util.*;
class Q04 {
    public int[] solution(int c, int r, int k){
        if(c * r < k) return new int[]{0, 0};
        int[][] seat = new int[c][r];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int d = 0;
        int cx = 0;
        int cy = 0;
        int count = 1;
        while(count < k) {
            int nx = cx + dx[d];
            int ny = cy + dy[d];
            if(nx < 0 || nx >= c || ny < 0 || ny >= r || seat[nx][ny] != 0 ) {
                d = (d+1) % 4;
                continue;
            }
            seat[cx][cy] = count++;
            cx = nx;
            cy = ny;
        }
        return new int[]{cx+1, cy+1};
    }

    public static void main(String[] args){
        Q04 T = new Q04();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }
}

