package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//24416 문제 - 알고리즘 수업 - 피보나치 수 1
public class Step1 {

    static int recursiveCnt = 0;

    static int dpCnt = 0;

    static int[] fibonacci;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        fibonacci = new int[N + 1];

        recursive(N);
        dp(N);

        System.out.println(recursiveCnt + " " + dpCnt);
    }

    static int recursive(int N) {
        if (N == 1 || N == 2) {
            recursiveCnt++;
            return 1;
        } else {
            return recursive(N - 1) + recursive(N - 2);
        }
    }


    static int dp(int N) {
        if (N == 1 || N == 2) {
            fibonacci[N] = 1;
        } else {
            for (int i = 3; i <= N; i++) {
                dpCnt++;
                fibonacci[N] = fibonacci[N - 1] + fibonacci[N - 2];
            }
        }

        return fibonacci[N];
    }
}
