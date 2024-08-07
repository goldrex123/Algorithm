package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단오르기 : 2579 문제
public class Step8 {

    public static Integer[] dp;
    public static int[] stairArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        stairArr = new int[N + 1];
        dp = new Integer[N + 1];

        for (int i = 1; i <= N; i++) {
            stairArr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = stairArr[1];

        if (N >= 2) {
            dp[2] = stairArr[1] + stairArr[2];
        }

        System.out.println(downStair(N));
    }

    public static int downStair(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(downStair(N - 2), downStair(N - 3) + stairArr[N - 1]) + stairArr[N];
        }

        return dp[N];
    }
}
