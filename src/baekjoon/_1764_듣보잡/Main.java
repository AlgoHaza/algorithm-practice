package baekjoon._1764_듣보잡;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] startDataInput = br.readLine().split(" ");
        int n = Integer.parseInt(startDataInput[0]);
        int m = Integer.parseInt(startDataInput[1]);

        HashSet<String> 듣도_못한_사람 = new HashSet<>();
        HashSet<String> 보도_못한_사람 = new HashSet<>();

        for (int i = 0; i < n; i++)
            듣도_못한_사람.add(br.readLine());
        for (int i = 0; i < m; i++)
            보도_못한_사람.add(br.readLine());
        듣도_못한_사람.retainAll(보도_못한_사람);

        StringBuilder result = new StringBuilder();
        result.append(듣도_못한_사람.size());
        듣도_못한_사람.stream().sorted().forEach(s -> result.append("\n").append(s));
        System.out.println(result);
    }
}
