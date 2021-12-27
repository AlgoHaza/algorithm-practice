package practice.baekjoon._1000_9999번대._1000번대._1550_16진수.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int decimal = Integer.parseInt(br.readLine(),16);
        System.out.println(decimal);
    }
}
