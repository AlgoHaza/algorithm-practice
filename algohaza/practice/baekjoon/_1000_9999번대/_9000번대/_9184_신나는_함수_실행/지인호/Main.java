package practice.baekjoon._1000_9999번대._9000번대._9184_신나는_함수_실행.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final int[][][] dp = new int[101][101][101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int[][] ints : dp)
            for (int[] ints1 : ints)
                Arrays.fill(ints1, -51);

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        while (!(a == b && b == c && c == -1)) {
            int x = w(a, b, c);
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, x);

            str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            c = Integer.parseInt(str[2]);
        }
    }

    private static int w(int a, int b, int c) {
        if (dp[a + 50][b + 50][c + 50] == -51) {//System.out.println(a + " " + b + " " + c);
            if (a <= 0 || b <= 0 || c <= 0)
                dp[a + 50][b + 50][c + 50] = 1;
            else if (a > 20 || b > 20 || c > 20)
                dp[a + 50][b + 50][c + 50] = w(20, 20, 20);
            else if (a < b && b < c)
                dp[a + 50][b + 50][c + 50] = w(a, b, c - 1) +
                        w(a, b - 1, c - 1) -
                        w(a, b - 1, c);
            else
                dp[a + 50][b + 50][c + 50] = w(a - 1, b, c) +
                        w(a - 1, b - 1, c) +
                        w(a - 1, b, c - 1) -
                        w(a - 1, b - 1, c - 1);
        }
        return dp[a + 50][b + 50][c + 50];
    }
}
