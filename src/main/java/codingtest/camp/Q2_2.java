package main.java.codingtest.camp;

public class Q2_2 {
    public boolean solution(int[] arr) {
        int length = arr.length;
        boolean[] isExisted = new boolean[length+1];

        for(int num : arr) {
            if(num > length) return false;
            if(isExisted[num]) return false;
            isExisted[num] = true;
        }

        for(int i=1; i<=length; i++) {
            if(!isExisted[i]) return false;
        }
        return true;
    }
}
