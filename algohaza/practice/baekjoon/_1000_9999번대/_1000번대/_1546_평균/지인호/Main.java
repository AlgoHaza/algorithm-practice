package practice.baekjoon._1000_9999번대._1000번대._1546_평균.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double max = Arrays.stream(scores).max().getAsInt();
        System.out.println(Arrays.stream(scores).mapToDouble(x -> x / max * 100).average().getAsDouble());
    }
}
