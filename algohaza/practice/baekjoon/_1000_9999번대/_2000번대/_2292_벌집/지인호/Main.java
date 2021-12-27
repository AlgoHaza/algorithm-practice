package practice.baekjoon._1000_9999번대._2000번대._2292_벌집.지인호;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Integer> dp = new HashMap<>();

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int d = 0;
        while (true) {
            d++;
            if(f(d - 1) < n && n <= f(d)) {
                System.out.println(d);
                return;
            }
        }
    }

    public static int f(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(!dp.containsKey(n))
            dp.put(n, f(n-1) + (n-1) * 6);
        return dp.get(n);
    }
}
