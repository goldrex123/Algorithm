package bk.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제번호 5086 : 배수와 약수
public class Step1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(token.nextToken());
			int num2 = Integer.parseInt(token.nextToken());
			
			if(num1 == 0 && num2 == 0) break;
			
			if(num2 % num1 == 0) System.out.println("factor");
			else if(num1 % num2 == 0) System.out.println("multiple");
			else System.out.println("neither");
		}
	}
}