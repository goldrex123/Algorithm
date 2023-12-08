package bk.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// 문제번호 10815 : 숫자 카드
public class Step1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> cards = new ArrayList<Integer>();
		Map<Integer, Integer> checkNum = new LinkedHashMap<Integer,Integer>();
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		while(token.hasMoreTokens()) {
			cards.add(Integer.parseInt(token.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] checkingCards = br.readLine().split(" ");
		for(int i = 0; i < M; i++) {
			int checkCardNum = Integer.parseInt(checkingCards[i]);
			checkNum.put(checkCardNum, 0);
		}
		
		cards.stream().forEach(x -> {
			if(checkNum.containsKey(x)) {
				checkNum.put(x, 1);
			}
		});
		
		
		StringBuffer sb = new StringBuffer();
		for(Integer key : checkNum.keySet()) {
			sb.append(checkNum.get(key) + " ");
		}
		System.out.println(sb.toString());
		
	}
}
