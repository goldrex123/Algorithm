package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 27433 : 팩토리얼2
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         long N = Long.parseLong(br.readLine());

        System.out.println(factorial(N));
    }

    public static long factorial(long num) {
        if(num == 0 || num == 1) return 1;
        return num * factorial(num-1);
    }
}
