package main.java.codingtest.inflearn1.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] argos) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = 0;

        Queue<Patient> queue = new LinkedList<>();

        for(int i=0; i<N; i++) {
            queue.offer(new Patient(i, sc.nextInt()));
        }

        while(!queue.isEmpty()) {
            Patient tmp = queue.poll();
            for(Patient p : queue) {
                if(tmp.risk < p.risk) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                answer++;
                if(tmp.index == M) {
                    System.out.println(answer);
                    return;
                }
            }
        }
        System.out.println(answer);
    }

    static class Patient {
        public Patient(int index, int risk) {
            this.index = index;
            this.risk = risk;
        }
        int index;
        int risk;
    }

}
