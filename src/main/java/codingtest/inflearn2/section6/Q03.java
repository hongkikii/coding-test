package main.java.codingtest.inflearn2.section6;

import java.util.*;
class Q03 {
    int answer;
    int len;
    boolean[] isWhite;
    public int solution(int[][] cans) {
        answer = Integer.MAX_VALUE;
        len = cans.length;
        isWhite = new boolean[len];
        DFS(0, 0, cans);
        return answer;
    }

    public void DFS(int level, int idx, int[][] cans) {
        if(level == len/2) {
            int whiteSum = 0;
            int blackSum = 0;
            for(int i=0; i<len; i++) {
                if(isWhite[i]) {
                    whiteSum += cans[i][0];
                }
                else {
                    blackSum += cans[i][1];
                }
            }
            answer = Math.min(answer, Math.abs(whiteSum - blackSum));
        }
        else {
            for(int i=idx; i<len; i++) {
                isWhite[i] = true;
                DFS(level+1, i+1, cans);
                isWhite[i] = false;
            }
        }
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        System.out.println(T.solution(new int[][]{{87, 84}, {66, 78}, {94, 94}, {93, 87}, {72, 92}, {78, 63}}));
        System.out.println(T.solution(new int[][]{{10, 20}, {15, 25}, {35, 23}, {55, 20}}));
        System.out.println(T.solution(new int[][]{{11, 27}, {16, 21}, {35, 21}, {52, 21}, {25, 33},{25, 32}, {37, 59}, {33, 47}}));
    }
}

