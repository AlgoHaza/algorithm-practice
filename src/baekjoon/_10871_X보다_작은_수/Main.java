package baekjoon._10871_X보다_작은_수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine().split(" ")[1]);

        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(i -> i < x).forEach(i -> sb.append(i).append(" "));
        System.out.println(sb.deleteCharAt(sb.length() - 1)); //delete last space
    }
}
