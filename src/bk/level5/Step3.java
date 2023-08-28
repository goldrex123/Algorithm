package bk.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제번호 9086 : 문자열
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] str = new String[T];
        for (int i = 0 ; i < T; i++) {
            String inputStr = br.readLine();
            str[i] = inputStr.substring(0,1) + inputStr.substring(inputStr.length()-1);
        }

        Arrays.stream(str).forEach(x -> System.out.println(x));

    }
}
