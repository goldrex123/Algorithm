package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 문제번호 24511 : queuestack
public class Step11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(token.nextToken()));
        }

        Deque<Integer> queue = new ArrayDeque<>();
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int item = Integer.parseInt(token.nextToken());

            if(list.get(i) == 0) {
                queue.offer(item);
            }
        }

        int M = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int item = Integer.parseInt(token.nextToken());

            queue.addFirst(item);
            sb.append(queue.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}
