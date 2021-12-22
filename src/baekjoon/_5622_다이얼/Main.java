package baekjoon._5622_다이얼;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tell = br.readLine();
        IntStream stream = IntStream.range(0, tell.length());
        char[] chars = tell.toCharArray();
        //1은 2초가 걸린다. 1의 ordinal 은 0이다. 를 일반화한다면
        // n 은 2 + n - 1 초가 걸린다 n 의 ordinal 은 n - 1 이다. 가 된다.
        //따라서, n 은 2 + ordinal(n) 초가 걸린다.
        System.out.println(stream.map(i -> Dial.of(chars[i]).ordinal() + 2).sum());
    }

    private enum Dial {
        ONE(),
        TWO('A', 'B', 'C'),
        THREE('D', 'E', 'F'),
        FOUR('G', 'H', 'I'),
        FIVE('J', 'K', 'L'),
        SIX('M', 'N', 'O'),
        SEVEN('P', 'Q', 'R', 'S'),
        EIGHT('T', 'U', 'V'),
        NINE('W', 'X', 'Y', 'Z'),
        ZERO();

        private final Character[] characters;

        Dial(Character... characters) {
            this.characters = characters;
        }

        public static Dial of(Character c) {
            for (Dial value : values()) {
                if(Arrays.stream(value.characters).anyMatch(x -> x == c)) return value;
            }
            throw new RuntimeException(String.format("%c 에 대응되는 Dial 을 찾을 수 없습니다!", c));
        }
    }
}
