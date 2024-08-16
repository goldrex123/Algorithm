package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연속합 - 1912 문제
public class Step5 {

    static int[] numArr;
    static Integer[] dp;
    static int maxNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        dp = new Integer[N];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(token.nextToken());
        }

        dp[0] = numArr[0];
        maxNum = numArr[0];

        getMaxNum(N-1);
        System.out.println(maxNum);
    }

    static int getMaxNum(int depth) {
        if(dp[depth] == null) {
            dp[depth] = Math.max(getMaxNum(depth - 1) + numArr[depth], numArr[depth]);
            maxNum = Math.max(dp[depth], maxNum);
        }

        return dp[depth];
    }
}
