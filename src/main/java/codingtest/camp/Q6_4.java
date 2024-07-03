package main.java.codingtest.camp;

import java.util.*;

public class Q6_4 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArr);
        int min = copyArr[0];
        int[] answer = new int[arr.length-1];

        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == min) continue;
            answer[idx++] = arr[i];
        }
        return answer;
    }
}
