package bk.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 문제번호 1037 : 약수
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer token = new StringTokenizer(br.readLine());
        List<Integer> prime = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            prime.add(Integer.parseInt(token.nextToken()));
        }

        int min = prime.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = prime.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(min * max);
    }
}
