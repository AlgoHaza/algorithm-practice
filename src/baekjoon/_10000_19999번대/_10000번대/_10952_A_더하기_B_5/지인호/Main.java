package baekjoon._10000_19999번대._10000번대._10952_A_더하기_B_5.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a, b;
        while(true) {
            String[] data = br.readLine().split(" ");
            a = Integer.parseInt(data[0]);
            b = Integer.parseInt(data[1]);

            if(a + b == 0) break;
            System.out.println(a + b);
        }
    }
}
