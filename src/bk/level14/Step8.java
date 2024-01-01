package bk.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 문제번호 11478 : 서로 다른 부분 문자열 개수
public class Step8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		Set<String> str = new HashSet<String>();
		
		for(int i = 0; i < S.length(); i++) {
			for(int j = i+1; j <= S.length(); j++) {
				str.add(S.substring(i,j));
			}
		}
		
		System.out.println(str.size());
	}

}
