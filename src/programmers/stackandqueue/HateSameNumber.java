package programmers.stackandqueue;

import java.util.*;

public class HateSameNumber {

    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int []arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(arr[0]);

        for (int i : arr) {
            if(deque.peekLast() == i) {
                continue;
            }

            deque.addLast(i);
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
