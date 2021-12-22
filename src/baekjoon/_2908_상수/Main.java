package baekjoon._2908_상수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Arrays.stream(br.readLine().split(" "))
                .map(s -> new StringBuffer(s).reverse().toString())
                .mapToInt(Integer::parseInt)
                .max().getAsInt();
        System.out.println(max);
    }
}
