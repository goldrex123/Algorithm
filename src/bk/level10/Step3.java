package bk.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문제번호 3009 : 네 번째 점
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> xPoints = new ArrayList<Integer>();
        List<Integer> yPoints = new ArrayList<Integer>();

        for(int i = 0; i < 3; i++) {
            String[] inputStr = br.readLine().split(" ");
            xPoints.add(Integer.valueOf(inputStr[0]));
            yPoints.add(Integer.valueOf(inputStr[1]));
        }

        xPoints.stream().forEach(x -> {
            if(Collections.frequency(xPoints, x) == 1) {
                System.out.print(x + " ");
            };
        });
        yPoints.stream().forEach(x -> {
            if(Collections.frequency(yPoints, x) == 1) {
                System.out.println(x);
            }
        });
    }
}
