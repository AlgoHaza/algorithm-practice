package baekjoon._11720_숫자의_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        for (char c : br.readLine().toCharArray()) {
            sum += c - 48;
        }
        System.out.println(sum);
    }
}
