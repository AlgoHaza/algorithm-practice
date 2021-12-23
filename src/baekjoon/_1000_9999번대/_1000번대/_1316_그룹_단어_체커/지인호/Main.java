package baekjoon._1000_9999번대._1000번대._1316_그룹_단어_체커.지인호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int numOfGroup = 0;
        for (int i = 0; i < n; i++) {
            boolean[] status = new boolean[26];
            String str = br.readLine();
            boolean isGroup = true;
            char prev = '-';
            for (char c : str.toCharArray()) {
                if(prev == '-') {
                    prev = c;
                    status[c - 'a'] = true;
                }else if(prev != c) { //연속되어 나오는 동일문자는 알아서 필터링함 (ex, happy 면 h, a, p, y 만 검사)
                    if(status[c - 'a']) { //이미 나온 문자일경우
                        isGroup = false; //그룹단어가 아니다
                        break;
                    }else {
                        prev = c; //포인터(C 의 그 포인터 말고) 업데이트
                        status[c - 'a'] = true;
                    }
                }
            }
            if(isGroup)
                numOfGroup ++;
        }
        System.out.println(numOfGroup);
    }
}
