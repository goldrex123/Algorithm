package programmers.complete_search;

public class MinRectangle {

    public static void main(String[] args) {
        int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(size));
    }


    public static int solution(int[][] size) {
        int wMax = 0;
        int hMax = 0;

        for (int i = 0; i < size.length; i++) {
            int w = Math.max(size[i][0], size[i][1]);
            int h = Math.min(size[i][0], size[i][1]);


            wMax = Math.max(w, wMax);
            hMax = Math.max(h, hMax);

        }

        return wMax * hMax;
    }
}
