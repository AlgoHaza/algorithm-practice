package baekjoon._10809_알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] sieve = IntStream.range(0, 'z' - 'a' + 1).map(x -> -1).toArray();

        char[] arr = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(sieve[arr[i] - 'a'] == -1)
                sieve[arr[i] - 'a'] = i;
        }
        for (int i : sieve) {
            System.out.printf("%d ", i);
        }
    }
}
