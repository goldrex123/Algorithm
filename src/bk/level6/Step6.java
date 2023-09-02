package bk.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2941 : 크로아티아 알파벳
public class Step6 {
    public static void main(String[] args) throws IOException {
        String[] cAlpha = {"dz=", "c=" , "c-", "d-", "lj", "nj", "s=", "z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (String s1 : cAlpha) {
            s = s.replace(s1 , "?");
        }

        System.out.println(s.length());
    }
}
