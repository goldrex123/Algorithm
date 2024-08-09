package bk.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 스타트와 링크 - 14889번
public class Step8 {

    static int N;
    static int[][] abilityValue;
    static int minValue = Integer.MAX_VALUE;

    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        abilityValue = new int[N][N];
        visit = new boolean[N];

        StringTokenizer token;

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                abilityValue[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        matchingAbility(0, 0);
        System.out.println(minValue);
    }

    public static void matchingAbility(int idx, int depth) {
        if (depth == N / 2) {
            getDifference();
            return;
        }

        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                // true - 스타트 팀, false - 링크 팀
                visit[i] = true;
                matchingAbility(i,depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void getDifference() {
        int teamStart = 0;
        int teamLink = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(visit[i] && visit[j]) {
                    //스타트팀
                    teamStart += (abilityValue[i][j] + abilityValue[j][i]);
                } else if(!visit[i] && !visit[j]) {
                    //링크 팀
                    teamLink += (abilityValue[i][j] + abilityValue[j][i]);
                }
            }
        }

        minValue = Math.min(Math.abs(teamLink - teamStart), minValue);
    }
}