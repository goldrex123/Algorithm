package bk.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

// 문제번호 2566 : 최댓값
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A[][] = new int[9][9];

        for(int i = 0; i < 9; i++){
            A[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxVal = Arrays.stream(A).flatMapToInt(Arrays::stream).max().getAsInt();

        System.out.println(maxVal);
        IntStream.range(0,9).forEach(x -> {
            IntStream.range(0,9).forEach(x2 -> {
                if(A[x][x2] == maxVal) {
                    System.out.println((x+1) + " " + (x2+1));
                }
            });
        });
    }
}
