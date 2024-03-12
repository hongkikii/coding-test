package main.java.codingtest.inflearn1.section9;

import java.util.Scanner;

public class Q06 {
    static int[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int pair = sc.nextInt();
        A = new int[student+1];

        for(int i=1; i<=student; i++) {
            A[i] = i;
        }

        // 쌍 , 유니온, 파인드
        for(int i=0; i<pair; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }

        // 비교(find), 출력
        int one = sc.nextInt();
        int another = sc.nextInt();
        one = find(one);
        another = find(another);
        if(one == another) System.out.print("YES");
        else System.out.print("NO");
    }


    public static int find(int v) {
        if(A[v] == v) return v;
        else return A[v] = find(A[v]);
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a != b) A[a] = b;
    }

}
