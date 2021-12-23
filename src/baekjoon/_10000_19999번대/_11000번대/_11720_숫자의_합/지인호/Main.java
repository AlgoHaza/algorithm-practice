package baekjoon._10000_19999번대._11000번대._11720_숫자의_합.지인호;

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
