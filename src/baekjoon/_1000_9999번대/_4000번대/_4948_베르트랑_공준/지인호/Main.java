package baekjoon._1000_9999번대._4000번대._4948_베르트랑_공준.지인호;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do {
            switch (n) {
                case 1:
                case 2:
                    System.out.println(1);
                    break;
                default:
                    boolean[] sieve = new boolean[n * 2];
                    IntStream stream = IntStream.range(n + 1, n * 2);
                    sieve[0] = true;
                    for (int i = 2; i < n * 2; i++)
                        for(int j = 2 * i; j < n * 2; j += i)
                            sieve[j-1] = true;
                    System.out.println(stream.filter(i -> !sieve[i-1]).count());
                    break;
            }
            n = sc.nextInt();
        } while(n != 0);
    }
}
