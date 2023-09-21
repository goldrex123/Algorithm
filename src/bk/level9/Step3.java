package bk.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 문제번호 9506 : 약수들의 합
public class Step3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
	
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) break;
			
			for(int i = 1; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					list.add(i);
					if(n/i != i && n/i != n) {
						list.add(n/i);
					}
				}
			}
			
			list.sort(Comparator.naturalOrder());
			boolean isPerfect = list.stream().mapToInt(Integer::intValue).sum() == n;
			
			if(isPerfect) {
				System.out.print(n + " = ");
				list.forEach(x -> {
					if(x == list.get(list.size()-1)) {
						System.out.println(x);
					} else {
						System.out.print(x + " + ");
					}
				});
			} else {
				System.out.println(n + " is NOT perfect.");
			}
			
			list.clear();
		}
	}
}
