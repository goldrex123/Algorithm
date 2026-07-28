package programmers.greedy;

import java.rmi.StubNotFoundException;
import java.util.Arrays;

public class GymClothes {

    public static void main(String[] args) {
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        System.out.println(solution(5, lost,reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int canLecture = 0;
        int[] haveClothes = new int[n];
        Arrays.fill(haveClothes,1);
        //1,1,1,1,1

        //1,0,1,0,1
        for (int i = 0; i < lost.length; i++) {
            haveClothes[lost[i]-1]--;
        }

        //2,0,2,0,2
        for (int i = 0; i < reserve.length; i++) {
            haveClothes[reserve[i]-1]++;
        }

        for (int i = 0; i < n; i++) {
            if (haveClothes[i] == 0) {

                if(i > 0 && haveClothes[i-1] == 2) {
                    haveClothes[i]++;
                    haveClothes[i-1]--;
                } else if(i < n-1 && haveClothes[i+1] == 2) {
                    haveClothes[i]++;
                    haveClothes[i+1]--;
                }
            }

            if(haveClothes[i] > 0) canLecture++;
        }


        return canLecture;
    }
}
