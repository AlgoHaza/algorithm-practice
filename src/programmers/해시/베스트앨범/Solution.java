package programmers.해시.베스트앨범;

import java.util.*;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/42579
public class Solution {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> playsByGenre = new HashMap<>(); //장르, 총 플레이수
        Map<String, List<Map.Entry<Integer, Integer>>> idByGenre = new HashMap<>(); //장르, 리스트<플레이수, 고유ID>
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];

            if(!playsByGenre.containsKey(genre))
                idByGenre.put(genre, new LinkedList<>());
            idByGenre.get(genre).add(new AbstractMap.SimpleEntry<>(plays[i], i));

            playsByGenre.put(genres[i], playsByGenre.getOrDefault(genre, 0) + plays[i]);
        }
        List<String> playsByGenreOrderByPlays = playsByGenre.entrySet().stream().sorted(Comparator.comparingInt(entry -> entry.getValue() * -1)).map(Map.Entry::getKey).collect(Collectors.toList());
        for (String playsByGenreOrderByPlay : playsByGenreOrderByPlays) {
            idByGenre.get(playsByGenreOrderByPlay).stream().sorted((o1, o2) -> {
                int compareResult = o2.getKey().compareTo(o1.getKey());

                if(compareResult == 0) {
                    return o1.getValue().compareTo(o2.getValue());
                } else return compareResult;
            }).limit(2).map(Map.Entry::getValue).forEach(answer::add);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
