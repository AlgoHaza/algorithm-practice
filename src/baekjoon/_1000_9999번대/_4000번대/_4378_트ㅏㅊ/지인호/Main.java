package baekjoon._1000_9999번대._4000번대._4378_트ㅏㅊ.지인호;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Character[] map = new Character[]
                {'`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=',
                        'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']', '\\',
                        'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\'',
                        'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/'};

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] input = sc.nextLine().toCharArray();
            for (char c : input) {
                for (int i = 0; i < map.length; i++) {
                    if (c == ' ') {
                        sb.append(' ');
                        break;
                    } else if (c == map[i]) {
                        sb.append(map[i - 1]);
                        break;
                    }
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
