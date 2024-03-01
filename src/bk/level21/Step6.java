package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문제번호 2447 : 별 찍기 - 10
public class Step6 {
    public static char[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];

        printStar(0,0, N,false);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(star[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void printStar(int x, int y, int N, boolean blank) {
        if (blank) {
            for (int i = x; i < x+N; i++) {
                for (int j = y; j < y+N; j++) {
                    star[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            star[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;
        for (int i = x; i < x+N; i+=size) {
            for (int j = y; j < y+N; j+=size) {
                count++;
                printStar(i,j,size, count == 5);
            }
        }

    }
}
