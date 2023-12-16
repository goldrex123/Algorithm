package bk.level14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 문제번호 7785 : 회사에 있는 사람
public class Step3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Map<String,String> workers = new HashMap<String,String>();
		
		for(int i = 0; i < N; i++ ) {
			String inputStr[] = br.readLine().split(" ");
			String name = inputStr[0];
			String state = inputStr[1];
			
			if(state.equals("enter")) {
				workers.put(name, state);
			} else {
				workers.remove(name);
			}
		}
		
		List<String> remainWorkers = new ArrayList<String>(workers.keySet());
		Collections.sort(remainWorkers, Collections.reverseOrder());
		for(String name : remainWorkers) {
			bw.write(name + "\n");
		}
		
		bw.close();
		br.close();
	}

}
