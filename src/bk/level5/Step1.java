package bk.level5;

import java.util.Scanner;

// 문제번호 27866 : 문자와 문자열
public class Step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = sc.nextInt();

        System.out.println(S.substring(i-1, i));

    }
}
