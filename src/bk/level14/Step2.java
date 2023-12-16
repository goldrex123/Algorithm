package bk.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 문제번호 14425 : 문자열 집합
public class Step2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer tokent = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tokent.nextToken());
		int M = Integer.parseInt(tokent.nextToken());
		int strCnt = 0;
		
		Map<String,Integer> words = new HashMap<String,Integer>();
		
		for(int i = 0; i < N; i ++) {
			words.put(br.readLine(), 0);	
		}
		
		for(int i = 0; i < M; i++) {
			if(words.containsKey(br.readLine())) {
				strCnt++;
			}
		}
		
		System.out.println(strCnt);
		
	}

}
