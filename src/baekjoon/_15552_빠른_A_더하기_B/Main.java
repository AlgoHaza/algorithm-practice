package baekjoon._15552_빠른_A_더하기_B;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            bw.write(
                    Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum() + "\n"
            );
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
