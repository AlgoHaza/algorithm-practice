package baekjoon._1110_더하기_사이클;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = 0;
        int newNumber = n;

        do {
            int a = newNumber % 10;
            int b = newNumber / 10;
            newNumber = a * 10 + ((a + b) % 10);
            length++;
        } while (n != newNumber);

        System.out.println(length);
    }
}
