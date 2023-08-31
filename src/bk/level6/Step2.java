package bk.level6;

import java.util.Scanner;

// 문제 번호 3003 : 킹,퀸,룩,비숍,나이트,폰
public class Step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int poon = sc.nextInt();

        System.out.print(1 - king + " ");
        System.out.print(1 - queen + " ");
        System.out.print(2 - look + " ");
        System.out.print(2 - bishop + " ");
        System.out.print(2 - knight + " ");
        System.out.print(8 - poon);
    }
}
