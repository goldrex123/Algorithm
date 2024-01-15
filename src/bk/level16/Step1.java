package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

// 문제번호 28278 : 스택 2
public class Step1 {
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 int N = Integer.parseInt(br.readLine());
		 StringBuffer sb = new StringBuffer();
		 for(int i = 0; i < N; i++) {
			 String[] inputOrder = br.readLine().split(" ");
			 
			switch (inputOrder[0]) {
			case "1":
				stack.add(Integer.parseInt(inputOrder[1]));
				break;
			case "2":
				try {
					sb.append(stack.pop()).append("\n");
				} catch(EmptyStackException e) {
					sb.append("-1").append("\n");
				}
				break;
			case "3":
				sb.append(stack.size()).append("\n");
				break;
			case "4":
				if(stack.isEmpty()) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "5":
				try {
					sb.append(stack.peek()).append("\n");
				} catch(EmptyStackException e) {
					sb.append("-1").append("\n");
				}
				break;
			}
		 }
		 
		 System.out.println(sb.toString());
	}
}
