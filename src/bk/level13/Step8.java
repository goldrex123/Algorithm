package bk.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 문제번호 11651 : 좌표 정렬하기 2
public class Step8 {
	static class Pos implements Comparable<Pos>{
		int x;
		int y;
		
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		@Override
		public int compareTo(Pos o) {
			if(this.y == o.getY()) {
				return this.x - o.getX();
			} else {
				return this.y - o.getY();
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
//		int[][] pos = new int[N][2];
		List<Pos> pos = new ArrayList<Pos>();
		for(int i = 0; i < N; i++) {
			String[] inputStr = br.readLine().split(" ");
			
			pos.add(new Pos(Integer.parseInt(inputStr[0]), Integer.parseInt(inputStr[1])));
			
//			pos[i][0] = Integer.parseInt(inputStr[0]);
//			pos[i][1] = Integer.parseInt(inputStr[1]);
		}
		
		
		Collections.sort(pos);
		
//		Arrays.sort(pos, (a,b) -> {
//			if(a[1] == b[1]) {
//				return a[0] - b[0];
//			} else {
//				return a[1] - b[1];
//			}
//		});
		
		StringBuffer sb = new StringBuffer();
		for(Pos value : pos) {
			sb.append(value.getX() + " ");
			sb.append(value.getY() + "\n");
		}
		System.out.println(sb.toString());
		
	}

}
