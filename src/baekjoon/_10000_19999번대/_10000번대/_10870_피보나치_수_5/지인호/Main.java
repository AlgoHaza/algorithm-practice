package baekjoon._10000_19999번대._10000번대._10870_피보나치_수_5.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(new Scanner(System.in).nextInt()));
    }
    public static int fibonacci(int n) {
        return n == 0 ? 0 : n==1 ? 1 : fibonacci(n-1) + fibonacci(n-2);
    }
}
