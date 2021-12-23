package programmers.level2.위장.지인호;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

//https://programmers.co.kr/learn/courses/30/lessons/42578
public class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for(String[] cloth : clothes)//옷에 대한 정보를 이터레이션한다.
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1); //옷의 종류별로 몇개의 옷이 있는지를 저장한다.

        AtomicInteger answer = new AtomicInteger(1); //lambda 를 통한 연산을 위해 사용
        map.forEach((k, v) -> answer.updateAndGet(v1 -> v1 * (v + 1))); //해당 분류의 옷을 입지 않는 경우를 포함한 모든 경우의수를 곱한다.
        return answer.get() - 1; //아무것도 입지 않은 경우를 제외한다.
    }
}
