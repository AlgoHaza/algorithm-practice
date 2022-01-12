package practice.baekjoon._10000_19999번대._11000번대._11050_이항_계수_1.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k > n || k < 0) System.out.println(0);
        else System.out.println(factorial(n) / (factorial(k) * factorial(n-k)));
    }

    private static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++)
            sum *= i;
        return sum;
    }
}
