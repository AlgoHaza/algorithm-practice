package baekjoon._1152_단어의_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/*TODO
" "  일 경우에 대한 출력값 오류를 찾아내지 못함
추후 복습 필요
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (Objects.equals(str, " ")) System.out.println(0);
        else {
            str = format(str);
            System.out.println(str.split(" ").length);
        }
    }

    private static String format(String str) {
        if (str.startsWith(" ")) str = str.substring(1);
        if (str.endsWith(" ")) str = str.substring(0, str.length() - 1);
        return str;
    }
}
