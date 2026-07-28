package programmers.heap;

import java.util.PriorityQueue;

public class MoreHot {
    public static void main(String[] args) {
        int K = 7;
        int[] scoviles = {1, 2, 3, 10, 9, 12};

        System.out.println(solution(scoviles, K));
    }

    public static int solution(int[] scoville, int K) {
        int count = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i : scoville) {
            pQ.add(i);
        }

        while (pQ.peek() < K) {
            if (pQ.size() < 2) {
                return -1;
            }

            int first = pQ.poll();
            int second = pQ.poll();

            int mixed = makeScovile(first, second);
            pQ.add(mixed);
            count++;
        }

        return count;
    }

    private static int makeScovile(int s1, int s2) {
        return s1 + (s2 * 2);
    }
}
