package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 25501 : 재귀의 귀재
public class Step3 {
    public static int recurCnt = 0;
    public static int recursion(String s, int l, int r){
        recurCnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            sb.append(isPalindrome(str)).append(" " + recurCnt).append("\n");
            recurCnt = 0;
        }

        System.out.println(sb);
    }
}

