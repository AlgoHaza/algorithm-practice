package baekjoon._2577_숫자의_개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] result = new int[10];
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt() * sc.nextInt() * sc.nextInt();

        for (char x : String.valueOf(mul).toCharArray())
             result[x - 48]++;
        for (int i : result)
            System.out.println(i);
    }
}
