package practice.baekjoon._1000_9999번대._3000번대._3009_네_번째_점.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] coordX = new int[3];
        int[] coordY = new int[3];
        int x, y;
        for (int i = 0; i < 3; i++) {
            coordX[i] = sc.nextInt();
            coordY[i] = sc.nextInt();
        }

        System.out.printf("%d %d", coordX[0] ^ coordX[1] ^ coordX[2], coordY[0] ^ coordY[1] ^ coordY[2]);

    }
}
