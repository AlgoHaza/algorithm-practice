package baekjoon._1000_9999번대._1000번대._1978_소수_찾기.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        br.readLine();

        String[] data = br.readLine().split(" ");
        List<Integer> list = Arrays.stream(data)
                .mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
        AtomicInteger sum = new AtomicInteger();
        list.forEach(i -> {
            if(isPrime(i))
                sum.getAndIncrement();
        });
        System.out.println(sum.get());
    }

    public static boolean isPrime(int i) {
        if(i <= 2) return i == 2; //...0, 1, 2 에서 소수는 2 뿐이다.
        for(int j = 2; j < i; j++)
            if(i % j == 0) return false;
        return true;
    }
}
