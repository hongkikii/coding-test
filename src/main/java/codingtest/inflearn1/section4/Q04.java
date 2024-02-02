package main.java.codingtest.inflearn1.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        Map<Character, Integer> TMap = new HashMap<>();
        Map<Character, Integer> compareMap = new HashMap<>();

        for (int i = 0; i < T.length; i++) {
            TMap.put(T[i], TMap.getOrDefault(T[i], 0) + 1);
        }

        for (int i = 0; i < T.length - 1; i++) {
            compareMap.put(S[i], compareMap.getOrDefault(S[i], 0) + 1);
        }

        boolean result = true;
        int left = 0;
        int count = 0;
        for (int right = T.length - 1; right < S.length; right++) {
            compareMap.put(S[right], compareMap.getOrDefault(S[right], 0) + 1);
            for (char c : compareMap.keySet()) {
                if (compareMap.get(c) != TMap.get(c)) {
                    result = false;
                    break;
                }
            }
            if (compareMap.size() == TMap.size() && result) {
                count++;
            }
            compareMap.put(S[left], compareMap.get(S[left]) - 1);
            if (compareMap.get(S[left]) == 0) {
                compareMap.remove(S[left]);
            }
            left++;
            result = true;
        }
        System.out.println(count);
    }
}
