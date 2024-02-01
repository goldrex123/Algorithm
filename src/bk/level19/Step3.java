package bk.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 10872 : 팩토리얼
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
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
