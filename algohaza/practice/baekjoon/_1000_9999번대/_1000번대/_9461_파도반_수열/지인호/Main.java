package practice.baekjoon._1000_9999번대._1000번대._9461_파도반_수열.지인호;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static long[] dp = new long[100];

    public static void main(String[] args) {
        Arrays.fill(dp, -1);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
            System.out.println(p(sc.nextInt()));
    }

    private static long p(int n) {
        if(dp[n-1] == -1) {
            if(n == 1 || n == 2 || n == 3) dp[n-1] = 1;
            else dp[n-1] = p(n-2) + p(n-3);
        }
        return dp[n-1];
    }
}
