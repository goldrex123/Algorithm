package bk.level14;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step1 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, m;
    static int arr[];

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        // 숫자 카드 오름차순 정렬
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            // 이분 탐색을 해서 해당 숫자가 있는 경우
            if(binarySearch(num)) bw.write("1 ");
            // 이분 탐색을 해서 해당 숫자가 없는 경우
            else bw.write("0 ");
        }

        bw.close();
        br.close();
    }
    private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = n - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = arr[midIndex];

            if(num < mid) rightIndex = midIndex - 1;
            else if(num > mid) leftIndex = midIndex + 1;
            else return true;
        }
        return false;
    }
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.StringTokenizer;
//
//// 문제번호 10815 : 숫자 카드
//public class Step1 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		List<Integer> cards = new ArrayList<Integer>();
//		Map<Integer, Integer> checkNum = new LinkedHashMap<Integer,Integer>();
//		
//		StringTokenizer token = new StringTokenizer(br.readLine());
//		
//		while(token.hasMoreTokens()) {
//			cards.add(Integer.parseInt(token.nextToken()));
//		}
//		
//		int M = Integer.parseInt(br.readLine());
//		String[] checkingCards = br.readLine().split(" ");
//		for(int i = 0; i < M; i++) {
//			int checkCardNum = Integer.parseInt(checkingCards[i]);
//			checkNum.put(checkCardNum, 0);
//		}
//		
//		cards.stream().forEach(x -> {
//			if(checkNum.containsKey(x)) {
//				checkNum.put(x, 1);
//			}
//		});
//		
//		
//		StringBuffer sb = new StringBuffer();
//		for(Integer key : checkNum.keySet()) {
//			sb.append(checkNum.get(key) + " ");
//		}
//		System.out.println(sb.toString());
//		
//	}
//}
