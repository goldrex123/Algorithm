package bk.level16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 문제번호 12789 : 도키도키 간식드리미
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        String[] line = br.readLine().split(" ");

        int getCnt = 1;
        boolean posible = true;
        for (int i = 0; i < line.length; i++) {
            if(Integer.parseInt(line[i]) == getCnt) {
                getCnt++;
            } else if(!stack.isEmpty() && stack.peek() == getCnt) {
                stack.pop();
                i--;
                getCnt++;
            } else {
                if (!stack.isEmpty() && stack.peek() < Integer.parseInt(line[i])) {
                    posible = false;
                    break;
                }
                stack.push(Integer.parseInt(line[i]));
            }
        }

        System.out.println(posible ? "Nice" : "Sad");
    }
}
