package bk.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// 문제번호 2108 : 통계학
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers.add(num);

            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        Collections.sort(numbers);

        sb.append(Math.round((double)numbers.stream().mapToInt(Integer::intValue).sum() / N)).append("\n");
        sb.append(numbers.get(N / 2)).append("\n");
        sb.append("").append("\n");
        sb.append(Math.abs(numbers.get(N-1) -numbers.get(0)));

        System.out.println(sb);
    }
}
