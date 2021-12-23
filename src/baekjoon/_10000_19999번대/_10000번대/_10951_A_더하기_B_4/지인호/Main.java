package baekjoon._10000_19999번대._10000번대._10951_A_더하기_B_4.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            System.out.println(Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).sum());
        }
    }
}
