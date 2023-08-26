package bk.level4;
// 문제번호 10810 : 공 넣기

import java.util.Scanner;
import java.util.stream.IntStream;

public class Step5 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bucket = new int[N];
        int M = sc.nextInt();

        for(int m = 0 ; m < M; m ++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int b = (i-1); b<=(j-1); b++) {
                bucket[b] = k;
            }
        }

        IntStream.range(0, bucket.length).forEach(idx -> {
            if(idx == bucket.length -1) {
                System.out.print(bucket[idx]);
            } else {
                System.out.print(bucket[idx] + " ");
            }
        });
    }
}
