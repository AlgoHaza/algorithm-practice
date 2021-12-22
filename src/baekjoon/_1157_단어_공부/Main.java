package baekjoon._1157_단어_공부;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] counter = new int[26];

        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase(Locale.ROOT);

        for (char c : input.toCharArray()) {
            counter[c - 'A']++;
        }

        int maxValue = Arrays.stream(counter).max().getAsInt();
        int numOfMax = 0;
        char max = 'A';
        for (int i = 0; i < counter.length; i++) {
            if(counter[i] == maxValue) {
                numOfMax++;
                max = (char) ('A' + i);
            }
        }

        System.out.println(numOfMax == 1 ? max : '?');
    }
}
