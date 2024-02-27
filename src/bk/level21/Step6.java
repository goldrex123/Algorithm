package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제번호 2447 : 별 찍기 - 10
public class Step6 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        printStar(N, false);
        System.out.println(sb);
    }

    public static void printStar(int N, boolean blank) {
        if (blank) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(" ");
                }
            }
            return;
        }

        if (N == 1) {
            sb.append("*");
            return;
        }

        int size = N / 3;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count++;
                printStar(size, count == 5);
            }
            sb.append("\n");
        }

    }
}
