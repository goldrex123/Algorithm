package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 4948 : 베르트랑 공준
public class Step7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] notPrime;
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int primeCnt = 0;
			if(n == 0) {
				System.out.println(sb.toString());
				break;
			}
			
			notPrime = new boolean[2*n + 1];
			notPrime[1] = true;
			
			for(int i = 2; i < 2*n+1; i++) {
				if(notPrime[i]) continue;
				if(i > n) primeCnt++;
				for(int j = i+i; j < 2*n+1; j+=i) {
					notPrime[j] = true;
				}
			}
			
			sb.append(primeCnt).append("\n");
		}
	}
}
