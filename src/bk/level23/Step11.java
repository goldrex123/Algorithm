package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 포도주 시식 - 2156 문제
public class Step11 {
    static int[] wineValue;
    static Integer[] dpArr;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        wineValue = new int[N + 1];
        dpArr = new Integer[N + 1];

        for (int i = 1; i <= N; i++) {
            wineValue[i] = Integer.parseInt(br.readLine());
        }

        dpArr[0] = 0;
        dpArr[1] = wineValue[1];

        if (N > 1) {
            dpArr[2] = wineValue[1] + wineValue[2];
        }

        System.out.println(dp(N));
    }

    static int dp(int depth) {
        if (dpArr[depth] == null) {
            dpArr[depth] = Math.max(Math.max(dp(depth-2), dp(depth-3)+ wineValue[depth-1]) + wineValue[depth], dp(depth-1));
        }

        return dpArr[depth];
    }
}
