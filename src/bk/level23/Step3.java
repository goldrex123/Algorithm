package bk.level23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 01타일 - 1904 문제
public class Step3 {

    static int N;

    static Integer[] binaryArr = new Integer[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        binaryArr[0] = 1;
        binaryArr[1] = 1;
        binaryArr[2] = 2;

        System.out.println(getBinaryNum(N));

    }

    static int getBinaryNum(int depth) {
        if(binaryArr[depth] == null ){
            binaryArr[depth] = (getBinaryNum(depth-1) + getBinaryNum(depth-2)) % 15746;
        }


        return binaryArr[depth];
    }
}
