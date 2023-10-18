package bk.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제번호 9063 : 대지
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if(N == 1) System.out.println(0);
        else {
            List<Integer> xPos = new ArrayList<Integer>();
            List<Integer> yPos = new ArrayList<Integer>();

            for(int i = 0; i < N; i++) {
                String[] inputStr = br.readLine().split(" ");
                xPos.add(Integer.valueOf(inputStr[0]));
                yPos.add(Integer.valueOf(inputStr[1]));
            }

            int width = Collections.max(xPos) - Collections.min(xPos);
            int height = Collections.max(yPos) - Collections.min(yPos);
            System.out.println(Math.abs(width * height));
        }
    }
}
