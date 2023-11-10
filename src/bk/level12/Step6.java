package bk.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2839 : 설탕 배달
public class Step6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int totalCnt = Integer.MAX_VALUE;
		for(int i = 0; 3*i <= N; i++) {
			for(int j = 0; 5*j <= N; j++) {
				if((3*i) + (5*j) == N) {
					totalCnt = Math.min(totalCnt, i+j);
				}
			}
		}
		
		System.out.println(totalCnt == Integer.MAX_VALUE ? -1 : totalCnt);
	}
}
