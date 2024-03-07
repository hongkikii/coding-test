package main.java.codingtest.inflearn1.section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] argos) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(S + 1);
        queue.add(S - 1);
        queue.add(S + 5);
        int level = 0;
        int len = 3;
        boolean find = false;

        while(!find) {
            level++;
            for(int i=0; i<len; i++) {
                int poll = queue.poll();
                if(poll == E) {
                    find = true;
                    break;
                }
                queue.add(poll + 1);
                queue.add(poll - 1);
                queue.add(poll + 5);
            }
            len *= 3;
        }
        System.out.println(level);
    }

}
