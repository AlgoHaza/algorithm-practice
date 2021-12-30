package practice.baekjoon._1000_9999번대._1000번대._1463_1로_만들기.지인호;

import java.util.Scanner;

public class Main {
    private static int[] dp = new int[1000000];
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(f(n));
    }

    private static int f(int n) {
        if(n == 1) return 0;
        else if(dp[n-1] == 0) {
            dp[n-1] = 1 + Math.min(f(n/3) + n % 3, f(n/2) + n%2);
        }
        return dp[n-1];
    }
}
