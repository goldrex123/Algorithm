package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문제 번호 2750 : 수 정렬하기
public class Step1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++ ) {
			numbers.add(Integer.parseInt(br.readLine()));
		}
		
		numbers.stream().sorted().forEach(x -> {
			System.out.println(x);
		});
	}
}