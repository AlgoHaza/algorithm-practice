package practice.baekjoon._1000_9999번대._9000번대._9663_N_Queen.지인호;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int n, sum;
    public static void main(String[] args) {
        n = new Scanner(System.in).nextInt();
        int[] prevX = new int[n], prevY = new int[n];
        Arrays.fill(prevX, -1);
        Arrays.fill(prevY, -1);
        bt(0, prevX);
        System.out.println(sum);
    }

    private static void bt(int y, int[] prevX) {
        if(y < n) {
            for (int x = 0; x < n; x++) {
                if (checkCondition(x, y, prevX)) {
                    prevX[y] = x;
                    bt(y + 1, prevX);
                    prevX[y] = -1;
                }
            }
        } else sum++;
    }

    private static boolean checkCondition(int x, int y, int[] xArr) {
        for (int i = 0, prevY = 0; prevY <= y; i++, prevY++) {
            int prevX = xArr[i];
            if(prevX == -1)
                continue;
            if(prevX == x || prevY == y || Math.abs(y - prevY) == Math.abs(x - prevX)) return false;
        }
        return true;
    }
}
