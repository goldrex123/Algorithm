package bk.level3;
//문제번호 25304 : 영수증
import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        int realPrice = 0;
        int receiptTotalPrice;
        int productTypeCnt;
        int productPrice;
        int productCnt;

        Scanner scan = new Scanner(System.in);
        receiptTotalPrice = scan.nextInt();
        productTypeCnt = scan.nextInt();

        for(int i = 0 ; i < productTypeCnt; i++) {
            productPrice = scan.nextInt();
            productCnt = scan.nextInt();

            realPrice += productPrice * productCnt;
        }

        if(receiptTotalPrice == realPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}
