package bk.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제번호 9663 : N-Queen
public class Step5 {
    static int N;
    static int[] queenPos;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        queenPos = new int[N];

        dfs(0);

        System.out.println(count);
    }

    static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        // depth : 행 , i : 열
        for (int i = 0; i < N; i++) {
            queenPos[depth] = i;
            if (possible(depth, i)) {
                dfs(depth + 1);
            }
        }
    }

    static boolean possible(int row, int col) {
        for (int i = 0; i < row; i++) {
            //대각선에 있을 때
            if (Math.abs(col - queenPos[i]) == Math.abs(row - i)) {
                return false;
            }

            // 같은 열에 있을때
            if (queenPos[i] == col) {
                return false;
            }
        }

        return true;
    }

}
