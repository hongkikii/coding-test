package main.java.codingtest.inflearn1.section10;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxMinute = sc.nextInt();

        int[] result = new int[maxMinute+1];

        for(int i=0; i<num; i++) {
            int score = sc.nextInt();
            int minute = sc.nextInt();
            for(int j=maxMinute; j>=minute; j--) {
                result[j] = Math.max(result[j], result[j-minute] + score);
            }
        }
        System.out.print(result[maxMinute]);
    }

}
