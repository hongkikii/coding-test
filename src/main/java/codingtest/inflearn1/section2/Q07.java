package main.java.codingtest.inflearn1.section2;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int add = 0;
        int result = 0;
        for (int i = 0; i < loop; i++) {
            int answer = sc.nextInt();
            if (answer == 0) {
                add = 0;
                continue;
            }
            if (answer == 1) {
                add++;
                result += add;
            }
        }
        System.out.println(result);
    }
}
