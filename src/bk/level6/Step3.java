package bk.level6;

import java.util.Scanner;

//문제번호 2444 : 별찍기 -7
public class Step3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i =1; i <= N ; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = N-1; i >= 1; i--) {
            for(int j = 0; j < N-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
