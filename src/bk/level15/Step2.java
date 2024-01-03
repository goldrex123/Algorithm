package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 13241 : 최소공배수
public class Step2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(token.nextToken());
		long B = Long.parseLong(token.nextToken());
		
		long gcd = getGcd(A,B);		
		
		System.out.println(A*B / gcd);
	}
	
	static Long getGcd(Long A, Long B) {
		long tmp = 0L;
		
		while(true) {
			if(B % A != 0) {
				tmp = B % A;
				B = A;
				A = tmp;
			} else {
				tmp = A;
				break;
			}
		}
		
		return tmp;
	}

}
