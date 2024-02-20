package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 24060 : 알고리즘 수업 - 병합 정렬 1
public class Step4 {
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token;

        token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        arr = new int[N];
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        merge_sort(arr, 0, N - 1);
    }

    public static void merge_sort(int[] arr, int left, int right) {
        if(left == right) return;

        int mid = (left + right) / 2;

        merge_sort(arr, left, mid);
        merge_sort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] a, int left, int mid, int right)
    }

}
