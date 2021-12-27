package practice.baekjoon._1000_9999번대._8000번대._8598_OX퀴즈.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int score = 0;
            int acceleration = 0;
            for (char c : br.readLine().toCharArray()) {
                if(c == 'O') {
                    acceleration++;
                    score += acceleration;
                } else {
                    acceleration = 0;
                }
            }
            System.out.println(score);
        }
    }
}
