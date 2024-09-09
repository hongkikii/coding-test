package main.java.codingtest.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

public class Q71 {

    public String simplifyPath(String path) {
        // . -> 아무 일 없음
        // .. -> 스택에서 하나 제거
        // 슬래시만 여러개 -> 스택에 추가(슬래시 하나로 처리)
        // 나머지 -> 스택에 추가(유효한 디렉터리 이름)
        // 마지막 슬래시 -> 아무 일 없음(결과에 포함 X)

        // 덱을 사용해서 쉽게 앞에서부터 빼낼 수 있게 하자
        // 슬래시는 나중에 별도로 추가해서 조건을 간단히 하자

        Deque<String> deque = new LinkedList<>();
        String[] splits = path.split("/+");

        for(String split : splits) {
            if(split.equals(".")) continue;
            if(split.equals("..") && deque.size() > 1)  deque.removeLast();
            else deque.addLast(split);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        for(String str : deque) {
            sb.append(str + "/");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    public static void main(String[] args) {
        Q71 q71 = new Q71();
        System.out.println(q71.simplifyPath("/home/"));
    }
}
