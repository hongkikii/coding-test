package main.java.codingtest.inflearn2.section9;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int P = sc.nextInt();
        int[] dy = new int[D+1];
        for(int i=0; i<P; i++) {
            int L = sc.nextInt();
            int C = sc.nextInt();
            for(int j=D; j>L; j--) {
                if(dy[j-L] == 0) continue;
                dy[j] = Math.max(dy[j], Math.min(dy[j-L], C));
            }
            dy[L] = Math.max(C, dy[L]);
        }
        System.out.println(dy[D]);
    }
}
