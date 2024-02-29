package main.java.codingtest.inflearn1.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++) {
            queue.offer(i);
            /**
             * add() vs offer()
             * queue 용량 부족 시,
             * add()는 예외를 터뜨림(IllegalStateException), Collection.add(), 용량 제한 없는 경우에 사용
             * offer()는 false를 반환함, 용량 제한 있는 경우에 사용
             * add()는 false를 반환하는 경우가 없음
             */
        }

        while(queue.size() > 1) {
            for(int i=0; i<K-1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}
