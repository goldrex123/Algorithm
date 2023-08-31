package bk.level5;

import java.util.Scanner;

// 문제번호 5622 : 다이얼
public class Step10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphaNum = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        char[] inputStr = sc.next().toCharArray();
        int totalTime = 0;

        for (char c : inputStr) {
            totalTime += alphaNum[c - 65];
        }
        System.out.println(totalTime);

    }
}
