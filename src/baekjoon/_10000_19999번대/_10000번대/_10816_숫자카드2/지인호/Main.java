package baekjoon._10000_19999번대._10000번대._10816_숫자카드2.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://www.acmicpc.net/problem/10816
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); //굳이 카드의 개수를 알 필요가 없으므로 input 을 drop 한다
        String inputData = br.readLine(); //각 카드별 데이터(숫자)를 입력받는다
        br.readLine(); //굳이 검색할 숫자의 개수를 알 필요가 없으므로 input 을 drop 한다
        String inputSearch = br.readLine(); //검색할 카드들의 데이터(숫자)를 입력받는다
        br.close(); //BufferedReader 에 할당된 메모리를 해제한다

        Map<String, Integer> map = new HashMap<>();
        for(String data : inputData.split(" "))
            map.put(data, map.getOrDefault(data, 0) + 1);

        StringBuilder result = new StringBuilder();
        for(String search : inputSearch.split(" ")) {
            int numOfMatches = map.getOrDefault(search, 0);
            result.append(numOfMatches).append(" ");
        }

        System.out.println(result);
    }
}
