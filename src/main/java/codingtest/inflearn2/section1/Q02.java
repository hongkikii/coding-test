package main.java.codingtest.inflearn2.section1;

import java.util.*;

class Q02 {
    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int d = 0;
        int time = 0;
        while (time < k) {
            time++;
            int nx = answer[0] + dx[d];
            int ny = answer[1] + dy[d];
            if (nx < 0 || nx >= board.length || ny < 0 || ny >= board.length || board[nx][ny] == 1) {
                d = (d + 1) % 4;
                continue;
            }
            answer[0] = nx;
            answer[1] = ny;
        }
        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));

    }
}
