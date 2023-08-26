package bk.level3;
// 문제번호 25314 : 코딩은 체육과목입니다.

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < N/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb.toString());
    }
}
