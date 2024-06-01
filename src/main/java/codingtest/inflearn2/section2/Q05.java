package main.java.codingtest.inflearn2.section2;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Q05 {
    public String solution(String[] votes, int k){
        int voteCount = votes.length;
        String answer = " ";
        Map<String, Integer> votedAndCount = new HashMap<>();
        List<String> candidates;
        String[][] votedAndVoting = new String[voteCount][2];
        Map<String, Integer> votingAndCount = new HashMap<>();

        for(int i=0; i<voteCount; i++) {
            String[] info = votes[i].split(" ");
            votedAndVoting[i][0] = info[1];
            votedAndVoting[i][1] = info[0];
            votedAndCount.put(info[1], votedAndCount.getOrDefault(info[1], 0)+1);
        }
        candidates = votedAndCount.entrySet().stream()
                .filter(entry -> entry.getValue() > k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for(int i=0; i<votedAndVoting.length; i++) {
            if(candidates.contains(votedAndVoting[i][0])) {
                votingAndCount.put(votedAndVoting[i][1], votingAndCount.getOrDefault(votedAndVoting[i][1], 0) +1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for(Entry<String, Integer> entry : votingAndCount.entrySet()) {
            if(entry.getValue() > maxValue) {
                answer = entry.getKey();
            }
            if(entry.getValue() == maxValue) {
                if(entry.getKey().compareTo(answer) < 0) {
                    answer = entry.getKey();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q05 T = new Q05();
        System.out.println(T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 3));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }
}
