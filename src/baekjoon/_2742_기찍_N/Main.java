package baekjoon._2742_기찍_N;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream.range(0, n).map(a -> n - a).forEach(System.out::println);
    }
}