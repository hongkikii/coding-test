package main.java.codingtest.inflearn1.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();

        Map<Character, Integer> As = new HashMap<>();
        Map<Character, Integer> Bs = new HashMap<>();

        for (char c : A) {
            As.put(c, As.getOrDefault(c, 0) + 1);
        }

        for (char c : B) {
            Bs.put(c, Bs.getOrDefault(c, 0) + 1);
        }

        boolean result = true;
        for (char c : As.keySet()) {
            if (As.get(c) != Bs.get(c)) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
