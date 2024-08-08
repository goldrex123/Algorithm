package bk.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스도쿠 - 2580 문제
public class Step6 {

    static int[][] sdoku = new int[9][9];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        for (int i = 0; i < 9; i++) {
            token = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                sdoku[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        setSdokuNum(0,0);
    }

    static void setSdokuNum(int row, int col) {
        if(col == 9) {
            setSdokuNum(row+1, 0);
            return;
        }

        if(row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(sdoku[i][j] + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }


        if(sdoku[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if(isPossibleNum(row, col, i)) {
                    sdoku[row][col] = i;
                    setSdokuNum(row, col+1);
                }
            }

            sdoku[row][col] = 0;
            return ;
        }
        setSdokuNum(row, col + 1);
    }

    static boolean isPossibleNum(int row, int col, int sdokuNum) {
        //행의 숫자 판별
        for (int i = 0; i < 9; i++) {
            if(sdokuNum == sdoku[row][i]) {
                return false;
            }
        }

        //열의 숫자 판별
        for (int i = 0; i < 9; i++) {
            if (sdokuNum == sdoku[i][col]) {
                return false;
            }
        }

        // 3x3 안의 숫자 판별
        int rowRange = (row / 3) * 3;
        int colRange = (col / 3) * 3;

        for (int i = rowRange; i < rowRange+3; i++) {
            for (int j = colRange; j < colRange+3; j++) {
                if(sdokuNum == sdoku[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }


}
