package bk.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제번호 2738 : 행렬 덧셈
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        int[][] A = new int[N][M];

        for (int i = 0 ; i<2*N; i++) {
            String[] inputVal = br.readLine().split(" ");
            for(int j = 0; j < M; j++) {
                A[i%N][j] += Integer.parseInt(inputVal[j]);
            }
        }

        Arrays.stream(A).forEach(x -> {
            Arrays.stream(x).forEach(x2 -> {
                System.out.print(x2 + " ");
            });
            System.out.println();
        });
    }
}
