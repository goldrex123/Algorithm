package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 파도반 수열 - 9461 문제
public class Step4 {

    static Long[] triangle = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        triangle[1] = 1L;
        triangle[2] = 1L;
        triangle[3] = 1L;
        triangle[4] = 2L;
        triangle[5] = 2L;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            sb.append(dp(N)).append("\n");
        }

        System.out.println(sb);
    }

    static long dp(int depth) {
        if(triangle[depth] == null) {
            triangle[depth] = dp(depth-5) + dp(depth-1);
        }
        return triangle[depth];
    }
}