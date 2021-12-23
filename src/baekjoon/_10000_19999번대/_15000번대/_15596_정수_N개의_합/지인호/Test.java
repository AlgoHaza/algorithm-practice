package baekjoon._10000_19999번대._15000번대._15596_정수_N개의_합.지인호;

import java.util.Arrays;

public class Test {
    public long sum(int[] a) {
        return Arrays.stream(a).mapToLong(x -> x).sum();
    }
}
