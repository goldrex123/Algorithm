package bk.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 1193 : 분수 찾기
public class Step6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int line = 1;
        int rangeNum = 1;
        while(rangeNum < X) {
            line++;
            rangeNum += line;
        }

        int firstNum = rangeNum - line + 1;
        int Xnum = X - firstNum + 1;

        if(line%2 == 0) {
            System.out.println((1 + Xnum-1) +"/"+(line-Xnum+1));
        } else {
            System.out.println((line-Xnum+1) +"/"+(1 + Xnum-1));
        }
    }
}
