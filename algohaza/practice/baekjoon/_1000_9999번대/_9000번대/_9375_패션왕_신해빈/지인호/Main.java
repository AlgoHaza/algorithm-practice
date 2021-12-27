package practice.baekjoon._1000_9999번대._9000번대._9375_패션왕_신해빈.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

//https://www.acmicpc.net/problem/9375
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < numOfTestCases; i++) {
            HashMap<String, Integer> numOfClothByPart = new HashMap<>();
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                String partOfCloth = br.readLine().split(" ")[1];
                numOfClothByPart.put(partOfCloth, numOfClothByPart.getOrDefault(partOfCloth, 0) + 1);
            }

            AtomicInteger sum = new AtomicInteger(1); //옷을 입을 수 있는 모든 경우의수의 합
            //해당 종류의 옷을 입지 않았을경우를 더하여 곱한다
            numOfClothByPart.forEach((k, v) -> sum.updateAndGet(v1 -> v1 * (v + 1)));
            System.out.println(sum.get() - 1); //알몸인 경우를 제외한다
        }

    }
}
