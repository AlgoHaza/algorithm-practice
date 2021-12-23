package baekjoon._1000_9999번대._4000번대._4344_평균은_넘곘지.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            int[] data = Arrays.stream(str.substring(str.indexOf(" ") + 1).split(" ")).mapToInt(Integer::parseInt).toArray();
            double avg = Arrays.stream(data).average().getAsDouble();

            long numOfTarget = Arrays.stream(data).filter(x -> x > avg).count();
            System.out.printf("%.3f%%\n", (double)numOfTarget / data.length * 100);
        }
    }
}
