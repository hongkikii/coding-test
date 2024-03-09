package main.java.codingtest.inflearn1.section9;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Lecture> queue = new PriorityQueue<>();
        int maxDay = 0;
        for(int i=0; i<N; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            queue.add(new Lecture(money, day));
            maxDay = Math.max(maxDay, day);
        }

        int sum = 0;
        int[] A = new int[maxDay + 1];
        while(!queue.isEmpty()) {
            Lecture lecture = queue.poll();
            for(int i=lecture.day; i>=1; i--) {
                if(A[i] == 0){
                    A[i] = 1;
                    sum += lecture.money;
                    break;
                }
            }
        }
        System.out.println(sum);
    }

    static class Lecture implements Comparable<Lecture> {
        int money;
        int day;
	    public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Lecture o) {
            if(this.money == o.money) return o.day - this.day;
            else return o.money - this.money;
        }
    }
}
