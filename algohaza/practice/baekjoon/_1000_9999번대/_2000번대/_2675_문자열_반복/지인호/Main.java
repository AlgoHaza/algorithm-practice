package practice.baekjoon._1000_9999번대._2000번대._2675_문자열_반복.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int x = 0; x < t; x++) {
            String[] data = br.readLine().split(" ");
            int iteration = Integer.parseInt(data[0]);

            StringBuilder sb = new StringBuilder();
            for (char c : data[1].toCharArray())
                sb.append(String.valueOf(c).repeat(Math.max(0, iteration)));
            System.out.println(sb);
        }
    }
}
