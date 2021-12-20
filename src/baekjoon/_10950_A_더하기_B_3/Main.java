package baekjoon._10950_A_더하기_B_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum());
        }
    }
}
