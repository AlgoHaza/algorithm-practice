package practice.baekjoon._1000_9999번대._1000번대._1620_나는야_포켓몬_마스터_이다솜.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://www.acmicpc.net/problem/1620
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> engToNum = new HashMap<>();
        Map<Integer, String> numToEng = new HashMap<>();

        String[] startingData = br.readLine().split(" ");
        int n = Integer.parseInt(startingData[0]);
        int m = Integer.parseInt(startingData[1]);
        for (int i = 1; i <= n; i++) {
            String engName = br.readLine();
            engToNum.put(engName, i);
            numToEng.put(i, engName);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String search = br.readLine();
            result.append(engToNum.containsKey(search) ? engToNum.get(search) : numToEng.get(Integer.parseInt(search))).append("\n");
        }

        System.out.println(result);
    }
}
