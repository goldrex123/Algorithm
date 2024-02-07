package bk.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 문제번호 25192 : 인사성 밝은 곰곰이
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER")) {
                map.clear();
                continue;
            }

            if (map.containsKey(str)) {
                continue;
            }
            map.put(str, 1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
