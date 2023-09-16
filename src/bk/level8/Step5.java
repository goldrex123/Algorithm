package bk.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2292 : 벌집
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int lastNum = 1;
        int mulNm = 1;
        if(N == 1) {
            System.out.println(1);
            System.exit(0);
        }

        while (true) {
            lastNum += 6 * mulNm;
            if(N <= lastNum) {
                System.out.println(mulNm + 1);
                break;
            }
            mulNm++;
        }
    }
}
