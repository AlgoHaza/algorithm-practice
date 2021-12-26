package baekjoon._1000_9999번대._1000번대._1010_다리_놓기.지인호;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static int N, M;
    private static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int caseCnt = 0; caseCnt < t; caseCnt++) {
            N = sc.nextInt();
            M = sc.nextInt();
            dp = new int[N+1][M+1]; //(x, n)
            System.out.println(f(0, 0));
        }
    }

    public static int f(int x, int n) {
        if(dp[x][n] == 0) {
            if (x == N) dp[x][n] = 1;
            else dp[x][n] = IntStream.rangeClosed(n + 1, M - N + x + 1).map(k -> f(x + 1, k)).sum();
        } return dp[x][n];
    }
}
