package practice.baekjoon._10000_19999번대._14000번대._14681_사분면_고르기.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0) System.out.println(y > 0 ? 1 : 4);
        else System.out.println(y > 0 ? 2 : 3);
    }
}
