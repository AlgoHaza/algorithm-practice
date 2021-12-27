package practice.baekjoon._1000_9999번대._7000번대._7568_덩치.지인호;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] table = new int[n][2];
        int[] score = new int[n];
        Arrays.fill(score, 1);

        for (int i = 0; i < n; i++) {
            table[i][0] = sc.nextInt();
            table[i][1] = sc.nextInt();
        }

        for (int i = 0; i < table.length; i++) {
            int[] origin = table[i];
            for (int[] target : table)
                if (origin[0] < target[0] && origin[1] < target[1])
                    score[i]++;
        }

        for (int j : score) System.out.printf("%d ", j);
    }
}
