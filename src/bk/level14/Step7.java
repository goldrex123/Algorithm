package bk.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 문제번호 1269 : 대칭 차집합
public class Step7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(token.nextToken());
		int B = Integer.parseInt(token.nextToken());
		
		Set<Integer> ASet = new HashSet<>();
		Set<Integer> BSet = new HashSet<>();
		
		int cnt = A;
		
		String[] aNum = br.readLine().split(" ");
		for(int i = 0; i < A; i++) {
			ASet.add(Integer.parseInt(aNum[i]));
		}
		
		String[] bNum = br.readLine().split(" ");
		for(int i = 0; i < B; i++) {
			if(ASet.contains(Integer.parseInt(bNum[i]))) {
				cnt--;
			} else {
				cnt++;
			}
			
//			BSet.add(Integer.parseInt(bNum[i]));
		}
		
		System.out.println(cnt);
		
//		System.out.println(ASet.stream().filter(x -> !BSet.contains(x)).count() + BSet.stream().filter(x -> !ASet.contains(x)).count());
	}
}
