package practice.baekjoon._10000_19999번대._10000번대._10757_큰수_A_더하기_B.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Object[] ab = Arrays.stream(br.readLine().split(" ")).map(BigDecimal::new).toArray();
        System.out.println(((BigDecimal)ab[0]).add((BigDecimal)ab[1]));
    }
}
