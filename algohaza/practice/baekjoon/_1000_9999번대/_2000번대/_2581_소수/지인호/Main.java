package practice.baekjoon._1000_9999번대._2000번대._2581_소수.지인호;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        IntStream stream = IntStream.rangeClosed(m, n);
        boolean[] sieve = new boolean[n];
        sieve[0] = true; //1은 소수가 아니다.

        for (int i = 1; i <= n; i++)
            for (int j = 2; j < n; j++)
                if (i % j == 0 && i != j) {
                    sieve[i - 1] = true;
                    break;
                }

        int[] nums = stream.filter(i -> !sieve[i - 1]).toArray();
        OptionalInt optional = Arrays.stream(nums).min();
        optional.ifPresentOrElse(
                i -> {
                    System.out.println(Arrays.stream(nums).sum());
                    System.out.println(i);
                },
                () -> System.out.println(-1)
        );
    }
}
