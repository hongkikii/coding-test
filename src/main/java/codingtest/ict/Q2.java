package main.java.codingtest.ict;

import java.util.List;

public class Q2 {
    public static int raisingPower(List<Integer> arr) {
        int idx = -1; // 인덱스, 중에서도 최소
        double max = -1;
        double mod = Math.pow(10,9) + 7;

        // for문 돌면서 계산
        for(int i=0; i<arr.size()-1; i++) {
            double tmp = Math.pow(arr.get(i), arr.get(i+1)) / mod;
            if(tmp > max) {
                max = tmp;
                idx = i+1;
            }
        }
        return idx;
    }

    /*
    def raisingPower(arr):
    mod = 10**9 + 7
    idx = -1
    max = -1

    for i in range(1, len(arr)):
        tmp = pow(arr[i-1], arr[i], mod)
        if tmp > max:
            max = tmp
            idx = i

    return idx
     */
}
