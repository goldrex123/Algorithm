package bk.level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 문제번호 2798 : 블랙잭
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NM = br.readLine();
        int N = Integer.parseInt(NM.split(" ")[0]);
        int M = Integer.parseInt(NM.split(" ")[1]);

        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        for(int i = 0; i < numbers.length-2; i++) {
            for(int j = i+1; j < numbers.length-1; j++) {
                for(int k = j+1; k<numbers.length; k++) {
                    if(numbers[i] + numbers[j] + numbers[k] <= M) {
                        max = Math.max(max,numbers[i] + numbers[j] + numbers[k]);
                    }
                }
            }
        }
        System.out.println(max);
    }
}
