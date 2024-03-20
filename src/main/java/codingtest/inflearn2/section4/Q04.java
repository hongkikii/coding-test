package main.java.codingtest.inflearn2.section4;

import java.util.*;
class Q04 {
    public int solution(int[] score, int k){
        int answer = 0;
        Arrays.sort(score);
        int l= 0;
        int r= 0;
        for(int i=0; i<=score.length-k; i++) {
            l = i;
            r = l + (k-1);
            if(score[r] - score[l] <= 10) {
                int sum = 0;
                for(int j=l; j<=r; j++) {
                    sum += score[j];
                }
                answer = sum / k;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Q04 T = new Q04();
        System.out.println(T.solution(new int[]{99, 97, 80, 91, 85, 95, 92}, 3));
        System.out.println(T.solution(new int[]{92, 90, 77, 91, 70, 83, 89, 76, 95, 92}, 4));
        System.out.println(T.solution(new int[]{77, 88, 78, 80, 78, 99, 98, 92, 93, 89}, 5));
        System.out.println(T.solution(new int[]{88, 99, 91, 89, 90, 72, 75, 94, 95, 100}, 5));
    }
}

