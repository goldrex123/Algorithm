package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 문제번호 1427 : 소트인사이드
public class Step6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		while(N != 0) {
			numbers.add(N % 10);
			N /= 10;
		}
		
		numbers.sort(Comparator.reverseOrder());
		
		numbers.stream().forEach(x -> {
			System.out.print(x);
		});
	}
}
