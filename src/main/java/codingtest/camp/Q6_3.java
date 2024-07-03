package main.java.codingtest.camp;

public class Q6_3 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++) {
            String currentSkill = skill_trees[i];
            StringBuilder sb = new StringBuilder();
            for(char c : currentSkill.toCharArray()) {
                if(skill.indexOf(c) != -1) {
                    sb.append(c);
                }
            }
            if(currentSkill.equals(sb.toString())) answer++;
        }
        return answer;
    }
}
