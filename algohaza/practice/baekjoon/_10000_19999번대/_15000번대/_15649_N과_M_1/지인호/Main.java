package practice.baekjoon._10000_19999번대._15000번대._15649_N과_M_1.지인호;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int m;
    private static int n;
    private static List<Integer[]> ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ans = new ArrayList<>();

        n = sc.nextInt();
        m = sc.nextInt();

        bt(0, new ArrayList<>());
        StringBuilder sb = new StringBuilder();
        for (Integer[] an : ans) {
            for (Integer integer : an)
                sb.append(integer).append(' ');
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void bt(int pointer, List<Integer> seq) {
        if (pointer < m) {
            for (int i = 1; i <= n; i++) {
                if (!seq.contains(i)) {
                    seq.add(i);
                    bt(pointer + 1, seq);
                    seq.remove((Integer) i);
                }
            }
        } else ans.add(seq.toArray(new Integer[]{}));
    }
}
