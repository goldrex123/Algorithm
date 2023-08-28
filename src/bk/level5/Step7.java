package bk.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제번호 2675 : 문자열 반복
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String result[] = new String[T];

        for(int i = 0; i < T; i++) {
            String input = br.readLine();
            int R = Integer.parseInt(input.split(" ")[0]);
            String S = input.split(" ")[1];

            StringBuffer sb = new StringBuffer();
            Arrays.stream(S.split("")).forEach(x -> sb.append(x.repeat(R)));
            result[i] = sb.toString();
        }

        Arrays.stream(result).forEach(x -> System.out.println(x));

    }
}
