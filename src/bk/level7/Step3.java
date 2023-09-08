package bk.level7;
// 문제번호 10798 : 세로 읽기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < 5; i++) {
            words[i] = br.readLine();
        }
        int maxLength = Arrays.stream(words).mapToInt(x -> x.length()).max().getAsInt();

        for(int i = 0; i < maxLength; i++) {
            for(int j = 0; j < 5; j++) {
                if(words[j].length() <= (i)) {
                    continue;
                }
                sb.append(words[j].charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
