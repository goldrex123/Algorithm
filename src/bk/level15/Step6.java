package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 1929 : 소수 구하기 (에라토스테네스의 체)
public class Step6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(token.nextToken());
		int N = Integer.parseInt(token.nextToken());
		
		boolean[] notPrime = new boolean[N+1];
		StringBuffer sb = new StringBuffer();
		
		notPrime[1] = true;
		
		for(int i = 2; i <= N; i++) {
			if(notPrime[i]) continue;
			
			if(i >= M) sb.append(i).append("\n");
			for(int j = i+i; j <= N; j+=i) {
				notPrime[j] = true;
			}
		}
		
		System.out.println(sb.toString());
	}

}


