package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

// 문제번호 10773 : 제로
public class Step2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		
		int sum = 0;
		Iterator<Integer> iter = stack.iterator();
		while(iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println(sum);
	}
}
