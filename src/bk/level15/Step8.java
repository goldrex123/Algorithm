package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 문제번호 17103 : 골드바흐 파티션
public class Step8 {
	public static boolean[]	notPrime = new boolean[1000001];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 2; i < Math.sqrt(notPrime.length); i++) {
			if(notPrime[i]) continue;
			
			for(int j = i+i; j < notPrime.length; j+=i) {
				notPrime[j] = true;
			}
		}
	
		for(int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for(int j = 2; j < notPrime.length; j++) {
				if(j > num/2) break;
				if(!notPrime[j] && !notPrime[num-j]) {
					cnt++;
				}
			}
			
			sb.append(cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}

}
