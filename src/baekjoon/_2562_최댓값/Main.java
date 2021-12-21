package baekjoon._2562_최댓값;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //응 정렬 알고리즘 구현 안할거지롱~
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++)
            map.put(sc.nextInt(), i);
        int max = map.keySet().stream().mapToInt(a -> a).max().getAsInt();

        System.out.println(max + "\n" + map.get(max));
    }
}
