package bk.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 11050 : 이항 계수1
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        int sum = 1;
        for (int i = N; i >= N-K+1; i--) {
            sum *= i;
        }
        System.out.println(sum / factorial(K));
    }

    public static int factorial(int num) {
        if(num == 0) {
            return 1;
        } else if(num == 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
