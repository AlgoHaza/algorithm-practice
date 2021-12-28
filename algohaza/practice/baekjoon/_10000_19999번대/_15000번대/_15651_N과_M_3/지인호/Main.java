package practice.baekjoon._10000_19999번대._15000번대._15651_N과_M_3.지인호;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Integer[]> ans;
    private static int n, m;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ans = new ArrayList<>();
        dfs(0, new ArrayList<>());

        for (Integer[] seq : ans) {
            for (Integer i : seq) sb.append(i).append(' ');
            sb.append('\n');
        }
        System.out.println(sb);
    }

    //사실 백트래킹에서 조건이 없으면 DFS아닌가?
    public static void dfs(int pointer, List<Integer> seq) {
        if(pointer < m) {
            for (int i = 1; i <= n; i++) {
                seq.add(i);
                dfs(pointer + 1, seq);
                seq.remove(pointer);
            }
        } else ans.add(seq.toArray(new Integer[]{}));
    }
}
