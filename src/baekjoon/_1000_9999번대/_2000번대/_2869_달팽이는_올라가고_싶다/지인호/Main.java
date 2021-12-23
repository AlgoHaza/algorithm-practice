package baekjoon._1000_9999번대._2000번대._2869_달팽이는_올라가고_싶다.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int v = Integer.parseInt(data[2]);

        int currentV = a;
        int currentDay = 1;

        currentDay += Math.ceil((v - currentV) / (double)(a - b));
        System.out.println(currentDay);
    }
}
