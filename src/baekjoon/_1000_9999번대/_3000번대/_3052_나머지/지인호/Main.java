package baekjoon._1000_9999번대._3000번대._3052_나머지.지인호;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        System.out.println(set.size());
    }
}
