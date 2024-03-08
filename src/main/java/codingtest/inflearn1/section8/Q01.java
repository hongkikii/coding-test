package main.java.codingtest.inflearn1.section8;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

    static int total;
    static int N;
    static String answer = "NO";
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        total = Arrays.stream(A).sum();

        DFS(A, 0, 0);

        System.out.println(answer);
    }

    public static void DFS(int[] A, int sum, int level) {
        if(flag) {
            return;
        }
        if(total / 2 < sum) {
            return;
        }
        if(level == N) {
            if((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(A, sum+A[level], level+1);
            DFS(A, sum, level+1);
        }
    }

    /**
     *     public static boolean DFS(int[] A, int sum, int level) {
     *         if(total / 2 < sum) {
     *             return false;
     *         }
     *         if(total / 2 == sum) {
     *             return true; // 전체 리턴이 아니라, 재귀 리턴일 뿐 !!
     *         }
     *         if(level == N) {
     *             return false;
     *         }
     *         else {
     *             DFS(A, sum+A[level], level+1);
     *             DFS(A, sum, level+1);
     *         }
     *         return false; // 재귀가 끝난 후 무조건 return fasle를 반환
     *     }
     */
}
