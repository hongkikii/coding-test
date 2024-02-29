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
        for(char c : sequence) {
            queue.offer(c);
        }

        for(int i=0; i<plan.length; i++) {
            if(queue.size() ==0) {
                break;
            }
            if(plan[i] == queue.peek()) {
                queue.poll();
            }
        }

        if(queue.size() == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }

}
