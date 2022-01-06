package practice.baekjoon._10000_19999번대._10000번대._10844_쉬운_계단_수.지인호;

import java.util.Arrays;
import java.util.Scanner;

//dp[y][x] = n자리수의 계단수 중 y번째 자리가 x인 계단수의 y번째 자리 이후의 수가 가질 수 있는 경우의수
//즉, n - y 자리수의 계단수 중 첮번쨰 수가 x인 계단수의 개수
//즉, dp[y+1][x-1] + dp[y+1][x+1]
public class Main {
    private static int[][] dp;

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        dp = new int[n][10];
        for (int[] arr : dp) Arrays.fill(arr, -1);
        Arrays.fill(dp[n-1], 1);

        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += f(1, i)% 10_0000_0000;
            sum %= 10_0000_0000;
        }
        System.out.println(sum);
    }

    private static int f(int y, int x) {
        if(dp[y-1][x] == -1) //y는 1...N 이지만 array index 는 0...N-1이다.
        {
            if(x == 0) dp[y - 1][x] = f(y + 1, x + 1);
            else if(x == 9) dp[y - 1][x] = f(y + 1, x - 1);
            else dp[y - 1][x] = f(y + 1, x - 1) + f(y + 1, x + 1);
        }
        return dp[y-1][x];
    }
}
