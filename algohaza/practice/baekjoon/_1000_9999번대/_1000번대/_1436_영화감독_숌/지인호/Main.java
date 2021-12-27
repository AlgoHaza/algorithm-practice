package practice.baekjoon._1000_9999번대._1000번대._1436_영화감독_숌.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long l = 0;

        for (int cnt = 0; cnt < n; l++)
            if((l + "").contains("666")) cnt++;
        System.out.println(l-1);
    }
}
