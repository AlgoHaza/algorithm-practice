package baekjoon._2884_알람_시계;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        m -= 45;
        if(m < 0) {
            m = 60 + m;
            h--;
        }
        if(h < 0) {
            h = 24 + h;
        }
        System.out.printf("%d %d", h, m);
    }
}
