package main.java.codingtest.inflearn1.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    static int answer;
    static int T;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        List<Question> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int point = sc.nextInt();
            int time = sc.nextInt();
            list.add(new Question(point, time));
        }

        DFS(list, 0, 0, 0);

        System.out.println(answer);
    }

    static class Question {
        int point;
        int time;

        public Question(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    public static void DFS(List<Question> list, int pointSum, int timeSum, int level) {
        if(timeSum > T) {
            return;
        }
        if(level == N) {
            answer = Math.max(answer, pointSum);
        }
        else {
            DFS(list, pointSum+list.get(level).point, timeSum+list.get(level).time,level+1);
            DFS(list, pointSum, timeSum, level+1);
        }
    }

}
