package practice.baekjoon._1000_9999번대._1000번대._1330_두_수_비교하기.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a > b ? ">" : a == b ? "==" : "<");
    }
}
