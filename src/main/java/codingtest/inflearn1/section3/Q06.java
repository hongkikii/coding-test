package main.java.codingtest.inflearn1.section3;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int zeroCount = 0;
        int length = 0;
        int zeroLeftIdx = 0;
        int zeroRightIdx = 0;
        int leftIdx = 0;
        int rightIdx = 0;

        while (rightIdx < N) {
            if (A[rightIdx] == 0) {
                zeroCount++;
                if (zeroCount == 1) {
                    zeroLeftIdx = rightIdx;
                }
                if (zeroCount == 2) {
                    zeroRightIdx = rightIdx;
                    rightIdx++;
                    break;
                }
            }
            rightIdx++;
        }

        while (rightIdx < N) {
            if (A[rightIdx] == 1) {
                int tmp = rightIdx - leftIdx + 1;
                length = Math.max(length, tmp);
                rightIdx++;
                continue;
            }
            leftIdx = zeroLeftIdx + 1; // leftIdx 수정 규칙을 모르겠다.
            zeroLeftIdx = zeroRightIdx;
            zeroRightIdx = rightIdx;
            rightIdx++;
        }
        System.out.println(length);
    }
}
