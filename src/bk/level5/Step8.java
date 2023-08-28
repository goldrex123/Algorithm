package bk.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제번호 1152 : 단어의 개수
// split을 사용했을 때 공백만 입력할 경우 length 가 1로 나옴!
public class Step8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(inputStr, " ");

        System.out.println(st.countTokens());
    }
}
