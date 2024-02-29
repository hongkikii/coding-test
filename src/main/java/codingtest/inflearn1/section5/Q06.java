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
            queue.add(i);
        }

        while(queue.size() > 1) {
            for(int i=0; i<K-1; i++) {
                int tmp = queue.poll();
                queue.add(tmp);
            }
            queue.poll();
        }

        System.out.println(queue.poll());
    }
}
