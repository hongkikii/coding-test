package main.java.codingtest.inflearn2.section8;

import java.util.*;

class Q03 {
    public int solution(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        int[][] cost = new int[m][n];
        for(int i=0; i<m; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        cost[0][0] = 0;
        queue.add(new int[]{0, 0, 0}); // 행, 열, 비용
        while(!queue.isEmpty()) {
            int[] info = queue.poll();
            int r = info[0];
            int c = info[1];
            int count = info[2];
            if(count > cost[r][c]) continue;
            for(int i=0; i<4; i++) {
                int nx = r + dx[i];
                int ny = c + dy[i];
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if(board[nx][ny] == 0 && cost[nx][ny] > count) {
                    cost[nx][ny] = count;
                    queue.add(new int[]{nx, ny, count});
                }
                if(board[nx][ny] == 1 && cost[nx][ny] > count+1) {
                    cost[nx][ny] = count + 1;
                    queue.add(new int[]{nx, ny, count+1});
                }
            }
        }
        return cost[m-1][n-1];
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


