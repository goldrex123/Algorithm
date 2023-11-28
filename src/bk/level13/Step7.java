package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제번호 11650 : 좌표 정렬하기
public class Step7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] pos = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			String inputStr[] = br.readLine().split(" ");
			
			pos[i][0] = Integer.parseInt(inputStr[0]);
			pos[i][1] = Integer.parseInt(inputStr[1]);
		}
		
		Arrays.sort(pos, (a,b) -> {
			if(a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return a[0] - b[0];
			}
		});
		
		StringBuffer sb =new StringBuffer();
		
		for(int[] value : pos) {
			sb.append(value[0] + " ");
			sb.append(value[1] + "\n");
		}
		
		System.out.println(sb.toString());
	}
}
