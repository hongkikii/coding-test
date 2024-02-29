package main.java.codingtest.inflearn1.section5;

import java.util.Scanner;

/**
 * 규칙
 * ( -> 쇠막대기 추가
 * () -> 레이저 : 쇠막대기 개수 하나 제거,현재 쌓인 ( 개수(=쇠막대기 개수) 추가
 * ) 연속 -> 쇠막대기 개수 하나 제거, 현재 쌓인 개수 하나 추가
 */

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] A = input.toCharArray();
        int count = 0;
        int sum = 0;

        for(int i =0; i<A.length; i++) {
            char c = A[i];
            if(c == '(') {
                count++;
            }
            else if(c == ')') {
                count--;
                if(A[i-1] == '(') {
                    sum += count;
                }
	            else {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

}

