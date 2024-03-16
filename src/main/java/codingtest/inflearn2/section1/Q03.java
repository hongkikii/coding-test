package main.java.codingtest.inflearn2.section1;

class Q03 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] board){
        int answer = 0;
        int personX = 0;
        int personY = 0;
        int dogX = 0;
        int dogY = 0;
        boolean findPerson = false;
        boolean findDog = false;
        int personD = 0;
        int dogD = 0;
        int count = 0;
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(board[i][j] == 2) {
                    personX = i;
                    personY = j;
                    findPerson = true;
                    if(findDog) break;
                }
                if(board[i][j] == 3) {
                    dogX = i;
                    dogY = j;
                    findDog = true;
                    if(findPerson) break;
                }
            }
            if(findDog && findPerson) break;
        }
        while(true) {
            if(count>10000) break;
            if(personX == dogX && personY == dogY) return count;
            int nextPersonX = personX + dx[personD];
            int nextPersonY = personY + dy[personD];
            int nextDogX = dogX + dx[dogD];
            int nextDogY = dogY + dy[dogD];
            if(nextPersonX < 0 || nextPersonX >= 10 || nextPersonY < 0 || nextPersonY >=10 || board[nextPersonX][nextPersonY] == 1) {
                personD = (personD+1) % 4;
            }
            else {
                personX = nextPersonX;
                personY = nextPersonY;
            }
            if(nextDogX < 0 || nextDogX >= 10 || nextDogY < 0 || nextDogY >=10 || board[nextDogX][nextDogY] == 1) {
                dogD = (dogD+1) % 4;
            }
            else {
                dogX = nextDogX;
                dogY = nextDogY;
            }
            count++;
        }
        return answer;
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}

