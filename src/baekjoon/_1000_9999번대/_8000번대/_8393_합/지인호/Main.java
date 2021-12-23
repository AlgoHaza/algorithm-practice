package baekjoon._1000_9999번대._8000번대._8393_합.지인호;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int n = sc.nextInt();

        System.out.println(IntStream.rangeClosed(1, n).sum());
    }
}
