package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제번호 2751 : 수 정렬하기 2
public class Step4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(numbers);
		
		StringBuffer sb = new StringBuffer();
		
		for(int value : numbers) {
			sb.append(value + "\n");
		}
		System.out.println(sb.toString());
		
	}
}
