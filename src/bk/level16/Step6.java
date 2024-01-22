package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 문제번호 18258 : 큐 2
public class Step6 {
    static Deque<Integer> queue = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            operQueue(br.readLine());
        }

        System.out.println(sb.toString());
    }

    public static void operQueue(String str) {
        StringTokenizer token = new StringTokenizer(str);

        switch (token.nextToken()) {
            case "push":
                queue.offer(Integer.valueOf(token.nextToken()));
                break;
            case "pop":
                Integer item = queue.pollFirst();
                sb.append(item == null ? -1 : item).append("\n");
                break;
            case "size":
                sb.append(queue.size()).append("\n");
                break;
            case "empty":
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                break;
            case "front":
                sb.append(queue.peek() == null ? -1 : queue.peek()).append("\n");
                break;
            case "back":
                sb.append(queue.peekLast() == null ? -1 : queue.peekLast()).append("\n");
                break;
        }
    }
}
