package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Meeting> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Meeting(start, end));
        }

        Collections.sort(list);

        int result = 0;
        int end = 0;
        for(Meeting v: list) {
            if(v.start >= end) {
                result++;
                end = v.end;
            }
        }
        System.out.println(result);
    }

    static class Meeting implements Comparable<Meeting> {
        int start;
        int end;
        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting o) {
            if(o.end == this.end) return this.start - o.start;
            else return this.end - o.end;
        }
    }

}
