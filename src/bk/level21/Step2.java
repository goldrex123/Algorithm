package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 10870 : 피보나치 수 5
public class Step2 {
    public static long[] fibonacciNum = new long[100+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(N));
    }

    public static long fibonacci(int num) {
        if(num == 0) return 0;
        if(num == 1 || num == 2) return 1;

        if(fibonacciNum[num] != 0) return fibonacciNum[num];

        return fibonacciNum[num] = fibonacci(num-1) + fibonacci(num -2);

    }
}
