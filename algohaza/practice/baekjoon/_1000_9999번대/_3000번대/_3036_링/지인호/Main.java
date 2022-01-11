package practice.baekjoon._1000_9999번대._3000번대._3036_링.지인호;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            int r = sc.nextInt();
            int x = Math.max(first, r), y = Math.min(first, r);
            BigInteger max = new BigInteger(String.valueOf(x)), min = new BigInteger(String.valueOf(y));
            int gcd = max.gcd(min).intValue();
            System.out.printf("%d/%d\n", first / gcd, r / gcd);
        }
    }
}
