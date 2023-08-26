package bk.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

// 문제번호 5597 : 과제 안 내신 분..?
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] studentArr = new int[30];

        for(int i = 0; i<28; i++) {
            studentArr[Integer.parseInt(br.readLine())-1] = 1;
        }

        IntStream.range(0, studentArr.length).forEach(idx -> {
            if(studentArr[idx] == 0) System.out.println(idx+1);
        });


    }
}
