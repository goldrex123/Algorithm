package bk.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2720 : 세탁소 사장 동혁
public class Step3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			System.out.print(C / 25 + " ");
			C %= 25;
			System.out.print(C / 10 + " ");
			C %= 10;
			System.out.print(C / 5 + " "); 
			C %= 5;
			System.out.print(C / 1);
			
			System.out.println();
		}
		
	}
}
