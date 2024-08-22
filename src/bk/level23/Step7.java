package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//정수 삼각형 - 1932
public class Step7 {

    static int[][] triangleValue;

    static Integer[] dpArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        triangleValue = new int[N][N];
        dpArr = new Integer[N];

        StringTokenizer token;

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i ; j++) {
                triangleValue[i][j] = Integer.valueOf(token.nextToken());
            }
        }

        dpArr[0] = triangleValue[0][0];

        dp(N - 1);
    }

    static int dp(int depth) {

        if(dpArr[depth] == null) {
            
        }

        return dpArr[depth];
    }
}
