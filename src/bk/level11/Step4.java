package bk.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 24265 : 알고리즘 수업 - 알고리즘의 수행 시간 4
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        //1~n-1 까지의 합
        System.out.println(((n-1)*n) / 2);
        System.out.println(2);

    }
}
