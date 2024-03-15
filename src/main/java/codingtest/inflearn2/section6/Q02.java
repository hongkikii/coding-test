package main.java.codingtest.inflearn2.section6;

class Q02 {
    boolean[] check;
    int answer;
    boolean[][] isNotOk;
    public int solution(int[][] fight){
        answer = 0;
        check = new boolean[8];
        isNotOk = new boolean[8][8];
        for(int i=0; i<fight.length; i++) {
            isNotOk[fight[i][0]][fight[i][1]] = true;
            isNotOk[fight[i][1]][fight[i][0]] = true;
        }
        DFS(0, 0);
        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        System.out.println(T.solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
        System.out.println(T.solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
        System.out.println(T.solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
        System.out.println(T.solution(new int[][]{{1, 7}}));
        System.out.println(T.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
    }

    public void DFS(int idx, int sum) {
        if(sum==7) {
            answer++;
        }
        else {
            for(int i=1; i<=7; i++) {
                if(!check[i] && !isNotOk[idx][i]) {
                    check[i] = true;
                    DFS(i, sum+1);
                    check[i] = false;
                }
            }
        }
    }
}

