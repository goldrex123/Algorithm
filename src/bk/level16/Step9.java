package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 문제번호 28279 : 덱 2
public class Step9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            Integer item;
            String[] inputOper = br.readLine().split(" ");
            switch (inputOper[0]) {
                case "1":
                    deque.offerFirst(Integer.valueOf(inputOper[1]));
                    break;
                case "2":
                    deque.offer(Integer.valueOf(inputOper[1]));
                    break;
                case "3":
                    item = deque.poll();
                    sb.append(item == null ? -1 : item).append("\n");
                    break;
                case "4":
                    item = deque.pollLast();
                    sb.append(item == null ? -1 : item).append("\n");
                    break;
                case "5":
                    sb.append(deque.size()).append("\n");
                    break;
                case "6":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "7":
                    item = deque.peek();
                    sb.append(item == null ? -1 : item).append("\n");
                    break;
                case "8":
                    item = deque.peekLast();
                    sb.append(item == null ? -1 : item).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
