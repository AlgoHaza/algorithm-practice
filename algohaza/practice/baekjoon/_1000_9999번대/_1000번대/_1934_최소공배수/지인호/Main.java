package practice.baekjoon._1000_9999번대._1000번대._1934_최소공배수.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
            int gcf = getGCF(a, b);
            System.out.println(a * b / gcf);
        }
    }

    private static int getGCF(int a, int b) {
        int max = Math.max(a, b), min = Math.min(a, b);
        while (max % min != 0) {
            int tmp = max % min;
            max = min;
            min = tmp;
        }
        return min;
    }
}
