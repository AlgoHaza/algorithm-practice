package baekjoon._4153_직각삼각형;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        while (a + b + c != 0) {
          int[] data = IntStream.of(a, b, c).sorted().toArray();
            int ausar = data[0] * data[0];
            int auset = data[1] * data[1];
            int heru = data[2] * data[2];
          if(ausar + auset == heru) System.out.println("right");
          else System.out.println("wrong");
          a = sc.nextInt();
          b = sc.nextInt();
          c = sc.nextInt();
        }
    }
}
