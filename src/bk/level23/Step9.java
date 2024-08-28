package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1로 만들기 - 1463 문제
public class Step9 {
    static Integer[] dpArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dpArr = new Integer[N+1];
        dpArr[0] = dpArr[1] = 0;

        System.out.println(dp(N));
    }

    public static int dp(int N) {

        if(dpArr[N] == null ) {
            if(N % 2 == 0 && N % 3 == 0) {
                dpArr[N] = Math.min(dp(N/3) , Math.min(dp(N / 2), dp(N -1 ))) + 1;
            } else if(N % 3 == 0) {
                dpArr[N] = Math.min(dp(N/3), dp(N-1)) + 1;
            } else if(N % 2 == 0) {
                dpArr[N] = Math.min(dp(N/2), dp(N-1)) + 1;
            } else {
                dpArr[N] = dp(N-1) + 1;
            }
        }

        return dpArr[N];
    }
}
