package baekjoon._1000_9999번대._2000번대._2231_분해합.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            if(isConstructor(n, i)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    private static boolean isConstructor(int n, int i) {
        int sum = i;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }

        return sum == n;
    }
}
