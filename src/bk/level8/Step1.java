package bk.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 2745 : 진법 변환
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        char[] N = tokenizer.nextToken().toCharArray();
        int B = Integer.parseInt(tokenizer.nextToken());

        int resultNum = 0;
        for(int i = N.length-1; i >= 0; i--) {
            if(String.valueOf(N[i]).matches("[A-Z]")) {
                resultNum += num[N[i]-65] * Math.pow(B,N.length-1-i);
            } else {
                resultNum += Character.getNumericValue(N[i]) * Math.pow(B,N.length-1-i);
            }
        }
        System.out.println(resultNum);
    }
}
