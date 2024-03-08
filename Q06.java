import java.util.Scanner;

public class Q06 {
    static int N;
    static int M;
    static int[] A;
    static boolean[] checkA;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        checkA = new boolean[N];
        int[] answer = new int[M];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        DFS(answer, 0);
    }

    public static void DFS(int[] answer, int count) {
        if(count == M) {
            print(answer);
        }
        else {
            for(int i=0; i<N; i++) {
                if(!checkA[i]) {
                    answer[count] = A[i];
                    checkA[i] = true;
                    DFS(answer, count+1);
                    checkA[i] = false;
                }
            }
        }
    }

    public static void print(int[] answer) {
        for(int v : answer) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
