package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 문제번호 11866 : 요세푸스 문제()
public class Step8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int removeNum = K;
        while (true) {
            deque.remove(removeNum);
            sb.append(removeNum).append(", ");
            if(deque.isEmpty()) break;
            for (int i = 0; i < K; i++) {
                removeNum = removeNum+1>N ? 1 : ++removeNum;
                if (!deque.contains(removeNum)) {
                    i -= 1;
                }
            }
        }


        sb.append(">");
        System.out.println(sb.replace(sb.length()-3, sb.length()-1, ""));
    }
}
