package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 1735 : 분수 합
public class Step3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//numerator denominator
		int numerator1 , numerator2, denominator1, denominator2, newDenominator, newNumerator;
		StringTokenizer token;
		token = new StringTokenizer(br.readLine());
		numerator1 = Integer.parseInt(token.nextToken());
		denominator1 = Integer.parseInt(token.nextToken());
		
		token = new StringTokenizer(br.readLine());
		numerator2 = Integer.parseInt(token.nextToken());
		denominator2 = Integer.parseInt(token.nextToken());
		
		newNumerator = numerator1 * denominator2 + numerator2 * denominator1;
		newDenominator = denominator1 * denominator2;
		
		int gcd = getGcd(Math.max(newNumerator,newDenominator), Math.min(newNumerator,newDenominator));
		
		System.out.println(newNumerator / gcd + " " + newDenominator / gcd);
	}	
	
	static int getGcd(int num1, int num2) {
		if(num2 == 0) return num1;
		return getGcd(num2, num1%num2);
	}
}