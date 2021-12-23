package baekjoon._1000_9999번대._1000번대._1929_소수_구하기.지인호;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] sieve = new boolean[n];

        IntStream stream = IntStream.rangeClosed(m, n);

        sieve[0] = true;
        for (int i = 2; i <= sieve.length; i++) {
            if(sieve[i-1]) continue;
            for (int j = 2 * i; j <= sieve.length; j+=i) {
                sieve[j-1] = true;
            }
        }

        stream.filter(i -> !sieve[i-1]).forEach(System.out::println);

    }
}
