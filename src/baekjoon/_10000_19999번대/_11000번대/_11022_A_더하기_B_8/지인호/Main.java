package baekjoon._10000_19999번대._11000번대._11022_A_더하기_B_8.지인호;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            bw.write(String.format("Case #%d: %d + %d = %d\n", i, ab[0], ab[1], ab[0] + ab[1]));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
