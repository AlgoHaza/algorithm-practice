package baekjoon._10250_ACM_호텔;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int h = data[0], w = data[1], n = data[2];
            int y, x;
            if(n % h == 0)
                y = h;
            else
                y = n % h;
            x = n / h;
            if(n % h != 0)
                x++;
            if(n == h * w) {
                y = h;
                x = w;
            }
            System.out.printf("%d%02d\n", y, x);
        }
    }
}
