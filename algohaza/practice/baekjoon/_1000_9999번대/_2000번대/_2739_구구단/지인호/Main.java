package practice.baekjoon._1000_9999번대._2000번대._2739_구구단.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
