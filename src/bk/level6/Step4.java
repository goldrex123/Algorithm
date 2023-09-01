package bk.level6;

import java.util.Scanner;

// 문제번호 10988 : 팰린드롬인지 확인하기
public class Step4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		
		char[] a = inputStr.toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != a[a.length-1-i]) {
				System.out.print(0);
				System.exit(0);
			}
		}
		System.out.println(1);
		
	}

}
