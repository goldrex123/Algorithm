package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 1934 : 최소공배수
public class Step1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer token;
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < T; i++) {
			token = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			
			int big = Math.max(a, b);
			int small = Math.min(a, b);
			int tmp = 0;
			while(true) {
				if(big % small != 0) {
					tmp = big % small;
					big = small;
					small = tmp;
				} else {
					tmp = small;
					break;
				}
			}
			
			sb.append((a*b / tmp) + "\n");
			
		}
		
		System.out.println(sb.toString());
	}

}
