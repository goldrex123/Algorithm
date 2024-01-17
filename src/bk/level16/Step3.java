package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 문제번호 9012 : 괄호
public class Step3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < T; i++) {
			String[] str = br.readLine().split("");
			boolean isVPS = true;
			for(int j = 0; j < str.length; j++) {
				if(str[j].equals("(")) {
					stack.push(str[j]);
				} else {
					if(stack.isEmpty()) {
						isVPS = false; 
						break;
					}
					stack.pop();
				}
			}
			
			if(!stack.isEmpty()) {
				isVPS = false;
				stack.clear();
			}
			
			sb.append(isVPS ? "YES" : "NO").append("\n");
		}
		System.out.println(sb.toString());
	}
}
