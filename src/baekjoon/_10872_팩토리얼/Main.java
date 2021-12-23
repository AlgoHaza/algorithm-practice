package baekjoon._10872_팩토리얼;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(new Scanner(System.in).nextInt()));
    }

    public static int factorial(int n) {
        return n == 0 ? 1 : factorial(n-1) * n;
    }
}
