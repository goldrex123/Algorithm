package bk.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제번호 25206 : 너의 평점은
public class Step8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalCredit = 0.0;
        double subjectScore = 0.0;


        for(int i = 0 ; i < 20 ; i++) {
            String[] inputStr = br.readLine().split(" ");
            double credit = Double.parseDouble(inputStr[1]);
            double grade;

            switch (inputStr[2]) {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                default:
                    grade = 0.0;
                    break;
            }


            if(!inputStr[2].equals("P")) {
                totalCredit += credit;
                subjectScore += credit * grade;
            }
        }

        System.out.println(String.format("%.6f", subjectScore / totalCredit));

    }
}
