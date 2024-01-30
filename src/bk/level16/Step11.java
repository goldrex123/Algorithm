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
        ArrayList<Object> dataStructures = new ArrayList<>();
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if(token.nextToken().equals("0")) {
                dataStructures.add(new LinkedList<Integer>());
            } else {
                dataStructures.add(new Stack<Integer>());
            }
        }

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int item = Integer.parseInt(token.nextToken());
            if(dataStructures.get(i) instanceof Stack) {
                ((Stack<Integer>) dataStructures.get(i)).add(item);
            } else {
                ((Queue)dataStructures.get(i)).add(item);
            }
        }

        int M = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int item = Integer.parseInt(token.nextToken());
            for(int j = 0; j < N; j++) {
                if(dataStructures.get(j) instanceof Stack) {
                    ((Stack<Integer>) dataStructures.get(j)).add(item);
                    item = ((Stack<Integer>) dataStructures.get(j)).pop();
                } else {
                    ((Queue<Integer>)dataStructures.get(j)).add(item);
                    item = ((Queue<Integer>)dataStructures.get(j)).poll();
                }

                if(j == N-1) {
                    sb.append(item).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}
