package main.java.codingtest.ict;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q1 {

    // 5명의 학생으로 한 팀 이루어짐
    // 각 학생들은 다른 과목에 skill을 가지고 있음
    // 한 학생은 한 팀에만 속함
    // => 모든 과목이 다 존재해야 하고, 그 중에 최소값이 팀이 되겠네

    public static int perfectTeam(String skills) {
        // map(과목, 개수)
        // 키가 다섯개인지 확인 => 아니면 바로 0 리턴
        // 이 중에서 가장 가장 작은 value를 리턴
        Map<Character, Integer> skillMap = new HashMap<>();
        for(char c : skills.toCharArray()) {
            skillMap.put(c, skillMap.getOrDefault(c, 0) + 1);
        }

        if(skillMap.size() < 5) return 0;

        return Collections.min(skillMap.values());
    }
}
