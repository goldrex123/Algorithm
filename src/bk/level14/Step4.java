package bk.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 문제번호 1620 : 나는야 포켓몬 마스터 이다솜
public class Step4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		Map<Integer,String> poketNum = new HashMap<Integer,String>();
		Map<String,Integer> poketName = new HashMap<String,Integer>();
		
		for(int i = 1; i <= N; i++) {
			String inputName = br.readLine();
			poketNum.put(i,inputName);
			poketName.put(inputName, i);
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < M; i++) {
			String chkStr = br.readLine();
			try {
				sb.append(poketNum.get(Integer.parseInt(chkStr)) + "\n");	
			} catch (NumberFormatException e) {
				sb.append(poketName.get(chkStr) + "\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}

}
