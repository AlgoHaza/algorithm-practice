package baekjoon._1065_한수;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1065
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            boolean isHanNumber = true;

            if(i < 100) //1부터 99까지는 무조건 한수이다
                sum++;
            else {
                char[] arr = Integer.toString(i).toCharArray();
                int diff = arr[0] - arr[1];
                int prev = -1;
                for (char c : arr) {
                    if (prev == -1) {
                        prev = c;
                        continue;
                    }
                    if (prev - c != diff) {
                        isHanNumber = false;
                        break;
                    }
                    prev = c;
                }

                if (isHanNumber) sum++;
            }
        }

        System.out.println(sum);
    }
}
