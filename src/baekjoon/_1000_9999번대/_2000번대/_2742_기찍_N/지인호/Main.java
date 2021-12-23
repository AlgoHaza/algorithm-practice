package baekjoon._1000_9999번대._2000번대._2742_기찍_N.지인호;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IntStream.range(0, n).map(a -> n - a).forEach(System.out::println);
    }
}