package main.java.codingtest.inflearn1.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Character, Integer> votes = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            int key = 'A' + i;
            votes.put((char) key, 0);
        }

        String line = sc.next();
        char[] chars = line.toCharArray();

        for (int i = 0; i < N; i++) {
            char c = chars[i];
            votes.entrySet().stream()
                    .filter(entry -> entry.getKey() == c)
                    .forEach(entry -> votes.put(entry.getKey(), entry.getValue() + 1));
        }

        Character result = votes.entrySet().stream()
                .max(Entry.comparingByValue())
                .map(Entry::getKey)
                .orElse(null);

        System.out.println(result);

    }
}
