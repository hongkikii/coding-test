package main.java.codingtest.inflearn1.section9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06 {
    static List<ArrayList<Integer>> pairList;
    static boolean[] check;
    static String result;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int pair = sc.nextInt();
        pairList = new ArrayList<>();
        check = new boolean[student+1];

        for(int i=0; i<=student; i++) {
            pairList.add(new ArrayList<>());
        }

        for(int i=0; i<pair; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            pairList.get(key).add(value);
            pairList.get(value).add(key);
        }

        int one = sc.nextInt();
        int another = sc.nextInt();

        result = "NO";
        find(one, another);

        System.out.println(result); // YES or NO

    }

    public static void find(int one, int another) {
        if(pairList.get(one).contains(another)) {
            result = "YES";
        }
        else {
            check[one] = true;
            for (int v : pairList.get(one)) {
                if (check[v] == false) {
                    find(v, another);
                }
            }
        }
    }
}
