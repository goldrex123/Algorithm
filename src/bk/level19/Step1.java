package bk.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제번호 15439 : 베라의 패션
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(N * (N-1));
    }
}
