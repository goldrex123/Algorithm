package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//정수 삼각형 - 1932
public class Step7 {

    static int[][] triangleValue;

    static Integer[][] dpArr;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        triangleValue = new int[N][N];
        dpArr = new Integer[N][N];

        StringTokenizer token;

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i ; j++) {
                triangleValue[i][j] = Integer.valueOf(token.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dpArr[N-1][i] = triangleValue[N-1][i];
        }

        System.out.println(dp(0, 0));
    }

    static int dp(int depth, int idx) {

        if(depth == N-1) {
            return dpArr[depth][idx];
        }

        if(dpArr[depth][idx] == null) {
            dpArr[depth][idx] = Math.max(dp(depth + 1, idx), dp(depth + 1, idx + 1)) + triangleValue[depth][idx];
        }

        return dpArr[depth][idx];
    }
}
