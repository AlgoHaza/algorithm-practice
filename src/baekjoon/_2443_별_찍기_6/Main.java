package baekjoon._2443_별_찍기_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (i * 2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
