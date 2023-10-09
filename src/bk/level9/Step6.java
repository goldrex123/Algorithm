package bk.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문제번호 11653 : 소인수분해
public class Step6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<Integer>();

        if(N == 1) System.exit(0);

        for(int i = 2; i <= Math.sqrt(N); i++) {
            while(N % i == 0) {
                    numList.add(i);
                    N /= i;
                }
        }
        if(N != 1) numList.add(N);

        numList.stream().forEach(x -> System.out.println(x));
    }
}
