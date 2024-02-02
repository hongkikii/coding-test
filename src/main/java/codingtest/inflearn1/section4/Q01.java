package main.java.codingtest.inflearn1.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> votes = new HashMap<>();
        sc.nextInt();
        char[] chars = sc.next().toCharArray();

        for (char c : chars) {
            votes.put(c, votes.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char answer = ' ';
        for (char c : votes.keySet()) {
            if (votes.get(c) > max) {
                max = votes.get(c);
                answer = c;
            }
        }
        System.out.println(answer);
    }
}
