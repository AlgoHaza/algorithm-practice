package practice.baekjoon._10000_19999번대._10000번대._10773_제로.지인호;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> stack = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            if(x == 0)stack.remove(stack.size() - 1);
            else stack.add(x);
        }
        System.out.println(stack.stream().mapToInt(x -> x).sum());
    }
}
