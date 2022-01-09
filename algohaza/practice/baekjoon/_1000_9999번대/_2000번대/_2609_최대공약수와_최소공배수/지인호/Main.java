package practice.baekjoon._1000_9999번대._2000번대._2609_최대공약수와_최소공배수.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gcf = 0;//최대공약수
        int lcm; //최소공배수
        int a = sc.nextInt(), b = sc.nextInt();
        int n = Math.min(a, b); //최소공약수는 항상 두 수보다 작다
        for (int i = 1; i <= n; i++)
            if(a % i == 0 && b % i == 0) gcf = Math.max(gcf, i);
        lcm = a * b / gcf;
        System.out.println(gcf + "\n" + lcm);
    }
}
