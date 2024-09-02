package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가장 긴 바이토닉 부분 수열 - 11054 문제
public class Step13 {

    static int[] numArr;
    static Integer[] l_dp;
    static Integer[] r_dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        l_dp = new Integer[N];
        r_dp = new Integer[N];

        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(token.nextToken());
        }

        for (int i = 0; i < N; i++) {
            LIS(i);
            LDS(i);
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(r_dp[i] + l_dp[i], max);
        }

        System.out.println(max-1);
    }

    static int LIS(int depth) {
        if (r_dp[depth] == null) {
            r_dp[depth] = 1;

            for (int i = depth - 1; i >= 0; i--) {
                if (numArr[i] < numArr[depth]) {
                    r_dp[depth] = Math.max(r_dp[depth], LIS(i) + 1);
                }
            }

        }
        return r_dp[depth];
    }

    static int LDS(int depth) {
        if (l_dp[depth] == null) {
            l_dp[depth] = 1;

            for (int i = depth + 1; i < r_dp.length; i++) {
                if (numArr[i] < numArr[depth]) {
                    l_dp[depth] = Math.max(l_dp[depth], LDS(i) + 1);
                }
            }

        }
        return l_dp[depth];
    }
}
