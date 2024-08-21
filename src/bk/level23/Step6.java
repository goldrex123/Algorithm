package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// RGB 거리 - 1149 문제
public class Step6 {
    static int[][] rgbValue;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        rgbValue = new int[N][3];
        dp = new Integer[N][3];

        StringTokenizer token;

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            rgbValue[i][0] = Integer.parseInt(token.nextToken());
            rgbValue[i][1] = Integer.parseInt(token.nextToken());
            rgbValue[i][2] = Integer.parseInt(token.nextToken());
        }

        //빨강
        dp[0][0] = rgbValue[0][0];
        //초록
        dp[0][1] = rgbValue[0][1];
        //파랑
        dp[0][2] = rgbValue[0][2];

        int red = paintHouse(N - 1, 0);
        int green = paintHouse(N - 1, 1);
        int blue = paintHouse(N - 1, 2);

        System.out.println(Math.min(blue,Math.min(red,green)));
    }

    static int paintHouse(int depth, int color) {
        if(dp[depth][color] == null) {
            if(color == 0) {
                dp[depth][color] = Math.min(paintHouse(depth-1, 1), paintHouse(depth-1, 2)) + rgbValue[depth][0];
            } else if(color == 1) {
                dp[depth][color] = Math.min(paintHouse(depth-1, 0), paintHouse(depth-1, 2)) + rgbValue[depth][1];
            } else {
                dp[depth][color] = Math.min(paintHouse(depth-1, 0), paintHouse(depth-1, 1)) + rgbValue[depth][2];
            }
        }

        return dp[depth][color];
    }
}
