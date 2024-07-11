package main.java.codingtest.ict;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
        int n = 0;
        int currentHours = 0;
        for(char c : pattern.toCharArray()) {
            if(c == '?') n++;
            else {
                currentHours += c-48;
            }
        }
        int r = workHours - currentHours;
        List<List<Integer>> cases = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        findAllCases(cases, tmp, n, r, dayHours, 0);

        List<String> answer = new ArrayList<>();
        for(List<Integer> v : cases) {
            int idx = 0;
            StringBuilder sb = new StringBuilder();
            for(char c : pattern.toCharArray()) {
                if(c == '?') {
                    sb.append(v.get(idx++));
                }
                else {
                    sb.append(c);
                }
            }
            answer.add(sb.toString());
        }
        return answer;
    }

    private static void findAllCases(List<List<Integer>> cases, List<Integer> tmp, int n, int r, int max, int idx) {
        if(idx == n) {
            if(r == 0) {
                cases.add(new ArrayList<>(tmp));
            }
            return;
        }

        for(int i=0; i<=Math.min(r, max); i++) {
            tmp.add(i);
            findAllCases(cases, tmp, n, r-i, max, idx+1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
