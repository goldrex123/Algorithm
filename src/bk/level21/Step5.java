package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 4779 : 칸토어 집합
public class Step5 {
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = br.readLine()) != null ) {
            int N = Integer.parseInt(str);
            sb = new StringBuilder();

            for(int i =1; i <=Math.pow(3,N); i++) {
                sb.append("-");
            }

            cantorian(0, sb.length());
            System.out.println(sb);
        }
    }

    public static void cantorian(int start, int size) {
        if(size == 1) return;
        int part = size / 3;

        for (int i = start+part; i < start+part*2; i++) {
            sb.setCharAt(i,' ');
        }

        cantorian(start, part);
        cantorian(start+part * 2, part);
    }
}
