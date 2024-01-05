package bk.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//문제번호 2485 : 가로수
public class Step4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N];
		List<Integer> distance = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(br.readLine());
			if(i != 0) distance.add(tree[i] - tree[i-1]);
		}

		int gcd = distance.get(0);
		for(int i = 1; i < distance.size(); i++) {
			// N개의 숫자 공통 최대공약수를 구함
			gcd = getGcd(Math.max(gcd,distance.get(i)), Math.min(gcd,distance.get(i)));
		}
		System.out.println((tree[N-1] - tree[0]) / gcd + 1 - N);
	}
	
	static int getGcd(int num1, int num2) {
		if(num2 == 0) return num1;
		return getGcd(num2, num1%num2);
	}

}
