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
        String result = "NO";


        for(char c : sequence) {
            queue.offer(c);
        }

        for(char c : plan) {
            if(queue.size() ==0) {
                result = "YES";
                break;
            }
            if(c == queue.peek()) {
                queue.poll();
            }
        }

        System.out.println(result);

    }

}
