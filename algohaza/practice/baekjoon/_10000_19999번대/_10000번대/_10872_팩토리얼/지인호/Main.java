package practice.baekjoon._10000_19999번대._10000번대._10872_팩토리얼.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(new Scanner(System.in).nextInt()));
    }

    public static int factorial(int n) {
        return n == 0 ? 1 : factorial(n-1) * n;
    }
}
