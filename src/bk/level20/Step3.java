package bk.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 문제번호 26069 : 붙임성 좋은 총총이
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer token;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            String personA = token.nextToken();
            String personB = token.nextToken();

            if(personB.equals("ChongChong") || personA.equals("ChongChong")) {
                map.put(personA, 1);
                map.put(personB, 1);
            }

            if(map.size() > 0 && (map.containsKey(personA) || map.containsKey(personB))) {
                map.put(personA, 1);
                map.put(personB, 1);
            }
        }

        System.out.println(map.size());
    }
}
