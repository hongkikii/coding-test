package main.java.codingtest.inflearn1.section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q07 {
    static class Point implements Comparable<Point> {
        public int x;
        public int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y;
            return this.x - o.x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Point> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for(Point p : list){
            System.out.println(p.x + " " + p.y);
        }
    }

}
