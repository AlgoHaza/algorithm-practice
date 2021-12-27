package practice.baekjoon._1000_9999번대._1000번대._1712_손익분기점.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] abc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(abc[1] >= abc[2]) System.out.println(-1);
        else {
            int x = (int) Math.floor(abc[0] / (double) (abc[2] - abc[1]) + 1); //나눈 값이 정수면 +1, 실수면 올림 -> +1 하고 버림으로 축약 가능
            System.out.println(x);
        }
    }
}
