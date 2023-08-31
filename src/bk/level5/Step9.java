package bk.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 번호 2908 : 상수
public class Step9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputStr = br.readLine().split(" ");

        String A = inputStr[0];
        String B = inputStr[1];

        int reverseA = Integer.parseInt(A.substring(2) + A.substring(1,2) + A.substring(0,1));
        int reverseB = Integer.parseInt(B.substring(2) + B.substring(1,2) + B.substring(0,1));

        if(reverseA > reverseB) System.out.println(reverseA);
        else System.out.println(reverseB);
    }
}
