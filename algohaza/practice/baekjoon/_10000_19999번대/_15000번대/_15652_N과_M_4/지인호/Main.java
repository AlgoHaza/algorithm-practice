package practice.baekjoon._10000_19999번대._15000번대._15652_N과_M_4.지인호;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int n, m;
    private static List<Integer[]> ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();

        ans = new ArrayList<>();
        bt(0, new ArrayList<>(), 0);

        for (Integer[] seq : ans) {
            for (Integer i : seq) sb.append(i).append(' ');
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void bt(int depth, List<Integer> seq, int prev) {
        if(depth < m) {
            for (int i = 1; i <= n; i++) {
                if(prev <= i) {
                    seq.add(i);
                    bt(depth + 1, seq, i);
                    seq.remove(depth);
                }
            }
        } else ans.add(seq.toArray(new Integer[]{}));
    }
}
