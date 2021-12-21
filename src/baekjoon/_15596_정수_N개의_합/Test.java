package baekjoon._15596_정수_N개의_합;

import java.util.Arrays;

public class Test {
    public long sum(int[] a) {
        return Arrays.stream(a).mapToLong(x -> x).sum();
    }
}
