package main.java.codingtest.inflearn1.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char[] sequence = sc.nextLine().toCharArray();
        char[] plan = sc.nextLine().toCharArray();
        Queue<Character> queue = new LinkedList<>();
        String result = "YES";


        for(char c : sequence) {
            queue.offer(c);
        }

        // 순서가 다른 경우
        for(char c : plan) {
            if (queue.contains(c)) {
                if(c != queue.poll()) {
                    result = "NO";
                }
            }
        }

        // 순서는 맞지만, 이후 과목을 계획에 포함시키지 않은 경우
        if(!queue.isEmpty()) {
            result = "NO";
        }

        System.out.println(result);

    }

}
