package bk.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제번호 24060 : 알고리즘 수업 - 병합 정렬 1
public class Step4 {
    public static int[] arr;
    public static int K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token;

        token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken());
        int[] sorted = new int[N];
        K = Integer.parseInt(token.nextToken());

        arr = new int[N];
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sorted[i] = Integer.parseInt(token.nextToken());
        }

        merge_sort(sorted, 0, N - 1);

        if(K > 0) {
            System.out.println(-1);
        }
    }

    public static void merge_sort(int[] arr, int left, int right) {
        if(left == right) return;

        int mid = (left + right) / 2;

        merge_sort(arr, left, mid);
        merge_sort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int i = left; // 0
        int j = mid+1; // 2
        int k = i; // 0

        while(i <= mid  && j <= right) {
            if(a[i] <= a[j]) {
                arr[k] = a[i];
                K--;
                checkK(a[i]);
                k++;
                i++;
            } else {
                arr[k] = a[j];
                K--;
                checkK(a[j]);
                k++;
                j++;
            }
        }

        if(i > mid) {
            for(int m = j; m <= right; m++) {
                arr[k] = a[m];
                K--;
                checkK(a[m]);
                k++;
            }
        }

        if(j > right) {
            for (int l = i; l <= mid; l++) {
                arr[k] = a[l];
                K--;
                checkK(a[l]);
                k++;
            }
        }

        for (int l = left; l <= right; l++) {
            a[l] = arr[l];
        }
    }

    public static void checkK(int num) {
        if(K == 0) {
            System.out.println(num);
            System.exit(0);
        }
    }

}
