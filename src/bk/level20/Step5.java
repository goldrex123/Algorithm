package bk.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 문제번호 20920 : 영단어 암기는 괴로워
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        HashMap<String, Integer> words = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if(word.length() >=  M) {
                words.put(word, words.getOrDefault(word,0)+1);
            }
        }

        ArrayList<String> list = new ArrayList<>(words.keySet());
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if((words.get(o1) - words.get(o2)) != 0) {
                    return  words.get(o2) - words.get(o1);
                }
                if(o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        list.stream().forEach(x -> {
            sb.append(x).append("\n");
        });
        System.out.println(sb);
    }
}
