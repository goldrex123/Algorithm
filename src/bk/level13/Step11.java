package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// 문제번호 18870 : 좌표 압축
public class Step11 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> pos = new ArrayList<Integer>();
		Map<Integer,Integer> result = new HashMap<Integer,Integer>();
		List<Integer> sortedPos;
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			pos.add(Integer.parseInt(token.nextToken())); 
		}
		
		sortedPos = pos.stream().distinct().sorted().collect(Collectors.toList());

		for(int i = 0; i < sortedPos.size(); i++) {
			if(!result.containsKey(sortedPos.get(i))) {
				result.put(sortedPos.get(i), i);
			}
		}
		
		
		StringBuffer sb = new StringBuffer();
		
		for(int value : pos) {
			sb.append(result.get(value) + " ");
		}
		
		System.out.println(sb.toString());
	}

}
 