package baekjoon._1000_9999번대._2000번대._2839_설탕_배달.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int numOfVinyl = 0;
        int x = -1, y = 0;
        for (int i = 0; i <= n / 3; i++) {
            if((n - (3 * (double)i)) / 5 % 1 == 0) {
                x = i;
                y = (n - (3 * i)) / 5;
                break;
            }
        }
        System.out.println(x + y);
    }
}
