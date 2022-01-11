package practice.baekjoon._1000_9999번대._1000번대._1011_Fly_me_to_the_Alpha_Centauri.지인호;

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
            int distance = data[1] - data[0];
            int max = (int) Math.sqrt(distance);

            if(max == Math.sqrt(distance)) System.out.println(2 * max - 1);
            else if(distance <= max * max + max) System.out.println(2 * max);
            else System.out.println(2 * max + 1);
        }
    }
}
