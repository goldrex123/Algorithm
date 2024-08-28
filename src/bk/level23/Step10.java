package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 쉬운 계단 수 - 10844 문제
public class Step10 {

    static Long[][] dpArr;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dpArr = new Long[N+1][10];

        for (int i = 0; i < 10; i++) {
            dpArr[1][i] = 1L;
        }

        long result = 0L;
        for (int i = 1; i <= 9; i++) {
            result += dp(N, i);
        }

        System.out.println(result % 1000000000);
    }

    static long dp(int depth, int value) {
        if(depth == 1) {
            return dpArr[depth][value];
        }

        if(dpArr[depth][value] == null) {
            if(value == 0) {
                dpArr[depth][value] = dp(depth-1, value+1);
            } else if(value == 9) {
                dpArr[depth][value] = dp(depth-1, value-1);
            } else {
                dpArr[depth][value] = dp(depth-1, value+1) + dp(depth-1, value-1);
            }
        }

        return dpArr[depth][value] % 1000000000;
    }
}
