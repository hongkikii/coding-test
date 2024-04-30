package main.java.codingtest.leetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0; i<intervals.length-1; i++) {
            if(intervals[i][1] >= intervals[i+1][0]) {
                intervals[i+1][0] = intervals[i][0];
                intervals[i+1][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                intervals[i][0] = -1;
                intervals[i][1] = -1;
            }
        }

        List<int[]> result = new ArrayList<>();
        for(int i=0; i<intervals.length; i++) {
            if(intervals[i][0] != -1) {
                result.add(intervals[i]);
            }
        }

        int[][] returnVal = new int[result.size()][2];
        for(int i=0; i<returnVal.length; i++) {
            returnVal[i] = result.get(i);
        }

        return returnVal;
    }
}
