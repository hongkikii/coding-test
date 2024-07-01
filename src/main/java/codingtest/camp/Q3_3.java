package main.java.codingtest.camp;

import java.util.*;

public class Q3_3 {
    public int[] solution(int[]arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        int last = -1;
        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            if(last != num) list.add(num);
            last = num;
        }

        answer = new int[list.size()];
        int i = 0;
        for(int num : list) {
            answer[i++] = num;
        }
        return answer;
    }
}
