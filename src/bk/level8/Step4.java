package bk.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2903 : 중앙 이동 알고리즘
public class Step4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int firstDotCnt = 2;
		
		for(int i = 0; i<N; i++) {
			firstDotCnt += Math.pow(2, i);
		};
		
		System.out.println((int)Math.pow(firstDotCnt, 2));
	}
}
