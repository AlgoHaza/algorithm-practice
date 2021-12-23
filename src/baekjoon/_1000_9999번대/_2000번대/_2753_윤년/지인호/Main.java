package baekjoon._1000_9999번대._2000번대._2753_윤년.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(1);
        else System.out.println(0);
    }
}
