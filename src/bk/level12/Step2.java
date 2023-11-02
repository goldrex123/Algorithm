package bk.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2231 : 분해합
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            int sum = 0;
            int number = i;

            while(true) {
                sum += (number % 10);
                if(number < 10) {
                    break;
                }
                number /= 10;
            }
            sum += i;
            if(sum == N) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
