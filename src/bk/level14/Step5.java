package bk.level14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 문제번호 10816 : 숫자 카드 2
public class Step5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Map<Integer,Integer> cards = new HashMap<Integer,Integer>();
		
		String[] cardNums = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			int card = Integer.parseInt(cardNums[i]);
				cards.put(card, cards.getOrDefault(card,0) + 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] chkCardNums = br.readLine().split(" ");
		
		for(int i = 0; i < M; i++) {
			int chkCard = Integer.parseInt(chkCardNums[i]);
			if(cards.containsKey(chkCard)) {
				bw.write(cards.get(chkCard) + " ");
			} else {
				bw.write(0 + " ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
	