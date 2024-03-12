package main.java.codingtest.inflearn1.section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        List<Brick> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int bottom = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Brick(bottom, height, weight));
        }

        int result = 0;
        A[0] = list.get(0).height;

        for(int i=1; i<N; i++) {
            int max = 0;
            for(int j=i-1; j>=0; j--) {
                if(list.get(i).bottom < list.get(j).bottom &&
                        list.get(i).weight < list.get(j).weight) {
                    max = Math.max(max, A[j]);
                }
            }
            A[i] = max + list.get(i).height;
            result = Math.max(result, A[i]);
        }
        System.out.println(result);
    }

    static class Brick {
        int bottom;
        int height;
        int weight;

        public Brick(int bottom, int height, int weight) {
            this.bottom = bottom;
            this.height  = height;
            this.weight = weight;
        }
    }

}
