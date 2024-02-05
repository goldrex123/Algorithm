package bk.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제 번호 1010 : 다리 놓기
public class Step5 {
    public static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            token = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(token.nextToken());
            int M = Integer.parseInt(token.nextToken());

            sb.append(factorialDP(M,N)).append("\n");
        }

        System.out.println(sb);
    }

    public static int factorialDP(int M, int N) {
        if(dp[M][N] != 0) return dp[M][N];

        if(M == N || N == 0 ) {
            return 1;
        }
        return dp[M][N] = factorialDP(M-1, N-1) + factorialDP(M-1, N);
    }
}
