package main.java.codingtest.camp;

import java.util.*;

public class Q3_1 {
    public boolean solution(int[] lotto) {
        boolean answer = true;
        Set<Integer> set = new HashSet<>();

        for(int num : lotto) {
            if(set.contains(num)) return false;
            set.add(num);
        }
        return answer;
    }
}
