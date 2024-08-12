package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 9184 문제 -> 신나는 함수 실행
public class Step2 {
    static Integer[][][] dp = new Integer[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();
        while (true) {
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            if(a == -1 && b == -1 && c == -1) {
                break;
            }

            dp[0][0][0] = 1;

            sb.append("w(")
                    .append(a)
                    .append(", ")
                    .append(b)
                    .append(", ")
                    .append(c)
                    .append(") = ")
                    .append(w(a, b, c))
                    .append("\n");
        }

        System.out.println(sb);
    }

    static int w(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) return 1;
        else if(a > 20 || b > 20 || c > 20) return w(20,20,20);
        else if(a < b  && b < c) {
            if(dp[a][b][c] == null) {
                dp[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
            }
        } else {
            if(dp[a][b][c] == null) {
                dp[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
            }
        }

        return dp[a][b][c];
    }
}
