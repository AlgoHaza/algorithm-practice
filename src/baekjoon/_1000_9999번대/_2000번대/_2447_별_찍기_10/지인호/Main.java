package baekjoon._1000_9999번대._2000번대._2447_별_찍기_10.지인호;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2447
public class Main {
    public static void main(String[] args) {
        //우선 칠하고, 지운다
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                boolean isStar = true;
                for (int i = 0; i < 8; i++) {
                    int pow = (int) Math.pow(3, i);
                    if(pow > n) break;

                    int mod = 1;
                    if(i != 0) mod = pow;

                    if (row / mod % 3 == 1 && column / mod % 3 == 1) {//0부터 시작하므로 2가아닌 1이다
                        isStar = false;
                        break;
                    }
                }
                sb.append(isStar ? '*' : ' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
