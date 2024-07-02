package main.java.codingtest.camp;

import java.util.*;

public class Q2_1 {
    public int[] solution(int[] arr) {
        int max = -1;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= max) {
                if(arr[i] > max) {
                    list.clear();
                }
                max = arr[i];
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
