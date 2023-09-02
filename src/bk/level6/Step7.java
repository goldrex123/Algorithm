package bk.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 1316 : 그룹단어 체커
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int grpWordCnt = 0;
        for(int i = 0; i <N ; i++) {
            String inputStr = br.readLine();

            for(int j = 0; j < inputStr.length(); j++){
                String value = String.valueOf(inputStr.charAt(j));
                String regex = "[\\w]*[" + value + "]+[^" + value + "]+[" + value + "]+[\\w]*";
                if(inputStr.matches(regex)) {
                    break;
                }

                if(j == inputStr.length() -1) ++grpWordCnt;
            }
        }
        System.out.println(grpWordCnt);
    }
}
