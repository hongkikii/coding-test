package main.java.codingtest.inflearn2.section1;

import java.util.*;

class Q02 {
    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        int time = 0;
        answer[0] = 0;
        answer[1] = 0;
        int d = 1; // 1 => 오른쪽, 2 => 아래쪽, 3=> 왼쪽, 4 => 위쪽, …
        for(int i=0; i<k; i++) {
            int row = answer[0];
            int column = answer[1];
            if(d%4 == 1) {
                int tmp = column+1;
                if(tmp >= board.length || board[row][tmp] == 1) {
                    d++;
                }
                else {
                    answer[1] = tmp;
                }
            }
            else if(d%4 == 2) {
                int tmp = row+1;
                if(tmp >= board.length || board[tmp][column] == 1) {
                    d++;
                }
                else {
                    answer[0] = tmp;
                }
            }
            else if(d%4 == 3) {
                int tmp = column-1;
                if(tmp < 0 || board[row][tmp] == 1) {
                    d++;
                }
				else {
                    answer[1] = tmp;
                }
            }
            else if(d%4 == 0) {
                int tmp = row-1;
                if(tmp < 0 || board[tmp][column] == 1) {
                    d++;
                }
				else {
                    answer[0] = tmp;
                }
            }
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
