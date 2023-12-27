package bk.level14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

// 문제번호 1764 : 듣보잡
public class Step6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		Map<String,Integer> persons = new HashMap<String,Integer>();
		
		for(int i = 0; i < N; i++) {
			String name = br.readLine();
			persons.put(name, persons.getOrDefault(name, 0)+1);
		}
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
			persons.put(name, persons.getOrDefault(name, 0)+1);
		}
		
		
		StringBuffer sb = new StringBuffer();
		List<String> names = new ArrayList<String>(persons.keySet().stream().filter(x-> persons.get(x) == 2).collect(Collectors.toList()));
		Collections.sort(names);
		
		System.out.println(names.size());
		names.stream().forEach(x -> {
			System.out.println(x);
		});
		br.close();
	}
}
