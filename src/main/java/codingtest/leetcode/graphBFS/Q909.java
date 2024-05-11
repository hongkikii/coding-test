package main.java.codingtest.leetcode.graphBFS;

import java.util.LinkedList;
import java.util.Queue;

public class Q909 {
    int len;
    int target;
    public int snakesAndLadders(int[][] board) {
        len = board.length;
        target = len * len;
        int result = 0;
        int[] moveInfo = makeMoveInfo(board);
        boolean[] visited = new boolean[target+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                int now = queue.poll();
                if(target == now) return result;
                for(int j=now+1; j<=now+6; j++) {
                    if(j > target) break;
                    int nextStep = j;
                    if(moveInfo[j] != -1) nextStep = moveInfo[j];
                    if(visited[nextStep]) continue;
                    visited[nextStep] = true;
                    queue.offer(nextStep);
                }
            }
            result++;
        }
        return -1;
    }

    private int[] makeMoveInfo(int[][] board) {
        int[] result = new int[target+1];
        boolean leftToRight = true;
        int idx = 1;
        for(int i=len-1; i>=0; i--) {
            if(leftToRight) {
                for(int j=0; j<len; j++) {
                    result[idx++] = board[i][j];
                }
            }
            else {
                for(int j=len-1; j>=0; j--) {
                    result[idx++] = board[i][j];
                }
            }
            leftToRight = !leftToRight;
        }
        return result;
    }
}
