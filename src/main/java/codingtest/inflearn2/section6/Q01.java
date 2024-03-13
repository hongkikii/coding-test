package main.java.codingtest.inflearn2.section6;

import java.util.*;

class Q01 {
    static int m, answer, target;
    static List<Integer> list;
    static int[] check;
    static boolean flag;

    public int solution(int n){
        flag = false;
        target = n;
        answer = -1;
        list = new ArrayList<>();

        while(n>0) {
            list.add(n%10);
            n /= 10;
        }

        Collections.sort(list);
        m = list.size();
        check = new int[m];

        DFS(0, 0);
        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        System.out.println(T.solution(123));
        System.out.println(T.solution(321));
        System.out.println(T.solution(20573));
        System.out.println(T.solution(27711));
        System.out.println(T.solution(54312));
    }

    public void DFS(int L, int num) {
        if(flag) return;
        if(L == m) {
            if(num > target) {
                answer = num;
                flag = true;
            }
        }
        else {
            for(int i=0; i<m; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    DFS(L + 1, num * 10 + list.get(i));
                    check[i] = 0;
                }
            }
        }
    }
}

