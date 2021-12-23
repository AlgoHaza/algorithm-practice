package baekjoon._1000_9999번대._2000번대._2438_별_찍기_1.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) System.out.print('*');
            System.out.print('\n');
        }
    }
}
