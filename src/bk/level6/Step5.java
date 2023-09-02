package bk.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 1157 : 단어 공부
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphaNum = new int[26];
        char[] cArr = br.readLine().toUpperCase().toCharArray();

        for (char c : cArr) {
            ++alphaNum[(int)c - 65];
        }

        int maxNum = 0;
        char s = ' ';
        for(int i = 0; i < alphaNum.length; i++) {
            if (alphaNum[i] > maxNum) {
                maxNum = alphaNum[i];
                s = (char)('A' + i);
            } else if (alphaNum[i] == maxNum){
                s = '?';
            }
        }

        System.out.println(s);

    }
}
