package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 10989 : 수 정렬하기 3
// Counting sort -> O(n + K) / 수의 범위가 크면 메모리 낭비가 심하다
public class Step5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int numbers[] = new int[N];
		int result[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		int counting[] = new int[10001];
		
		//counting 배열 생성
		for(int i = 0; i < N; i++) {
			counting[numbers[i]]++;
		}
		
		//counting 배열 누적합으로 변경
		for(int i = 1; i < 10001; i++) {
			counting[i] = counting[i] + counting[i-1]; 
		}
		
		//result 베열 생성
		for(int i = N-1; i >= 0; i--) {
			counting[numbers[i]]--;
			result[counting[numbers[i]]] = numbers[i];
		}
		
		StringBuffer sb = new StringBuffer();
		for(int value : result) {
			if(value != 0) sb.append(value + "\n");
		}
		System.out.println(sb.toString());
		
	}
}
