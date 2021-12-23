package baekjoon._1000_9999번대._2000번대._2775_부녀회장이_될테야.지인호;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map = new int[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            for (int[] ints : map)
                Arrays.fill(ints, -1);
            f(14, 14);

            System.out.println(map[k][n]);
        }

    }

    public static int f(int a, int b) {
        if(a == 0) map[0][b] = b;
        if(b == 0) map[a][0] = 0;
        else if(map[a][b] == -1)
            map[a][b] = f(a-1, b) + f(a, b-1); //IntStream.rangeClosed(0, b).map(k -> f(a - 1, k)).sum();
        return map[a][b];
    }
}
