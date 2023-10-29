package bk.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 24267 : 알고리즘 수업 - 알고리즘의 수행 시간 6
public class Step6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        System.out.println(((n-2) * (n-1) * n) / 6);
        System.out.println(3);
    }
}
