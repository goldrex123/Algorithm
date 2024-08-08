package bk.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 끼워넣기 - 14888 문제
public class Step7 {

    static int maxValue = Integer.MIN_VALUE;
    static int minValue = Integer.MAX_VALUE;
    static int[] numberArr;
    static int[] operatorArr = new int[4];
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        N = Integer.parseInt(br.readLine());

        numberArr = new int[N];
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numberArr[i] = Integer.parseInt(token.nextToken());
        }

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operatorArr[i] = Integer.parseInt(token.nextToken());
        }

        operating(0, numberArr[0]);
        System.out.println(maxValue);
        System.out.println(minValue);
    }

    public static void operating(int depth, int value) {
        if(depth == N-1) {
            maxValue = Math.max(value, maxValue);
            minValue = Math.min(value, minValue);
            return;
        }


        for (int i = 0; i < 4; i++) {
            if(operatorArr[i] > 0) {
                operatorArr[i]--;

                switch (i) {
                    case 0:
                        operating(depth+1, value + numberArr[depth+1]);
                        break;
                    case 1:
                        operating(depth+1, value - numberArr[depth+1]);
                        break;
                    case 2:
                        operating(depth+1, value * numberArr[depth+1]);
                        break;
                    case 3:
                        operating(depth+1, value / numberArr[depth+1]);
                        break;
                }

                operatorArr[i]++;
            }
        }

    }
}
