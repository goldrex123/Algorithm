package bk.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

//문제 번호 10811 : 바구니 뒤집기
public class Step9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int[] bucket = new int[N];
        int M = Integer.parseInt(input.split(" ")[1]);
        Arrays.setAll(bucket, num -> num + 1);


        for (int m = 0; m < M ; m++) {
            input = br.readLine();
            int i = Integer.parseInt(input.split(" ")[0])-1;
            int j = Integer.parseInt(input.split(" ")[1])-1;

            int[] copyArr = Arrays.copyOfRange(bucket, i, j+1);

            for(int k = i; k <=j ; k++) {
                bucket[k] = copyArr[j-k];
            }
        }

        IntStream.range(0, bucket.length).forEach(idx -> {
            System.out.print(bucket[idx] + " ");
        });
    }
}
