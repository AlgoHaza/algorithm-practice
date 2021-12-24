package baekjoon._1000_9999번대._1000번대._1003_피보나치_함수.지인호;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] dp = new int[40];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.fill(dp, -1);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            f(n);
            switch (n) {
                case 0:
                    System.out.println("1 0");
                    break;
                case 1:
                    System.out.println("0 1");
                    break;
                default:
                    System.out.printf("%d %d\n", f(n - 1), f(n));
            }
        }
    }

    private static int f(int n) {
        if(n <= 1) return n;
        if(dp[n-1] == -1) dp[n-1] = f(n-1) + f(n-2);
        return dp[n-1];
    }
}
