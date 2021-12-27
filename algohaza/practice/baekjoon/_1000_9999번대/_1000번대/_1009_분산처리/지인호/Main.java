package practice.baekjoon._1000_9999번대._1000번대._1009_분산처리.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int caseCnt = 0; caseCnt < t; caseCnt++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = 1;
            for (int i = 0; i < b; i++) {
                sum *= a;
                if(sum > 1000000) {
                    sum %= 1000000;
                }
            }

            System.out.println(sum % 10 == 0 ? 10 : sum % 10);
        }
    }
}
