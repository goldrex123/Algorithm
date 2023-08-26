package bk.level4;
// 문제번호 10807 : 개수 세기

import java.util.Arrays;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] numArr = new int[N];
        for (int i = 0; i < N; i++){
            numArr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        System.out.println(Arrays.stream(numArr).filter(x -> x==v).count());
    }
}
