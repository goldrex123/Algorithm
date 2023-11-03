package bk.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 19532 : 수학은 비대면강의입니다.
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(token.nextToken());
        int d = Integer.parseInt(token.nextToken());
        int e = Integer.parseInt(token.nextToken());
        int f = Integer.parseInt(token.nextToken());

        for(int x = -999; x <=999; x++) {
            for(int y = -999; y <= 999; y++) {
                if(a * x + b * y == c && d*x + e*y == f) {
                    System.out.println(x + " " + y);
                    System.exit(0);
                }
            }
        }
    }
}
