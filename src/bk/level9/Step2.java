package bk.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// 문제번호 2501 : 약수 구하기
public class Step2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		
		int cnt = 0;
		for(int i = 1; i <= Math.sqrt(N); i++) {
			if(N % i == 0) {
				list.add(i);
				cnt++;
				if(N / i != i) {
					list.add(N/i);
					cnt++;
				}
			}
		}
		
		Collections.sort(list);
//		Comparator.naturalOrder();
		System.out.println(K>list.size() ? 0 : list.get(K-1));
	}
}

