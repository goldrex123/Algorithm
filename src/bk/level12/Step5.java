package bk.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 1436 : 영화감독 숌
public class Step5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int number = 666;	
		while(true) {
			if(String.valueOf(number).contains("666")) {
				N--;
				if(N == 0) break;
			}
			number++;
		}
		
		System.out.println(number);
	}
}
