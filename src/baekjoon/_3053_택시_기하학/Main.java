package baekjoon._3053_택시_기하학;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = new Scanner(System.in).nextInt();
        double s1 = Math.PI * r * r;
        double s2 = 2 * r * r; //택시기하학에서 반지름이 r인 원은 대각선 길이가 2r인 정사각형(마름모) 꼴을 띄고있다

        System.out.printf("%.6f\n%.06f", s1, s2);
    }
}
