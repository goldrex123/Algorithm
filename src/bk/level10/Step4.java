package bk.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 15894 : 수학은 체육과목 입니다
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        System.out.println(4 * n);
        // 4->8->12->16->20->24
    }
}
