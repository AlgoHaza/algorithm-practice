package practice.baekjoon._10000_19999번대._11000번대._11729_하노이_탑_이동_순서.지인호;

import java.util.Scanner;

public class Main {
    private static int count;
    private static StringBuilder sb;

    public static void main(String[] args) {
        sb = new StringBuilder();
        hanoi(new Scanner(System.in).nextInt(), 1, 2, 3);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void hanoi(int n, int left, int mid, int right) {
        if(n == 1) {
            sb.append(left).append(" ").append(right).append("\n");
            count++;
            return;
        }

        hanoi(n-1, left, right, mid);
        sb.append(left).append(" ").append(right).append("\n");
        count++;
        hanoi(n-1, mid, left, right);
    }
}
