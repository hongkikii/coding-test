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
        int[] check = new int[10001];
        int[] next = {1, -1, 5};
        queue.add(S);
        check[S] = 1;
        int level = 0;
        boolean found = false;

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; i++) {
                int poll = queue.poll();
                if(poll == E) {
                    found = true;
                    break;
                }
                for (int j = 0; j < next.length; j++) {
                    int v = poll + next[j];
                    if (v >= 1 && v <= 10000 && check[v] == 0) {
                        check[v] = 1;
                        queue.add(v);
                    }
                }
            }
            if (found) break;
            level++;
        }
        System.out.println(level);
    }

}
