package main.java.codingtest.inflearn2.section8;

import java.util.*;

class Q03 {
    int[][] min;
    int m;
    int n;
    public int solution(int[][] board) {
        m = board.length;
        n = board[0].length;
        min = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                min[i][j] = Integer.MAX_VALUE;
            }
        }
        min[0][0] = 0;
        return DP(m-1, n-1, board);
    }

    public int DP(int row, int column, int[][] board) {
        if(row == 0 && column == 0) {
            return min[0][0];
        }
        if(row==0) {
            return min[row][column] = DP(row, column-1, board) + board[row][column];
        }
        else if(column ==0) {
            return min[row][column] = DP(row-1, column, board) + board[row][column];
        }
        else {
            return min[row][column] = Math.min(DP(row-1, column, board), DP(row, column-1, board));
        }
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        System.out.println(T.solution(new int[][]{{0, 1, 1, 0}, {1, 0, 0, 1}, {0, 1, 0, 0}}));
        System.out.println(T.solution(new int[][]{{0, 1, 1, 0},{1, 1, 0, 1},{0, 0, 1, 0}, {0, 1, 1, 1}, {0, 1, 1, 0}}));
        System.out.println(T.solution(new int[][]{{0, 1, 1, 0, 1, 1},{0, 1, 1, 1, 1, 1},{1, 0, 0, 0, 1, 1}, {1, 1, 0, 1, 1, 1}, {1, 1, 0, 1, 1, 0}, {1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 0}}));
        System.out.println(T.solution(new int[][]{{0, 1, 1, 0, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1}, {1, 0, 0, 0, 0, 1, 1}, {1, 1, 1, 0, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 0}}));
        System.out.println(T.solution(new int[][]{{0, 0, 1, 0, 1, 1, 1},{1, 1, 0, 0, 1, 1, 1},{1, 1, 0, 1, 0, 1, 1}, {0, 0, 1, 0, 1, 1, 1}, {1, 0, 1, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1}, {1, 0, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 0}}));
    }
}

