package main.java.codingtest.camp;

import java.util.*;

public class Q7_4 {
    public int solution(int [][] arr) {
        int answer = 1;
        Arrays.sort(arr, (a, b) -> {
            if(a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int i = 0;
        for(int[] time : arr) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i][1] <= arr[j][0]) {
                    answer++;
                    i = j;
                    break;
                }
            }
        }
        return answer;
    }
}
