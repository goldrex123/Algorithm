package bk.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문제번호 2581 : 소수
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> primeList = new ArrayList<Integer>();
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean isPrime = true;
        for(int i = M ; i <=N; i++) {
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(i == 1) continue;
            if (isPrime) primeList.add(i);
            isPrime = true;
        }

        if(primeList.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(primeList.stream().mapToInt(Integer::intValue).sum());
            System.out.println(primeList.get(0));
        }
    }
}