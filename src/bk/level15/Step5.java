package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 4134 : 다음 소수
public class Step5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());
			while(true) {
				boolean isPrime = true;
				if(num <= 1 ) num = 2;
				for(int j = 2; j <= Math.sqrt(num); j++) {
					if(num % j == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					sb.append(num + "\n");
					break;
				}
				num++;
			}
		}
		
		System.out.println(sb.toString());
	}

}

