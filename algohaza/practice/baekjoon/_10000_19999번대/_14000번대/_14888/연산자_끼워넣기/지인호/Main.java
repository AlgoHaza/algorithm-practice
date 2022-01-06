package practice.baekjoon._10000_19999번대._14000번대._14888.연산자_끼워넣기.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    private static int[] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] operator = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startNum = a[0];
        a = Arrays.copyOfRange(a, 1, a.length);
        dfs(startNum, operator, 0);
        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int current, int[] operator, int depth) {
        if(depth < a.length) {
            int backup = current;
            int num = a[depth];
            for (int i = 0; i < 4; i++) {
                if (operator[i] > 0) {
                    switch (i) {
                        case 0: current += num;break;
                        case 1: current -= num;break;
                        case 2: current *= num;break;
                        case 3: current /= num;break;
                    }
                    operator[i]--;
                    dfs(current, operator, depth + 1);
                    operator[i]++;
                    current = backup;
                }
            }
        } else {
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
    }
}
