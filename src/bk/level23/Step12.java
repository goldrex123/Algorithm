package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 가장 긴 증가하는 부분 수열 - 11053 문제
public class Step12 {
    static int[] numArr;
    static Integer[] dpArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        numArr = new int[N];
        dpArr = new Integer[N];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(token.nextToken());
        }

        for (int i = 0; i < N; i++) {
            dp(i);
        }

        int max = Arrays.stream(dpArr).mapToInt(Integer::intValue).max().orElse(0);

        System.out.println(max);
    }

    static int dp(int depth) {
        if (dpArr[depth] == null) {
            dpArr[depth] = 1;

            for (int i = depth-1; i >= 0; i--) {
                if(numArr[depth] > numArr[i]) {
                    dpArr[depth] = Math.max(dp(i)+1, dpArr[depth]);
                }
            }
        }

        return dpArr[depth];
    }
}
