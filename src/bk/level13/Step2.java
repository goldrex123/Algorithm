package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제번호 2587 : 대표값2
public class Step2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}
		
		int avg = numbers.stream().mapToInt(Integer::intValue).sum() / 5;
		Collections.sort(numbers);
		System.out.println(avg);
		System.out.println(numbers.get(2));
	}
}
