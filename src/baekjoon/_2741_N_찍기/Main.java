package baekjoon._2741_N_찍기;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream.rangeClosed(1, n).forEach(System.out::println);
    }
}
