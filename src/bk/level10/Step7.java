package bk.level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제번호 5073 : 삼각형과 세 변
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String inputStr = br.readLine();
            if(inputStr.equals("0 0 0")) break;

            int[] lines = Arrays.stream(inputStr.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            if(lines[2] >= lines[0] + lines[1]) {
                System.out.println("Invalid");
            } else if(lines[0] == lines[1] && lines[0] == lines[2]) {
                System.out.println("Equilateral");
            } else if(lines[0] == lines[1] || lines[0] == lines[2] || lines[1] == lines[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene ");
            }
        }
    }
}
