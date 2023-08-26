package bk.level4;
// 문제번호 10813 : 공 바꾸기

import java.util.Scanner;
import java.util.stream.IntStream;

public class Step6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bucket = new int[N];
        int M = sc.nextInt();

        IntStream.range(0, bucket.length).forEach(idx -> bucket[idx] = idx+1);

        for(int m = 0; m < M; m++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            int temp = bucket[i];
            bucket[i] = bucket[j];
            bucket[j] = temp;
        }

        IntStream.range(0, bucket.length).forEach(idx -> {
            System.out.print(bucket[idx] + " ");
        });
    }
}
