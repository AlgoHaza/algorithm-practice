package practice.programmers.level1.로또의_최고_순위와_최저_순위.지인호;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //stream, retainAll 등의 내장함수를 사용하기위해  Array 를 List 로 치환한다
        //TODO (성능 이슈 발생 가능성 있음)
        List<Integer> lottoList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> winNumsList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        //TODO (성능 이슈 발생 가능성 있음)
        int numOfZero = (int) lottoList.stream().filter(integer -> integer.equals(0)).count(); //stream 문법을 통해 0의 개수를 구한다

        lottoList.retainAll(winNumsList); //지워지지 않은 숫자중, 로또에 당첨된 숫자를 구한다.

        int caseOfMin = lottoList.size(); //최저 순위를 구해야하므로 0이 로또 당첨수를 제외한 수중 하나라고 가정한다.
        int caseOfMax = lottoList.size() + numOfZero; //로또에 당첨된 숫자와 0의 개수를 더한다. (0은 어떤 수든 될 수 있으므로, 최고순위를 구하기 위해 모든 0이 당첨수였다고 가정한다)

        return new int[]{getRank(caseOfMax), getRank(caseOfMin)};
    }

    private int getRank(int numOfMatch) {
        //당첨내용에 따른 순위 정책이 언제든 바뀔 수 있다
        //따라서 현재 정책의 구현에 의존하는 6 - numOfMatch + 1 의 수식사용보다는 switch 로 매핑하는것이 더 안전하다. (의존성 역전원칙 참조)
        switch(numOfMatch) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
