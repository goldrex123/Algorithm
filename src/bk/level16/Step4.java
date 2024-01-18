package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 문제번호 4949 : 균형잡힌 세상
public class Step4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			
			String[] inputStr = str.split("");
			Stack<String> stack = new Stack<>();
			boolean isBalance = true;
			for(int i = 0; i < inputStr.length; i++) {
				if(inputStr[i].equals("(") || inputStr[i].equals("[")) {
					stack.push(inputStr[i]);
				} else if(inputStr[i].equals(")")) {
					if(stack.isEmpty() || !stack.pop().equals("(")) {
						isBalance = false;
						break;
					}
				}  else if(inputStr[i].equals("]")) {
					if(stack.isEmpty() ||!stack.pop().equals("[") ) {
						isBalance = false;
						break;
					}
				}
			}
			
			if(!stack.isEmpty()) isBalance = false;
			sb.append(isBalance ? "yes" : "no").append("\n"); 
			
		}
		
		System.out.println(sb.toString());
	}

}
