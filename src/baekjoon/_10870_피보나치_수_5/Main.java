package baekjoon._10870_피보나치_수_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(new Scanner(System.in).nextInt()));
    }
    public static int fibonacci(int n) {
        return n == 0 ? 0 : n==1 ? 1 : fibonacci(n-1) + fibonacci(n-2);
    }
}
