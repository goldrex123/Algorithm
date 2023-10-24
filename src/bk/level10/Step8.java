package bk.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 문제번호 14215 : 세 막대
public class Step8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] numArr = new int[3];
        for(int i = 0; i < 3; i++) {
            numArr[i] = Integer.parseInt(token.nextToken());
        }
        Arrays.sort(numArr);

        if(numArr[0] + numArr[1] > numArr[2]) {
            System.out.println(numArr[0] + numArr[1] + numArr[2]);
        } else {
            System.out.println((numArr[0] + numArr[1]) * 2 - 1);
        }
    }
}
