package bk.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 2563 : 색종이
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int paperCnt = Integer.parseInt(br.readLine());
        int totalArea = 0;
        boolean[][] area = new boolean[101][101];

        for(int i = 0; i < paperCnt; i++) {
            String[] s = br.readLine().split(" ");
            int posX = Integer.parseInt(s[0]);
            int posY = Integer.parseInt(s[1]);

            for(int j = posX; j <=posX + 9; j++){
                for(int k = posY; k<=posY + 9; k++) {
                    if(!area[j][k]) {
                        area[j][k] = true;
                        totalArea++;
                    }
                }
            }

        }

        System.out.println(totalArea);
    }
}