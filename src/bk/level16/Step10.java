package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 문제번호 2346 : 풍선 터뜨리기
public class Step10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<int[]> deque = new ArrayDeque<int[]>();
        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            deque.offer(new int[]{i , Integer.parseInt(token.nextToken())});
        }

        int move;
        while (true) {
            int[] item = deque.poll();
            sb.append(item[0]).append(" ");
            move = item[1];

            if(deque.isEmpty()) break;

            if (move > 0) {
                for (int i = 0; i < move-1; i++) {
                    deque.offer(deque.poll());
                }
            } else {
                for (int i = move; i < 0; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}
