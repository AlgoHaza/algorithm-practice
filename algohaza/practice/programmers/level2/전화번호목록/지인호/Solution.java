package practice.programmers.level2.전화번호목록.지인호;

import java.util.HashMap;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42577
public class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Void> map = new HashMap<>();
        for (String phone : phone_book) {
            map.put(phone, null);
        }
        for (String phone : phone_book) {
            for(int i = 1; i < phone.length(); i++) {
                String sub = phone.substring(0, i);
                if(map.containsKey(sub)) return false;
            }
        }
        return true;
    }
}
