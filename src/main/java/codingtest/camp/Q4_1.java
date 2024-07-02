package main.java.codingtest.camp;

import java.util.*;

public class Q4_1 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        return Math.min(nums.length/2, set.size());
    }
}
