package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// 문제번호 2164 : 카드2
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deq.offer(i);
        }

        while(deq.size() != 1) {
            deq.poll();
            deq.offer(deq.pollFirst());
        }

        System.out.println(deq.peek());
    }
}
// 123456
// 34562
//5624
// 246
// 64

