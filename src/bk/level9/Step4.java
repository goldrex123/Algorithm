package bk.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 문제번호 1978 : 소수 찾기
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> num = new ArrayList<Integer>();

        StringTokenizer token = new StringTokenizer(br.readLine());
        while(token.hasMoreTokens()) {
            num.add(Integer.parseInt(token.nextToken()));
        }

        int sosuCnt = 0;
        boolean isSosu = true;
        for(int i = 0; i < num.size(); i++){
            if(num.get(i) != 1) {
                for(int j = 1; j <= Math.sqrt(num.get(i)); j++) {
                    if(num.get(i) % j == 0) {
                        if(j != 1) {
                            isSosu = false;
                            break;
                        }
                    }
                }
                if(isSosu) sosuCnt++;
                isSosu=true;
            }
        }

        System.out.println(sosuCnt);
    }
}
