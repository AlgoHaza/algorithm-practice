package baekjoon._2439_별_찍기_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int a = i + 1; a < n; a++) {
                System.out.print(' ');
            }
            for(int a = 0; a < i + 1; a++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
