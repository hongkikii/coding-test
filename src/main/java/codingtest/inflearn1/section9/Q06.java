package main.java.codingtest.inflearn1.section9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q06 {
    static Map<Integer, Integer> pairMap;
    static boolean[] check;
    static String result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int pair = sc.nextInt();
        pairMap = new HashMap<>();
        check = new boolean[student + 1];

        for(int i=0; i<pair; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            pairMap.put(key, value);
        }

        int one = sc.nextInt();
        int another = sc.nextInt();

        result = "NO";
        find(one, another);

        System.out.println(result); // YES or NO

    }

    public static void find(int one, int another) {
        if(pairMap.get(one) == null || check[one] == true) {
            return;
        }
	    if(pairMap.get(one) == another) {
            result = "YES";
        }
	    else {
            check[one] = true;
            find(pairMap.get(one), another);
        }
    }
}
