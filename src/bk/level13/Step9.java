package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 문제번호 1181 : 단어 정렬
public class Step9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<String> words = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			words.add(br.readLine());
		}
		Collections.sort(words, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
			
		});
		
//		Collections.sort(words, (String o1,String o2) -> {
//			return o1.length();
//		});
		
		words.stream().distinct().forEach(x -> {
			System.out.println(x);
		});
		
	}
}
