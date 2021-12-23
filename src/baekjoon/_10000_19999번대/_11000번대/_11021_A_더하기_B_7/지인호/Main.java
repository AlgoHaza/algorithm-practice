package baekjoon._10000_19999번대._11000번대._11021_A_더하기_B_7.지인호;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
            bw.write(String.format("Case #%d: %d\n", i, sum));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
