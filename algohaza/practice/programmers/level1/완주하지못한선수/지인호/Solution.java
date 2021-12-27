package practice.programmers.level1.완주하지못한선수.지인호;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

//https://programmers.co.kr/learn/courses/30/lessons/42576
public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : participant)
            map.put(s, map.getOrDefault(s, 0) + 1);
        for (String s : completion)
            map.put(s, map.get(s) -1);

        AtomicReference<String> answer = new AtomicReference<>();
        map.forEach((k, v) -> {
            if(v == 1) answer.set(k);
        });
        return answer.get();
    }
}
